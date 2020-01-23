package com.brainasaservice.deeplinker.deepcustom

import android.content.Context

class DeeplinkProcessor (private val context: Context) {

    fun matches(deeplink: String): Boolean {
        return deeplink.contains("deep/custom/")
    }

    fun execute(deeplink: String) {
        val name = deeplink.removePrefix("deep://deep/custom/").split('/').getOrNull(0) ?: "Unknown"
        val user = User(name)

        Activity2.start(context, user)
    }
}

