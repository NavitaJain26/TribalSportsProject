package com.techisquad.tribalsports;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class log_regis extends AppCompatActivity {
        Button lgn_btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.log_regis_);

        lgn_btn = findViewById(R.id.button1);

        lgn_btn.setOnClickListener(new View.OnClickListener(){                                  //forgot password page
            @Override
            public void onClick(View view){
                Intent myIntent=new Intent(log_regis.this,login.class);
                log_regis.this.startActivity(myIntent);
            }
        });
    }
}
