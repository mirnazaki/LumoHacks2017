package com.example.mirna.intheclouds;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


import android.content.Intent;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TimePicker;

/**
 * Created by cubefreak716 on 2017-09-16.
 */

public class LoggingInfo extends MainActivity{
  //  TimePicker timePicker;
    public SleepEntry se;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.logginginfo2);

        se = new SleepEntry();

        //  timePicker = (TimePicker) findViewById(R.id.timePickerGeneral);
        Button b = (Button) findViewById(R.id.setIntoBed);

        System.out.println("TimePicker Value in logging info page: "+se.intoBed);
        if(se.intoBed != -1)
            b.setText(se.intoBed);

       // se.intoBed = se.getTime(timePicker.getHour(), timePicker.getMinute());

        b.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), PopupTimePicker.class);
                startActivity(i);

            }
        });

    }

    @Override
    public void onResume(){
        super.onResume();

        Button b = (Button) findViewById(R.id.setIntoBed);
        System.out.println("TimePicker Value in logging info page in RESUME: "+se.intoBed);
        if(se.intoBed != -1)
            b.setText(se.intoBed);

    }

}
