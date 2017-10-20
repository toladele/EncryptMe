package com.example.ttcbrampton.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


import static com.example.ttcbrampton.myapplication.R.id.decOutput;
import static com.example.ttcbrampton.myapplication.splitThisActivity.splitThis;

/**
 * Created by ttcbrampton on 2017-05-17.
 */

public class decryptNow extends AppCompatActivity {
    static String TAG = "DecryptActivity";
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_decrypt);

        Button decSubmit =(Button)(findViewById(R.id.decSubmit));
        decSubmit.setOnClickListener(new View.OnClickListener() {
            String TAG = "DecryptActivity";
            @Override
            public void onClick(View v) {

                splitThisActivity getSplit = new splitThisActivity();
                decryptB getDecryptB = new decryptB();
                decryptA getDecryptA = new decryptA();
                decryptC getDecryptC = new decryptC();

                int cnt;
                int whichOne;

                EditText decInput = (EditText) (findViewById(R.id.decInput));
                String strIn = decInput.getText().toString();
                String[] strOut;

                if (strIn.startsWith("_")){
                    whichOne = 2;
                    strOut = getSplit.splitThis(strIn, '_');
                }
                else if (strIn.startsWith("!")){
                    whichOne = 1;
                    strOut = getSplit.splitThis(strIn, '!');
                }
                else {
                    whichOne = 3;
                    strOut = getSplit.splitThis(strIn, '.');
                }

                Log.i(TAG, "Error here");

                long[] longArray =new long[strOut.length];

                try{
                    for (cnt = 1; cnt < strOut.length; cnt++){

                        longArray[cnt]=Long.parseLong(strOut[cnt]);

                    }
                }
                catch(NumberFormatException e){

                  TextView decError = (TextView)(findViewById(R.id.decError));
                   decError.setText("Bad input. Please try again.");

                    //onCreate(new Bundle());

                }

                long[] mathArray = new long[longArray.length];
                Log.i(TAG, "Error here 2");

                if (whichOne == 3) {
                    mathArray = getDecryptA.decryptThis(longArray, mathArray);
                }
                else if (whichOne == 2){
                    mathArray = getDecryptB.decryptThisToo(longArray, mathArray);
                }
                else {
                    mathArray = getDecryptC.decryptThisThree(longArray, mathArray);
                }

                char[] charArray = new char[mathArray.length];

                TextView decOutput = (TextView)(findViewById(R.id.decOutput));
                decOutput.setTextIsSelectable(true);

                for (cnt = 1; cnt < charArray.length; cnt++) {

                    charArray[cnt] = (char) mathArray[cnt];

                    Log.i(TAG, "Error here 3");
                }

                    String print = "";
                    for(Character s : charArray) {
                        print += s;
                    }
                    decOutput.setText("Your phrase is: " + print);
                }
            });

            };

        }









