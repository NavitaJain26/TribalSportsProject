package com.techisquad.tribalsports;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

public class verify_trib_activity extends AppCompatActivity {
    Button update_but;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.verify__trib_layout);

        Spinner myspinner=(Spinner) findViewById(R.id.spinner1);        //spinner

        ArrayAdapter<String> myAdapter=new ArrayAdapter<String>(verify_trib_activity.this,android.R.layout.simple_list_item_1,getResources().getStringArray(R.array.status));

        myAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        myspinner.setAdapter(myAdapter);

        update_but=findViewById(R.id.update1);
        update_but.setOnClickListener(new View.OnClickListener(){
            @Override

            public void onClick(View view)
            {
                Intent myIntent=new Intent(verify_trib_activity.this,update_trib_activity.class);        //intent on button
                verify_trib_activity.this.startActivity(myIntent);
            }

        });
    }
}
