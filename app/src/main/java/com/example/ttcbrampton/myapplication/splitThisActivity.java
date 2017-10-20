package com.example.ttcbrampton.myapplication;

import android.support.v7.app.AppCompatActivity;

/**
 * Created by ttcbrampton on 2017-05-28.
 */

public class splitThisActivity extends AppCompatActivity{

    public static String[] splitThis(String string, char seperator){
        int count = 0;
        for (int cnt = 0; cnt < string.length(); cnt++){
            char currentChar = string.charAt(cnt);
            if (currentChar == seperator){
                count++;
            }
        }
        String[] array = new String[count];
        String buffer = "";
        count = 0;
        for (int cnt = 0; cnt < string.length(); cnt++){
            char currentChar = string.charAt(cnt);
            if (currentChar == seperator){
                array[count] = buffer;
                buffer = "";
                count++;
            }
            else{
                buffer+=currentChar;
            }

        }
        return array;
    }

}
