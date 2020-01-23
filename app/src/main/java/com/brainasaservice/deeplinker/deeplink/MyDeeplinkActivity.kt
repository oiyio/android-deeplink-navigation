package com.brainasaservice.deeplinker.deeplink

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.brainasaservice.deeplinker.ui.DeeplinkApp
import com.brainasaservice.deeplinkprocessor.DeeplinkHandler

class MyDeeplinkActivity : AppCompatActivity() {
        fun getDeeplinkHandler(): DeeplinkHandler = (applicationContext as DeeplinkApp).component.deeplinkHandler()

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
}
