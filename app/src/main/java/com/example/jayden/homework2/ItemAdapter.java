package com.example.jayden.homework2;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Jayden on 2016-04-13.
 */
public class ItemAdapter extends BaseAdapter {

    private LayoutInflater mInflater;
    private Activity m_activity;
    private ArrayList<Item> arr;

    public ItemAdapter(Activity act, ArrayList<Item> arr_item) {
        this.m_activity = act;
        arr = arr_item;
        mInflater = (LayoutInflater) m_activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return arr.size();
    }

    @Override
    public Object getItem(int position) {
        return arr.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        if(convertView == null){
            int res = 0;
            res = R.layout.rowlayout;
            convertView = mInflater.inflate(res, parent, false);
        }
        ImageView imView = (ImageView)convertView.findViewById(R.id.picture);
        TextView title = (TextView)convertView.findViewById(R.id.title);
        TextView content = (TextView)convertView.findViewById(R.id.content);
        LinearLayout layout_view =  (LinearLayout)convertView.findViewById(R.id.view);
        int resId=  m_activity.getResources().getIdentifier(arr.get(position).picture, "drawable", m_activity.getPackageName());
        // setting Item adapter
        imView.setBackgroundResource(resId);
        title.setText(arr.get(position).title);
        content.setText(arr.get(position).content);
        layout_view.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                switch (position) {
                    case 0:
                        m_activity.startActivity(new Intent(m_activity, InfoTimeTable.class));
                        break;
                    case 1:
                        m_activity.startActivity(new Intent(m_activity, InfoTipCalculator.class));
                        break;
                    case 2:
                        m_activity.startActivity(new Intent(m_activity, InfoMiniCalculator.class));
                        break;
                    case 3:
                        m_activity.startActivity(new Intent(m_activity, ChangePWActivity.class));
                        break;
                }
            }
        });
        return convertView;
    }
}
