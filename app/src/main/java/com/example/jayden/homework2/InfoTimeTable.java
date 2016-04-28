package com.example.jayden.homework2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class InfoTimeTable extends AppCompatActivity implements View.OnClickListener {

    Button run;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info_time_table);
        run = (Button)findViewById(R.id.tablebutton);
        run.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        //run timetable
        startActivity(new Intent(this, TimeTable.class));
    }
}
