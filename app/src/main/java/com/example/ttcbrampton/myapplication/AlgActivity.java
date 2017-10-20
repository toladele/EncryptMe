package com.example.ttcbrampton.myapplication;

import android.support.v7.app.AppCompatActivity;

/**
 * Created by ttcbrampton on 2017-05-18.
 */

public class AlgActivity extends AppCompatActivity {
    public static String AlgA(String x){
        int cnt;

        char[] charArray = x.toCharArray();
        String buffer = "";
        for ( cnt = 0; cnt < charArray.length; cnt++ ) {

            int ascii = (int) charArray[cnt];
            x = String.valueOf( ascii );

            int xTemp = Integer.parseInt(x);
            xTemp = (xTemp * 24) + 8;
            x = ""+xTemp;
            buffer = buffer + "." + xTemp;
        }
        return(buffer + ".");
    }

    public static String AlgB(String x){
        int cnt;

        char[] charArray = x.toCharArray();
        String buffer = "";
        for ( cnt = 0; cnt < charArray.length; cnt++ ) {

            int ascii = (int) charArray[cnt];
            x = String.valueOf( ascii );

            int xTemp = Integer.parseInt(x);
            xTemp = (xTemp - 70);
            x = ""+xTemp;
            buffer = buffer + "_" + xTemp;
        }
        return(buffer + "_");
    }

    public static String AlgC(String x){

        int cnt;

        char[] charArray = x.toCharArray();
        String buffer = "";
        for ( cnt = 0; cnt < charArray.length; cnt++ ) {

            int ascii = (int) charArray[cnt];
            x = String.valueOf( ascii );

            int xTemp = Integer.parseInt(x);
            xTemp = (((xTemp * 3) - 243) * 7) ;
            x = ""+xTemp;
            buffer = buffer + "!" + xTemp;
        }
        return(buffer + "!");
    }
}
