package com.techisquad.tribalsports;

import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class eligibility_pdf_activity extends AppCompatActivity {
    PDFView pdfviewer;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.eligibility_pdf_layout);

        pdfviewer = (PDFView) findViewById(R.id.pdfviewer);
         pdfviewer.fromAsset("mca.pdf").load();

       //new RetrievePDFStream().execute("http://ancestralauthor.com/download/mca.pdf");

    }
        class RetrievePDFStream extends AsyncTask<String,Void,InputStream>
        {

            @Override
            protected InputStream doInBackground(String...strings)
            {
                InputStream inputsream = null;
                try
                {
                    URL url = new URL(strings[0]);
                    HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();
                    if (urlConnection.getResponseCode() == 200)
                    {
                        inputsream = new BufferedInputStream(urlConnection.getInputStream());
                    }
                }
                catch (IOException e)
                {
                    return null;
                }
                return inputsream;
            }

            @Override
            protected void onPostExecute(InputStream inputStream)
            {
                pdfviewer.fromStream(inputStream).load();
            }
        }

    }
