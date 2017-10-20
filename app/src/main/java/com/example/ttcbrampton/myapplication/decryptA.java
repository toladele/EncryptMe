package com.example.ttcbrampton.myapplication;

import android.support.v7.app.AppCompatActivity;


/**
 * Created by ttcbrampton on 2017-06-05.
 */

public class decryptA extends AppCompatActivity{
    public static long[] decryptThis(long[] longArray, long[] mathArray){
        int cnt;
        for (cnt = 0; cnt < longArray.length; cnt++){
            mathArray[cnt] = ((longArray[cnt] - 8) / 24);

        }
        return mathArray;
    }

}
