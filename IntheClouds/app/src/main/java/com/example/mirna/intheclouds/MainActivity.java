package com.example.mirna.intheclouds;

import android.content.Intent;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import java.util.Vector;

/**
 * Created by mirna on 9/16/2017.
 */

public class MainActivity extends LoginActivity{

    Button logging;
    Button stats;
    Button education;
    LinearLayout ll;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);

        Vector database =  new Vector<SleepEntry>();

        logging = new Button(this);
        logging.setText("Log Your Sleep");
        stats = new Button(this);
        stats.setText("Your Sleep Stats");
        education = new Button(this);
        education.setText("Sleeping Tips");
        ll = (LinearLayout)findViewById(R.id.main);
        ll.addView(logging);
        ll.addView(stats);
        ll.addView(education);

        logging.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), LoggingInfo.class);
                startActivity(i);
            }
        });
        stats.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent j = new Intent(getApplicationContext(), StatsInfo.class);
                startActivity(j);
            }
        });
        education.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent k = new Intent(getApplicationContext(), EducationMaterial.class);
                startActivity(k);
            }
        });
    }
}
