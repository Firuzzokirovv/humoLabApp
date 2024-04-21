package com.firuz.humoTransfer

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.firuz.humolabapp.R

class MainScreenHumTransferActivity : AppCompatActivity() {

    private var button: Button? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_main_screen_humo_transfer)

        button = findViewById(R.id.btnSendHumoTransfer)

        button?.setOnClickListener() {
            val intent = Intent(this, TransferHumActivity::class.java)
            startActivity(intent)
        }
    }
}