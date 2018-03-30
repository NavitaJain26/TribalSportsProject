package com.techisquad.tribalsports;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class fld_ofcr_activity extends AppCompatActivity {

    Button verify;
    Button event;
    Button feed_fld;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fld_ofcr_layout);

       verify=findViewById(R.id.update1);
       verify.setOnClickListener(new View.OnClickListener(){
            @Override

            public void onClick(View view)
            {
                Intent myIntent=new Intent(fld_ofcr_activity.this,verify_trib_activity.class);        //intent on button
                fld_ofcr_activity.this.startActivity(myIntent);
            }

        });

        event=findViewById(R.id.fld_ofcr_event);
        event.setOnClickListener(new View.OnClickListener(){
            @Override

            public void onClick(View view)
            {
                Intent myIntent=new Intent(fld_ofcr_activity.this,events_details_activity.class);        //intent on button
                fld_ofcr_activity.this.startActivity(myIntent);
            }

        });

        feed_fld=findViewById(R.id.fld_ofcr_feed);
        feed_fld.setOnClickListener(new View.OnClickListener(){
            @Override

            public void onClick(View view)
            {
                Intent myIntent=new Intent(fld_ofcr_activity.this,feedback_activity.class);        //intent on button
                fld_ofcr_activity.this.startActivity(myIntent);
            }

        });
    }
}
