package com.example.jayden.homework2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MiniCalculator extends AppCompatActivity implements View.OnClickListener {


    double result = 0;
    String displayStr = "";
    TextView display;
    Button current = null;
    Boolean canInputNumber = true;
    Button num0, num1, num2, num3, num4, num5, num6, num7, num8, num9, plus, sub, divide, multi, clear, equal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mini_calculator);
        // connecting java variable with XML component and making this variable event handler.
        display = (TextView) findViewById(R.id.textView);
        num0 = (Button)findViewById(R.id.num0);
        num0.setOnClickListener(this);
        num1 = (Button)findViewById(R.id.num1);
        num1.setOnClickListener(this);
        num2 = (Button)findViewById(R.id.num2);
        num2.setOnClickListener(this);
        num3 = (Button)findViewById(R.id.num3);
        num3.setOnClickListener(this);
        num4 = (Button)findViewById(R.id.num4);
        num4.setOnClickListener(this);
        num5 = (Button)findViewById(R.id.num5);
        num5.setOnClickListener(this);
        num6 = (Button)findViewById(R.id.num6);
        num6.setOnClickListener(this);
        num7 = (Button)findViewById(R.id.num7);
        num7.setOnClickListener(this);
        num8 = (Button)findViewById(R.id.num8);
        num8.setOnClickListener(this);
        num9 = (Button)findViewById(R.id.num9);
        num9.setOnClickListener(this);
        plus = (Button)findViewById(R.id.plus);
        plus.setOnClickListener(this);
        sub = (Button)findViewById(R.id.sub);
        sub.setOnClickListener(this);
        multi = (Button)findViewById(R.id.multiple);
        multi.setOnClickListener(this);
        divide = (Button)findViewById(R.id.divide);
        divide.setOnClickListener(this);
        clear = (Button)findViewById(R.id.clear);
        clear.setOnClickListener(this);
        equal = (Button)findViewById(R.id.equal);
        equal.setOnClickListener(this);
    }

    public void onClick(View v) {
        switch (v.getId()) {
            //<number part>
            case R.id.num0:
                if (canInputNumber == false)     //exception handling
                    break;
                if (displayStr.compareTo("0") != 0) {    //exception handling
                    displayStr = displayStr + "0";
                }
                display.setText(displayStr);
                break;
            case R.id.num1:
                if (canInputNumber == false)     //exception handling
                    break;
                if (displayStr.compareTo("0") != 0) {    //exception handling
                    displayStr = displayStr + "1";
                } else {
                    displayStr = "1";
                }
                display.setText(displayStr);
                break;
            case R.id.num2:
                if (canInputNumber == false)     //exception handling
                    break;
                if (displayStr.compareTo("0") != 0) {    //exception handling
                    displayStr = displayStr + "2";
                } else {
                    displayStr = "2";
                }
                display.setText(displayStr);
                break;
            case R.id.num3:
                if (canInputNumber == false)     //exception handling
                    break;
                if (displayStr.compareTo("0") != 0) {    //exception handling
                    displayStr = displayStr + "3";
                } else {
                    displayStr = "3";
                }
                display.setText(displayStr);
                break;
            case R.id.num4:
                if (canInputNumber == false)     //exception handling
                    break;
                if (displayStr.compareTo("0") != 0) {    //exception handling
                    displayStr = displayStr + "4";
                } else {
                    displayStr = "4";
                }
                display.setText(displayStr);
                break;
            case R.id.num5:
                if (canInputNumber == false)     //exception handling
                    break;
                if (displayStr.compareTo("0") != 0) {    //exception handling
                    displayStr = displayStr + "5";
                } else {
                    displayStr = "5";
                }
                display.setText(displayStr);
                break;
            case R.id.num6:
                if (canInputNumber == false)     //exception handling
                    break;
                if (displayStr.compareTo("0") != 0) {    //exception handling
                    displayStr = displayStr + "6";
                } else {
                    displayStr = "6";
                }
                display.setText(displayStr);
                break;
            case R.id.num7:
                if (canInputNumber == false)     //exception handling
                    break;
                if (displayStr.compareTo("0") != 0) {    //exception handling
                    displayStr = displayStr + "7";
                } else {
                    displayStr = "7";
                }
                display.setText(displayStr);
                break;
            case R.id.num8:
                if (canInputNumber == false)     //exception handling
                    break;
                if (displayStr.compareTo("0") != 0) {    //exception handling
                    displayStr = displayStr + "8";
                } else {
                    displayStr = "8";
                }
                display.setText(displayStr);
                break;
            case R.id.num9:
                if (canInputNumber == false)     //exception handling
                    break;
                if (displayStr.compareTo("0") != 0) {    //exception handling
                    displayStr = displayStr + "9";
                } else {
                    displayStr = "9";
                }
                display.setText(displayStr);
                break;
            //<operation part>
            case R.id.plus:
                if (current != null) {
                    if (displayStr.compareTo("") == 0) {     //exception handling
                        current = (Button) v;
                        break;
                    } else {
                        equal();
                        current = (Button) v;
                        canInputNumber = true;
                        break;
                    }
                }
                current = (Button) v;
                if (displayStr.compareTo("") != 0)   //exception handling
                    result = Double.parseDouble(displayStr);
                displayStr = "";
                canInputNumber = true;
                break;
            case R.id.sub:
                if (current != null) {
                    if (displayStr.compareTo("") == 0) {     //exception handling
                        current = (Button) v;
                        break;
                    } else {
                        equal();
                        current = (Button) v;
                        canInputNumber = true;
                        break;
                    }
                }
                current = (Button) v;
                if (displayStr.compareTo("") != 0)   //exception handling
                    result = Double.parseDouble(displayStr);
                displayStr = "";
                canInputNumber = true;
                break;
            case R.id.multiple:
                if (current != null) {   //exception handling
                    if (displayStr.compareTo("") == 0) {
                        current = (Button) v;
                        break;
                    } else {
                        equal();
                        current = (Button) v;
                        canInputNumber = true;
                        break;
                    }
                }
                current = (Button) v;
                if (displayStr.compareTo("") != 0)   //exception handling
                    result = Double.parseDouble(displayStr);
                displayStr = "";
                canInputNumber = true;
                break;
            case R.id.divide:
                if (current != null) {   //exception handling
                    if (displayStr.compareTo("") == 0) {
                        current = (Button) v;
                        break;
                    } else {
                        equal();
                        current = (Button) v;
                        canInputNumber = true;
                        break;
                    }
                }
                current = (Button) v;
                if (displayStr.compareTo("") != 0)   //exception handling
                    result = Double.parseDouble(displayStr);
                displayStr = "";
                canInputNumber = true;
                break;
            case R.id.clear:    //clear all values.
                displayStr = "0";
                display.setText(displayStr);
                result = 0;
                canInputNumber = true;
                break;
            case R.id.equal:
                equal();
                break;
        }
    }
    // show you the result
    public void equal() {
        if (current != null && displayStr.compareTo("")!=0) {   //exception handling
            // main calculating
            if (current.getId() == R.id.plus) {
                result = result + Double.parseDouble(displayStr);
            } else if (current.getId() == R.id.sub) {
                result = result - Double.parseDouble(displayStr);
            } else if (current.getId() == R.id.multiple) {
                result = result * Double.parseDouble(displayStr);
            } else if (current.getId() == R.id.divide) {
                result = result / Double.parseDouble(displayStr);
            }
            displayStr = "" + result;
            display.setText(displayStr);
            result = Double.parseDouble(displayStr);
            current = null;
            canInputNumber = false;
            displayStr = "";
            // send the result to the information activity
            Intent intent = getIntent();
            intent.putExtra("result",result);
            setResult(RESULT_OK,intent);
            finish();
        }
    }
}

