package com.techisquad.tribalsports;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class events_details_activity extends AppCompatActivity {
    Button download;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.events_details_layout);

        download=findViewById(R.id.down1);
        download.setOnClickListener(new View.OnClickListener(){
            @Override

            public void onClick(View view)
            {
                Intent myIntent=new Intent(events_details_activity.this,eligibility_pdf_activity.class);        //intent on button
                events_details_activity.this.startActivity(myIntent);
            }

        });


    }
}
