package com.techisquad.tribalsports;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class login extends AppCompatActivity {
    Button log_reg;
    Button fog_pwd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

        log_reg=findViewById(R.id.button2);
        fog_pwd=findViewById(R.id.button3);

        log_reg.setOnClickListener(new View.OnClickListener(){                                  //register page
            @Override
            public void onClick(View view){
                Intent myIntent=new Intent(login.this,log_regis.class);
                login.this.startActivity(myIntent);
            }
        });

        fog_pwd.setOnClickListener(new View.OnClickListener(){                                  //forgot password page
            @Override
            public void onClick(View view){
                Intent myIntent=new Intent(login.this,fgt_pass_activity.class);
                login.this.startActivity(myIntent);
            }
        });
    }
}
