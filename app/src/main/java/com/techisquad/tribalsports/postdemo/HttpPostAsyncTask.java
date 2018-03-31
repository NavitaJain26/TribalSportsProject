package com.techisquad.tribalsports.postdemo;

import android.os.AsyncTask;
import android.telecom.Call;
import android.util.Log;

import org.json.JSONObject;

import java.io.IOException;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import okhttp3.Callback;
import okhttp3.FormBody;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

public class HttpPostAsyncTask extends AsyncTask<String, Void, Void> {

    // This is the JSON body of the post
    Map<String, Object> postData;

    // This is a constructor that allows you to pass in the JSON body
    public HttpPostAsyncTask(Map<String, Object> postData) {
        if (postData != null) {
            this.postData = postData;
        }
    }

    // This is a function that we are overriding from AsyncTask. It takes Strings as parameters because that is what we defined for the parameters of our async task
    @Override
    protected Void doInBackground(String... params) {

        try {

            Log.d("Tag","POST");
            // avoid creating several instances, should be singleon
            //OkHttpClient client = new OkHttpClient();
            OkHttpClient client = new OkHttpClient.Builder()
                    .connectTimeout(30, TimeUnit.SECONDS)
                    .writeTimeout(30, TimeUnit.SECONDS)
                    .readTimeout(30, TimeUnit.SECONDS)
                    .build();

            HttpUrl.Builder urlBuilder = HttpUrl.parse(params[0]).newBuilder();

            Set<String> allparameterKeys = postData.keySet();
            for (String oneKey : allparameterKeys) {

                Object value = postData.get(oneKey);
                if (value instanceof String) {
                    String valueToSet = (String) value;
                    Log.d("Map :","Key : "+oneKey+ " : "+valueToSet );
                    urlBuilder.addQueryParameter(oneKey, valueToSet);
                }
            }


            String url = urlBuilder.build().toString();

            Request request = new Request.Builder()
                    .url(url)
                    .build();

            client.newCall(request).enqueue(new Callback() {


                @Override
                public void onFailure(okhttp3.Call call, IOException e) {
                    Log.d("TAG","onFaillure");
                    e.printStackTrace();
                }

                @Override
                public void onResponse(okhttp3.Call call, final Response response) throws IOException {
                    if (!response.isSuccessful()) {
                        throw new IOException("Unexpected code " + response);
                    } else {
                        Log.d("TAG", "Custom message");
                    }
                }

            });
        } catch (Exception e) {
            Log.d("TAG", "Exception occured");

        }


//        try {
//            // This is getting the url from the string we passed in
//            URL url = new URL(params[0]);
//
//            // Create the urlConnection
//            HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();
//
//
//            urlConnection.setDoInput(true);
//            urlConnection.setDoOutput(true);
//
//            urlConnection.setRequestProperty("Content-Type", "application/json");
//
//            urlConnection.setRequestMethod("POST");
//
//
//            // OPTIONAL - Sets an authorization header
//            urlConnection.setRequestProperty("Authorization", "someAuthString");
//
//            // Send the post body
//            if (this.postData != null) {
//                OutputStreamWriter writer = new OutputStreamWriter(urlConnection.getOutputStream());
//                writer.write(postData.toString());
//                writer.flush();
//            }
//
//            int statusCode = urlConnection.getResponseCode();
//
//            if (statusCode ==  200) {
//
//                InputStream inputStream = new BufferedInputStream(urlConnection.getInputStream());
//
//                String response = convertInputStreamToString(inputStream);
//
//                // From here you can convert the string to JSON with whatever JSON parser you like to use
//
//                // After converting the string to JSON, I call my custom callback. You can follow this process too, or you can implement the onPostExecute(Result) method
//
//            } else {
//                // Status code is not 200
//                // Do something to handle the error
//            }
//
//        } catch (Exception e) {
//            Log.d(TAG, e.getLocalizedMessage());
//        }
        return null;
    }
}