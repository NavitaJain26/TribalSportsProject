package com.techisquad.tribalsports;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class fgt_pass_activity extends AppCompatActivity {
    Button submit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fgt_pass_layout_activity);

        submit=findViewById(R.id.but_sub);

        submit.setOnClickListener(new View.OnClickListener(){                                  //register page
            @Override
            public void onClick(View view){
                Intent myIntent=new Intent(fgt_pass_activity.this,login.class);
                fgt_pass_activity.this.startActivity(myIntent);
            }
        });
    }
}
