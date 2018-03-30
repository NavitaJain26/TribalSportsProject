package com.techisquad.tribalsports;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class cntr_hd_activity extends AppCompatActivity {
    Button cntr_report;
    Button cntr_prf;
    Button cntr_feed;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cntr_hd_layout);

        cntr_report=findViewById(R.id.cntr_hd_rept);
        cntr_report.setOnClickListener(new View.OnClickListener(){
            @Override

            public void onClick(View view)
            {
                Intent myIntent=new Intent(cntr_hd_activity.this,cntr_rept_activity.class);        //intent on button
                cntr_hd_activity.this.startActivity(myIntent);
            }

        });
        cntr_prf=findViewById(R.id.cntr_hd_prof);
        cntr_prf.setOnClickListener(new View.OnClickListener(){
            @Override

            public void onClick(View view)
            {
                Intent myIntent=new Intent(cntr_hd_activity.this,cntr_hd_prf_activity.class);        //intent on button
                cntr_hd_activity.this.startActivity(myIntent);
            }

        });

        cntr_feed=findViewById(R.id.cntr_hd_feed);
        cntr_feed.setOnClickListener(new View.OnClickListener(){
            @Override

            public void onClick(View view)
            {
                Intent myIntent=new Intent(cntr_hd_activity.this,feedback_activity.class);        //intent on button
                cntr_hd_activity.this.startActivity(myIntent);
            }

        });
    }
}
