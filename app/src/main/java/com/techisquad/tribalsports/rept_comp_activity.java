package com.techisquad.tribalsports;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class rept_comp_activity extends AppCompatActivity {
    Button trib_prog;
    Button request;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.rept_comp_layout);

        trib_prog=findViewById(R.id.comp_trib_prog);
        trib_prog.setOnClickListener(new View.OnClickListener(){
            @Override

            public void onClick(View view)
            {
                Intent myIntent=new Intent(rept_comp_activity.this,rept_comp_activity.class);        //intent on button
                rept_comp_activity.this.startActivity(myIntent);
            }

        });

        request=findViewById(R.id.comp_req);
        request.setOnClickListener(new View.OnClickListener(){
            @Override

            public void onClick(View view)
            {
                Intent myIntent=new Intent(rept_comp_activity.this,rept_comp_activity.class);        //intent on button
                rept_comp_activity.this.startActivity(myIntent);
            }

        });
    }

}
