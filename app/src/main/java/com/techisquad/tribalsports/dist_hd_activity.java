package com.techisquad.tribalsports;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class dist_hd_activity extends AppCompatActivity {


    Button dis_hd_report;
    Button dist_event;
    Button dist_profile;
    Button dist_feed;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dist_hd_layout);

        dis_hd_report = findViewById(R.id.dist_hd_rept);
        dis_hd_report.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View view) {
                Intent myIntent = new Intent(dist_hd_activity.this, dist_hd_rept_activity.class);        //intent on button
                dist_hd_activity.this.startActivity(myIntent);
            }

        });
        dist_event=findViewById(R.id.dist_hd_event);
        dist_event.setOnClickListener(new View.OnClickListener(){
            @Override

            public void onClick(View view)
            {
                Intent myIntent=new Intent(dist_hd_activity.this,events_input_activity.class);        //intent on button
                dist_hd_activity.this.startActivity(myIntent);
            }

        });

        dist_profile=findViewById(R.id.dist_hd_prof);
        dist_profile.setOnClickListener(new View.OnClickListener(){
            @Override

            public void onClick(View view)
            {
                Intent myIntent=new Intent(dist_hd_activity.this,dist_hd_prf_activity.class);        //intent on button
                dist_hd_activity.this.startActivity(myIntent);
            }

        });

        dist_feed=findViewById(R.id.dist_hd_feed);
        dist_feed.setOnClickListener(new View.OnClickListener(){
            @Override

            public void onClick(View view)
            {
                Intent myIntent=new Intent(dist_hd_activity.this,feedback_activity.class);        //intent on button
                dist_hd_activity.this.startActivity(myIntent);
            }

        });
    }
}