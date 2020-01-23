package com.brainasaservice.deeplinker.main

import android.content.Intent
import android.content.Intent.ACTION_VIEW
import android.net.Uri
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.brainasaservice.deeplinker.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button2.setOnClickListener {
            val intent = Intent(ACTION_VIEW, Uri.parse("deep://deep/custom/damian"))  // opens Activity2
            startActivity(intent)
        }
    }
}
