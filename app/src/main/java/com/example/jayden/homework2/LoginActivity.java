package com.example.jayden.homework2;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    EditText pass1;
    EditText pass2;
    EditText pass3;
    EditText pass4;
    SharedPreferences setting;
    SharedPreferences.Editor editor;
    String nowPassword;

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        //connecting elements
        pass1 = (EditText)findViewById(R.id.pass1);
        pass2 = (EditText)findViewById(R.id.pass2);
        pass3 = (EditText)findViewById(R.id.pass3);
        pass4 = (EditText)findViewById(R.id.pass4);

        //use sharedPreferences
        setting = getSharedPreferences("password", Context.MODE_PRIVATE);
        editor = setting.edit();

        if(setting.contains("pw")) {
            // bring current password from sharedPreferences
            nowPassword = setting.getString("pw","0000");
        }
        else {
            // When you start this app first. set initial password.
            editor.putString("pw","0000");
            editor.commit();
            nowPassword = setting.getString("pw","0000");
        }

        pass4.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
            }

            @Override
            public void afterTextChanged(Editable s) {
                if ((pass1.getText().toString()).compareTo("") != 0 && (pass2.getText().toString()).compareTo("") != 0 && (pass3.getText().toString()).compareTo("") != 0) {
                    String inputData;
                    inputData = "" + pass1.getText().toString() + pass2.getText().toString() + pass3.getText().toString() + pass4.getText().toString();
                    if(inputData.compareTo(nowPassword)==0) {  // correct password
                        startActivity(new Intent(LoginActivity.this, MainActivity.class));
                        finish();
                    }
                    else {
                        // fail to pass it because of wrong password
                        Toast.makeText(LoginActivity.this, "Wrong password", Toast.LENGTH_SHORT).show();
                        finish();
                        startActivity(getIntent());
                    }
                } else {
                    // if it is not enough to check password
                    Toast.makeText(LoginActivity.this, "There are some empty space", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
