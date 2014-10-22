package com.example.programming_fragments;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.app.FragmentManager;
import android.util.Log;

public class MainActivity extends Activity implements MenuFragment.Communicator {

    DisplayFragment displayf;
    MenuFragment menuf;
	FragmentManager manager;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
        Log.d("-->","onCreate1");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("-->","onCreate2");
        manager = getFragmentManager();
        menuf = (MenuFragment) manager.findFragmentById(R.id.fragment);
        menuf.setCommunicator(this);
    }

    @Override
    public void respond(int index) {
        Log.d("-->","onCreate3");
        displayf = (DisplayFragment)manager.findFragmentById(R.id.fragment2);
        if ( displayf != null && displayf.isVisible()){
            Log.d("-->","onCreate4");
            displayf.changeData(index);

        }else{
            Log.d("-->","onCreate5");
            Intent intent = new Intent(this, AnotherActivity.class);
            intent.putExtra("index", index);
            startActivity(intent);
        }
    }
}
