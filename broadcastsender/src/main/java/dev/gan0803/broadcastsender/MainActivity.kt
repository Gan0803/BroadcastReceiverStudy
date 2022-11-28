package dev.gan0803.broadcastsender

import android.content.ComponentName
import android.content.Intent
import android.os.Bundle
import android.os.Process
import android.util.Log
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.button)
        button.setOnClickListener {
            Log.d("MainActivity", "send broadcast: pid ${Process.myPid()}, uid ${Process.myUid()}")

            Intent().also { intent ->
                intent.component = ComponentName(
                    "dev.gan0803.broadcastreceiver",
                    "dev.gan0803.broadcastreceiver.MyReceiver"
                )
                sendBroadcast(intent)
            }
        }
    }
}