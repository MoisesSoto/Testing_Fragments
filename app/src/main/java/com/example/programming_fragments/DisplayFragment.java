package com.example.programming_fragments;

import android.os.Bundle;
import android.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class DisplayFragment extends Fragment{

    TextView text;

	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        Log.d("-->", "onCreateView");
        View view = inflater.inflate(R.layout.fragment_display,container, false);
        text = (TextView) view.findViewById(R.id.tx_info);
		return view;
	}


    public void changeData(int index){
        Log.d("-->","changeData");
        String[] description = getResources().getStringArray(R.array.description);
        text.setText(description[index]);
    }
}
