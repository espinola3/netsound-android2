package com.example.prova;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class MySongs extends Fragment {
	
	@Override
    public View onCreateView(
        LayoutInflater inflater, ViewGroup container,
        Bundle savedInstanceState) {
 
        return inflater.inflate(R.layout.activity_mysongs, container, false);
    }

	

}
