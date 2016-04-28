package com.example.jayden.homework2;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class InfoMiniCalculator extends AppCompatActivity implements View.OnClickListener {

    Button run;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info_mini_calculator);
        run = (Button)findViewById(R.id.minibutton);
        run.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        // for getting reasult from MiniCalculator It has request code
        startActivityForResult(new Intent(this, MiniCalculator.class), 301);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        try {
            // use requestCode to find out who is talking back to us
            switch (requestCode){
                case (301): {
                    // if result is ok
                    if (resultCode == Activity.RESULT_OK) {
                        // get result from MiniCalculator and show it using Toast
                        double result = data.getDoubleExtra("result",0.0);
                        Toast.makeText(getApplicationContext(), "Result : " + result,Toast.LENGTH_SHORT).show();
                    }
                    else {
                        //user pressed the BACK button
                        Toast.makeText(this,"result is canceled",Toast.LENGTH_SHORT).show();
                    }
                    break;
                }
            }//switch
        }
        catch (Exception e) {
            Toast.makeText(getBaseContext(), e.getMessage(), Toast.LENGTH_LONG).show();
        }
    }// onActivityResult
}
