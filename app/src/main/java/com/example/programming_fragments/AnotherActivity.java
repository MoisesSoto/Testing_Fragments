package com.example.programming_fragments;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

public class AnotherActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState){
        Log.d("-->", "AnotheronCreate");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_another);
        Intent intent = getIntent();
        int index = intent.getIntExtra("index", 0);
        DisplayFragment f2 = (DisplayFragment)getFragmentManager().findFragmentById(R.id.fragment2);
        if(f2!=null)
            f2.changeData(index);
    }
}
