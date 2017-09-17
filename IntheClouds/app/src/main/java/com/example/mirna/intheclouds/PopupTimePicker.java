package com.example.mirna.intheclouds;

import android.content.Intent;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.Button;
import android.widget.TimePicker;

/**
 * Created by HY on 2017-09-16.
 */

public class PopupTimePicker extends LoggingInfo {
    Button close;
    TimePicker timePicker;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.popuptimepicker);
        DisplayMetrics dm = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);

        int width = dm.widthPixels;
        int height = dm.heightPixels;
        close = (Button) findViewById(R.id.closePopupTimeClicker);
        timePicker = (TimePicker) findViewById(R.id.timePickerGeneral);
        getWindow().setLayout((int)(width*0.8), (int)(height*0.6));

        close.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               //Intent j = new Intent(getApplicationContext(), LoggingInfo.class);
               //startActivity(j);

                //SleepEntry se = new SleepEntry();
                se.intoBed = se.getTime(timePicker.getHour(), timePicker.getMinute());
                System.out.println("TimePicker Value in popup: "+se.intoBed);

                finish();
            }
        });
    }
}
