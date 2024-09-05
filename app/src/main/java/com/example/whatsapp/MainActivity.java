package com.example.whatsapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button chat_btn;
    Button status_btn;
    Button calls_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        chat_btn = (Button) findViewById(R.id.chatBtn);
        status_btn = (Button) findViewById(R.id.statusBtn);
        calls_btn = (Button) findViewById(R.id.callsBtn);

        loadFrag(new ChatFragment(),1);

        chat_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loadFrag(new ChatFragment(),1);
            }
        });

        status_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loadFrag(new StatusFragment(),1);
            }
        });

        calls_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loadFrag(new CallsFragment(),1);
            }
        });
    }
    public void loadFrag(Fragment fragment,int flag){
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        if(flag == 1)
            ft.replace(R.id.container,fragment);
        else
            ft.add(R.id.container,fragment);
        ft.commit();
    }
}