package com.techisquad.tribalsports;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

public class update_trib_activity extends AppCompatActivity {
    Button submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.update_trib_layout);


        Spinner myspinner=(Spinner) findViewById(R.id.spinner1);        //spinner

        ArrayAdapter<String> myAdapter=new ArrayAdapter<String>(update_trib_activity.this,android.R.layout.simple_list_item_1,getResources().getStringArray(R.array.status));

        myAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        myspinner.setAdapter(myAdapter);

        submit=findViewById(R.id.submit1);
        submit.setOnClickListener(new View.OnClickListener(){
            @Override

            public void onClick(View view)
            {
                Intent myIntent=new Intent(update_trib_activity.this,events_details_activity.class);        //intent on button
                update_trib_activity.this.startActivity(myIntent);
            }

        });




    }
}
