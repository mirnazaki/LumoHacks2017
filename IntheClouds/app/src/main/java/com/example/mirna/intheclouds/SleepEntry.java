package com.example.mirna.intheclouds;

import java.util.Vector;

/**
 * Created by HY on 2017-09-16.
 */

public class SleepEntry {

    //String Date = Calendar.getInstance().getTime().toString();

    //To convert user input to mins
    public int getTime(int hours, int mins){
        int result = hours*60 + mins;
        System.out.print("POO R: "+ result);
        return result;
    }

    int intoBed = -1; //this one

    int trySleep = -1;

    int fallAsleep = -1;

//    Vector database =  new Vector<SleepEntry>();

    //To create entry object
    //SleepEntry entry = new SleepEntry();

}