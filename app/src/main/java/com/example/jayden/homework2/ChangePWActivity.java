package com.example.jayden.homework2;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class ChangePWActivity extends AppCompatActivity {

    EditText newPass;
    Button btnOK;
    Button btnCancel;
    SharedPreferences setting;
    SharedPreferences.Editor editor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_change_pw);

        //connect java with xml
        newPass = (EditText) findViewById(R.id.newPass);
        btnOK = (Button) findViewById(R.id.btnOK);
        btnCancel = (Button) findViewById(R.id.btnCancel);
    }

    public void onButtonClick(View v) {
        if (((Button) v).getText().toString().compareTo("Okay") == 0) {
            String temp;
            temp = newPass.getText().toString();
            if (temp.length() < 4) { // check how many numbers are inputted in the editText
                // fail to input
                Toast.makeText(this, "Wrong input (4-digit)", Toast.LENGTH_SHORT);
            } else {
                // all number is inputted
                setting = getSharedPreferences("password", Context.MODE_PRIVATE);
                editor = setting.edit();

                //change password
                editor.remove("pw");
                editor.putString("pw", temp);
                editor.commit();
            }
            finish();
        }
        // cancel password changing
        else if(((Button) v).getText().toString().compareTo("Cancel") == 0) {
            finish();
        }
    }
}
