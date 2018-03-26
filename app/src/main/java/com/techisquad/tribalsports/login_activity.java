package com.techisquad.tribalsports;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class login_activity extends AppCompatActivity {
    Button mybutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.login_layout);
        mybutton=findViewById(R.id.but1);
        mybutton.setOnClickListener(new View.OnClickListener(){
            @Override

            public void onClick(View view)
            {
                Intent myIntent=new Intent(login_activity.this,verify_trib_activity.class);        //intent on button
                login_activity.this.startActivity(myIntent);
            }

        });
    }
}
