package com.techisquad.tribalsports;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class cntr_rept_activity extends AppCompatActivity {

    Button cntr_compose;
    Button cntr_receive;
    Button cntr_sent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cntr_rept_layout);

        cntr_compose = findViewById(R.id.cntr_rept_comp);
        cntr_compose.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View view) {
                Intent myIntent = new Intent(cntr_rept_activity.this, cntr_rept_comp_activity.class);        //intent on button
                cntr_rept_activity.this.startActivity(myIntent);
            }

        });

        cntr_receive = findViewById(R.id.cntr_rept_rec);
        cntr_receive.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View view) {
                Intent myIntent = new Intent(cntr_rept_activity.this, cntr_rept_rec_activity.class);        //intent on button
                cntr_rept_activity.this.startActivity(myIntent);
            }

        });

        cntr_sent = findViewById(R.id.cntr_rept_sent);
        cntr_sent.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View view) {
                Intent myIntent = new Intent(cntr_rept_activity.this, cntr_rept_sent_activity.class);        //intent on button
                cntr_rept_activity.this.startActivity(myIntent);
            }

        });

    }
}