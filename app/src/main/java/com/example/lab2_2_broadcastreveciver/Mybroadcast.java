package com.example.lab2_2_broadcastreveciver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class Mybroadcast extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        String msg = intent.getStringExtra("thongbao");
        Toast.makeText(context,msg,Toast.LENGTH_LONG).show();
    }
}
