package com.example.myapplication

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.util.Log
import android.widget.Toast

class MyBroadcastReceivers : BroadcastReceiver() {
    var count=0
    override fun onReceive(p0: Context?, p1: Intent?) {
        count++
        Log.v("MyBroadcastReceivers",count.toString())
        Toast.makeText(p0, "Toast Receive", Toast.LENGTH_LONG).show();
    }
}