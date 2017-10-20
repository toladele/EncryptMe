package com.example.ttcbrampton.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

/**
 * Created by ttcbrampton on 2017-05-17.
 */

public class encryptNow extends AppCompatActivity{

    static String TAG = "encryptActivity";

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_encrypt);

        Button encSubmit =(Button)(findViewById(R.id.encSubmit));
        encSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                EditText encInput =(EditText)(findViewById(R.id.decInput));
                String strInput = encInput.getText().toString();

                AlgActivity getAlg = new AlgActivity();

                int maximum = 3;
                int minimum = 1;
                Random rn = new Random();
                int range = maximum - minimum + 1;
                int randomNum = rn.nextInt(range) + minimum;

                Log.i(TAG, "App chose number " + randomNum);

  /* 3, 6, 9*/   if (randomNum==3){
                    strInput = getAlg.AlgA(strInput);
                }
  /*2, 4, 8*/   else if (randomNum==2){
                     strInput = getAlg.AlgB(strInput);
                }
  /*1, 5, 7*/   else{
                    strInput = getAlg.AlgC(strInput);
                }

                TextView encOutput =(TextView)(findViewById(R.id.encOutput));
                encOutput.setText("Here is your encrypted phrase: " + "" + strInput);
                encOutput.setTextIsSelectable(true);


            }
        });
    }

}
