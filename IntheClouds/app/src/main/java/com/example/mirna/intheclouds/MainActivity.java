package com.example.mirna.intheclouds;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

/**
 * Created by mirna on 9/16/2017.
 */

public class MainActivity extends LoginActivity{

    Button logging;
    LinearLayout ll;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);

        logging = new Button(this);

        ll = (LinearLayout)findViewById(R.id.main);

        ll.addView(logging);


        logging.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), LoggingInfo.class);
                startActivity(i);
            }
        });
    }
}
