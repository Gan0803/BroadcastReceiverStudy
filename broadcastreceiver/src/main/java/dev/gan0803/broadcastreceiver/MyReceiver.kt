package dev.gan0803.broadcastreceiver

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.os.Process
import android.util.Log

class MyReceiver : BroadcastReceiver() {

    override fun onReceive(context: Context, intent: Intent) {
        Log.d("MyReceiver", "onReceive: pid ${Process.myPid()}, uid ${Process.myUid()}")
    }
}