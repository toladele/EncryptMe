package com.example.ttcbrampton.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.TextView;

/**
 * Created by ttcbrampton on 2017-06-05.
 */

public class decryptB extends AppCompatActivity{
    public static long[] decryptThisToo(long[] longArray, long[] mathArray) {
        int cnt;
        for (cnt = 0; cnt < longArray.length; cnt++) {
            mathArray[cnt] = ((longArray[cnt] + 70) );

        }
        return mathArray;
    }
}
