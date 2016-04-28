package com.example.jayden.homework2;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import java.util.Calendar;

public class TimeTable extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_time_table);
    }

    @Override
    protected void onStart() {
        Context context = getApplicationContext();
        super.onStart();

        View[] dArray = new View[7];        // make array for getting Views which contain title of day of week

        /*
        Connecting Xml with java using findViewById()
        */
        dArray[2] = (View)findViewById(R.id.d2);
        dArray[3] = (View)findViewById(R.id.d3);
        dArray[4] = (View)findViewById(R.id.d4);
        dArray[5] = (View)findViewById(R.id.d5);
        dArray[6] = (View)findViewById(R.id.d6);

        Calendar oCalendar = Calendar.getInstance();    // using Calendar Class for getting information about current time.
        View layout;
        switch (oCalendar.get(Calendar.DAY_OF_WEEK)) {      // according to day of week, It gives highlight to layout of this day.
            case 2:
                layout = (View) findViewById(R.id.mon);
                layout.setAlpha((float) 0.8);
                dArray[2].setBackgroundColor(0xffffeb3b);
                break;
            case 3:
                layout = (View) findViewById(R.id.tues);
                layout.setAlpha((float) 0.8);
                dArray[3].setBackgroundColor(0xffffeb3b);
                break;
            case 4:
                layout = (View) findViewById(R.id.wednes);
                layout.setAlpha((float) 0.8);
                dArray[4].setBackgroundColor(0xffffeb3b);
                break;
            case 5:
                layout = (View) findViewById(R.id.thurs);
                layout.setAlpha((float) 0.8);
                dArray[5].setBackgroundColor(0xffffeb3b);
                break;
            case 6:
                layout = (View) findViewById(R.id.fri);
                layout.setAlpha((float) 0.8);
                dArray[6].setBackgroundColor(0xffffeb3b);
                break;
            /*
            exception control : If current time is sunday or saturday or if It can't get correct information about day of week,
                                It make Toast for informing that situation.
             */
            default:
                Toast.makeText(context, "현재 주말이거나 네트워크가 연결되지 않았습니다.", Toast.LENGTH_SHORT).show();
                break;
        }
        oCalendar = null;
    }
}
