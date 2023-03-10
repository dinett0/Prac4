package com.example.prac_4;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class BlankFragment2 extends Fragment {

    View v;

    private String[] arr = new String[] {"abc", "def", "ghi"};
    private ListView listView;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        listView = v.findViewById(R.id.listview);
        ArrayAdapter<String> adap = new ArrayAdapter<>(getContext(), android.R.layout.simple_list_item_1, arr);
        listView.setAdapter(adap);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        return inflater.inflate(R.layout.fragment_blank2, container, false);
    }
}