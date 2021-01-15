package com.example.lab2_2_broadcastreveciver;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button btn;
    EditText txt;
    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = findViewById(R.id.button);
        txt = findViewById(R.id.editText);
    }

    public void sendbroadcast (View view){
         intent = new Intent(MainActivity.this,Mybroadcast.class);
        intent.putExtra("thongbao",txt.getText().toString());
        sendBroadcast(intent);
    }
}
