package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Layout;
import android.util.Log;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {
    int i=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);
        getSupportActionBar().setTitle("Numbers");
        //Adding list of numbers in array
       ArrayList list = new ArrayList();
        list.add("Add");
        list.add("Multiply");
        list.add("Value");
        list.add("Apple");
        list.add("Ball");
        list.add("carrot");
        list.add("Dollar");
        list.add("Ear");
        list.add("Forest");
        list.add("God");
        Log.i("1st item in the list is",list.get(0).toString());
        LinearLayout layout = (LinearLayout)findViewById(R.id.rootView);

        while(i<list.size()){
            TextView textView = new TextView(this);
            textView.setText(list.get(i).toString());

            layout.addView(textView);
            i++;
        }

    }
}
