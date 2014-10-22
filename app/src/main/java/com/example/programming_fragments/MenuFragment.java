package com.example.programming_fragments;

import android.app.Fragment;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MenuFragment extends Fragment implements AdapterView.OnItemClickListener {

    ListView list;
    Communicator communicator;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Log.d("-->", "onCreateView1");
        View view = inflater.inflate(R.layout.fragment_list, container, false);
        list = (ListView) view.findViewById(R.id.listView_menu);
        ArrayAdapter adapter = ArrayAdapter.createFromResource(getActivity(),
                R.array.chapters,android.R.layout.simple_expandable_list_item_1);
        list.setAdapter(adapter);
        list.setOnItemClickListener(this);
        return view;
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Log.d("-->","onItemClick");
        communicator.respond(position);
    }

    public void setCommunicator(Communicator communicator){
        Log.d("-->","setCommunicator");
        this.communicator = communicator;
    }

    public interface Communicator{
        public void respond(int index);
    }
}
