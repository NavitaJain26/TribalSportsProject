package com.techisquad.tribalsports;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class dist_hd_rept_activity extends AppCompatActivity {

    Button dist_hd_compose;
    Button dist_hd_receive;
    Button dist_hd_sent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dist_hd_rept_layout);

        dist_hd_compose = findViewById(R.id.dist_hd_rept_comp);
        dist_hd_compose.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View view) {
                Intent myIntent = new Intent(dist_hd_rept_activity.this, dist_rept_comp_activity.class);        //intent on button
                dist_hd_rept_activity.this.startActivity(myIntent);
            }

        });

        dist_hd_receive = findViewById(R.id.dist_hd_rept_rec);
        dist_hd_receive.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View view) {
                Intent myIntent = new Intent(dist_hd_rept_activity.this, dist_rept_rec_activity.class);        //intent on button
                dist_hd_rept_activity.this.startActivity(myIntent);
            }

        });

        dist_hd_sent = findViewById(R.id.dist_hd_rept_sent);
        dist_hd_sent.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View view) {
                Intent myIntent = new Intent(dist_hd_rept_activity.this, dist_rept_sent_activity.class);        //intent on button
                dist_hd_rept_activity.this.startActivity(myIntent);
            }

        });

    }
}
