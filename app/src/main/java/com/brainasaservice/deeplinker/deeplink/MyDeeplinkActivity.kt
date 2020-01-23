package com.brainasaservice.deeplinker.deeplink

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.brainasaservice.deeplinker.DeeplinkHandler
import com.brainasaservice.deeplinker.deepcustom.DeeplinkProcessor

class MyDeeplinkActivity : AppCompatActivity() {

    lateinit var processor : DeeplinkProcessor

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        processor = DeeplinkProcessor(this)
        intent?.let { handleIntent(it) }
    }

    override fun onNewIntent(intent: Intent?) {
        super.onNewIntent(intent)
        intent?.let { handleIntent(it) }
    }

    private fun handleIntent(intent: Intent) {
        val deepUrl = intent.data?.toString()

        if(deepUrl!=null){
            if(processor.matches(deepUrl)){
                processor.execute(deepUrl)
            }
        }
        finish()
    }
}
