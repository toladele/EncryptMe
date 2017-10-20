package com.example.ttcbrampton.myapplication;

import android.support.v7.app.AppCompatActivity;

/**
 * Created by ttcbrampton on 2017-06-05.
 */

public class decryptC extends AppCompatActivity{
    public static long[] decryptThisThree(long[] longArray, long[] mathArray){
        int cnt;
        for (cnt = 0; cnt < longArray.length; cnt++) {
            mathArray[cnt] =  (((longArray[cnt] / 7) + 243) / 3);
        }
        return mathArray;
    }
}
