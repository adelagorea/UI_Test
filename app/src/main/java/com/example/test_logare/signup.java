package com.example.test_logare;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class signup extends Fragment {



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
       ViewGroup root = (ViewGroup) inflater.inflate(R.layout.fragment_signup, container, false);
       return root;
    }
}