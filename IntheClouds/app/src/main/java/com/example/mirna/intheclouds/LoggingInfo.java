package com.example.mirna.intheclouds;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import android.view.LayoutInflater;
import android.content.Context;
import android.app.AlertDialog;
import android.content.DialogInterface;


import android.content.Intent;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.LinearLayout;
import android.widget.TimePicker;
import com.example.mirna.intheclouds.PopupTimePicker;

import org.w3c.dom.Text;

/**
 * Created by cubefreak716 on 2017-09-16.
 */

public class LoggingInfo extends MainActivity{
  //  TimePicker timePicker;
    public SleepEntry se;
    int pooHour;
    int pooMin;
    final Context context = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.logginginfo2);

        se = new SleepEntry();
        final TextView t1 = (TextView)findViewById(R.id.intoBed);

        //  timePicker = (TimePicker) findViewById(R.id.timePickerGeneral);
        Button b = (Button) findViewById(R.id.setIntoBed);

        System.out.println("TimePicker Value in logging info page: "+se.intoBed);
        if(se.intoBed != -1)
            b.setText(se.intoBed);

       // se.intoBed = se.getTime(timePicker.getHour(), timePicker.getMinute());

        b.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                //Intent i = new Intent(getApplicationContext(), PopupTimePicker.class);
                //startActivity(i);
                LayoutInflater li = LayoutInflater.from(context);
                View promptsView = li.inflate(R.layout.popuptimepicker, null);

                AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(context);

                //set popuptimepicker.xml to alertdialog builder
                alertDialogBuilder.setView(promptsView);

                final TimePicker userI = (TimePicker)promptsView.findViewById(R.id.timePickerGeneral);

                //set dialog message
                alertDialogBuilder
                        .setCancelable(false)
                        .setPositiveButton("OK",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog,int id) {
                                        // get user input and set it to result
                                        // edit text
                                        System.out.print("First poop");
                                        pooHour= userI.getHour();
                                        pooMin = userI.getMinute();

                                        t1.setText("Poo "+se.getTime(pooHour,pooMin));
                                    }
                                })
                        .setNegativeButton("Cancel",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog,int id) {
                                        System.out.print("Cancel Poop");
                                        dialog.cancel();
                                    }
                                });

                // create alert dialog
                AlertDialog alertDialog = alertDialogBuilder.create();

                // show it
                alertDialog.show();

                System.out.print(pooHour);
            }
        });

    }


    /*
    @Override
    public void onResume(){
        super.onResume();
        //System.out.println("TimePicker Value in logging info page in RESUMEFF: "+poo);
        Button b = (Button) findViewById(R.id.setIntoBed);
        //System.out.println("TimePicker Value in logging info page in RESUME: "+se.intoBed);
        //if(se.intoBed != -1)
            //b.setText(pooHour);
        System.out.print(pooHour);
    }
    */
}
