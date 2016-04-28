package com.example.jayden.homework2;

import android.app.ListActivity;
import android.database.DataSetObserver;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<Item> items;
    ItemAdapter adapter;
    ListView list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        list = (ListView)findViewById(R.id.listView);
        items = new ArrayList<Item>();
        // add items.
        items.add(new Item("Time Table", "@drawable/timetable", "It shows your time table."));
        items.add(new Item("Tip Calculator","@drawable/tip","It calculates tip easily."));
        items.add(new Item("Mini Calculator", "@drawable/calcul", "It is simple mini calculator."));
        items.add(new Item("Change Password", "@drawable/lock", "It changes your password"));

        adapter = new ItemAdapter(MainActivity.this, items);
        //setListAdapter(adapter);
        list.setAdapter(adapter);
    }
}
