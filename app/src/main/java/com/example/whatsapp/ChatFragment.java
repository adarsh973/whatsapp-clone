package com.example.whatsapp;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class ChatFragment extends Fragment {
    MainActivity mainActivity;
    public ChatFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_chat, container, false);

        //<--------------Intent for jumping to  chatScreen------------------------------->
        TextView text = view.findViewById(R.id.mainLine1);
        mainActivity = (MainActivity) getActivity();
        text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getActivity(),chatScreen.class);
                i.putExtra("message key",text.getText().toString());
                startActivity(i);
            }
        });

        //<---------------------same for different person done below--------------------->
        TextView text2 = view.findViewById(R.id.mainLine2);
        text2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getActivity(),chatScreen.class);
                i.putExtra("message key",text2.getText().toString());
                startActivity(i);
            }
        });

        //<---------------------------------------------------------->
        TextView text3 = view.findViewById(R.id.mainLine3);
        text3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getActivity(),chatScreen.class);
                i.putExtra("message key",text3.getText().toString());
                startActivity(i);
            }
        });
        return view;
    }
}