package com.brainasaservice.deeplinker.deeplink

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.brainasaservice.deeplinker.DeeplinkHandler
import com.brainasaservice.deeplinker.deepcustom.DeeplinkProcessor

class MyDeeplinkActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        intent?.let { handleIntent(it) }
    }

    override fun onNewIntent(intent: Intent?) {
        super.onNewIntent(intent)
        intent?.let { handleIntent(it) }
    }

    private fun handleIntent(intent: Intent) {
        intent.data?.toString()?.let {
            getDeeplinkHandler().process(it)
        }
        finish()
    }

    fun getDeeplinkHandler(): DeeplinkHandler = DeeplinkHandler(DeeplinkProcessor(this))
}
