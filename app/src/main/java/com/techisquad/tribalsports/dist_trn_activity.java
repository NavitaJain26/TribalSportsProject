package com.techisquad.tribalsports;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class dist_trn_activity extends AppCompatActivity {
    Button dis_report;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dist_trn_layout);

        dis_report=findViewById(R.id.dist_trn_rept);
        dis_report.setOnClickListener(new View.OnClickListener(){
            @Override

            public void onClick(View view)
            {
                Intent myIntent=new Intent(dist_trn_activity.this,rept_activity.class);        //intent on button
                dist_trn_activity.this.startActivity(myIntent);
            }

        });
    }
}
