package com.techisquad.tribalsports;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class rept_activity extends AppCompatActivity {
    Button compose;
    Button receive;
    Button sent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.rept_layout);

        compose=findViewById(R.id.dist_rept_comp);
        compose.setOnClickListener(new View.OnClickListener(){
            @Override

            public void onClick(View view)
            {
                Intent myIntent=new Intent(rept_activity.this,rept_comp_activity.class);        //intent on button
                rept_activity.this.startActivity(myIntent);
            }

        });

        receive=findViewById(R.id.dist_rept_rec);
        receive.setOnClickListener(new View.OnClickListener(){
            @Override

            public void onClick(View view)
            {
                Intent myIntent=new Intent(rept_activity.this,rept_rec_activity.class);        //intent on button
                rept_activity.this.startActivity(myIntent);
            }

        });

        sent=findViewById(R.id.dist_rept_sent);
       sent.setOnClickListener(new View.OnClickListener(){
            @Override

            public void onClick(View view)
            {
                Intent myIntent=new Intent(rept_activity.this,rept_sent_activity.class);        //intent on button
                rept_activity.this.startActivity(myIntent);
            }

        });





    }




}
