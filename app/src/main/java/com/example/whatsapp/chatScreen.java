package com.example.whatsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class chatScreen extends AppCompatActivity {

    TextView title,msgSent;
    EditText editTxt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat_screen);

        title = (TextView) findViewById(R.id.name);
        editTxt = (EditText) findViewById(R.id.message);

        Intent intent = getIntent();
        String str = intent.getStringExtra("message key");
        title.setText("  "+str);

        msgSent = (TextView) findViewById(R.id.msgSend);
        editTxt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = editTxt.getText().toString();
                if(!s.isEmpty())
                    msgSent.setText(s);
            }
        });
    }
}