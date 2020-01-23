package com.brainasaservice.deeplinker.deepcustom

import android.content.Context
import android.content.Intent
import android.content.Intent.FLAG_ACTIVITY_NEW_TASK
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class DeeplinkProcessor @Inject constructor(
    private val context: Context
) {

    fun matches(deeplink: String): Boolean {
        return deeplink.contains("deep/custom/")
    }

    fun execute(deeplink: String) {
        val name = deeplink.removePrefix("deep://deep/custom/").split('/').getOrNull(0) ?: "Unknown"
        val user = User(name)

        context.startActivity(Intent(context, Activity2::class.java).apply {
            this.flags = FLAG_ACTIVITY_NEW_TASK
            putExtra(EXTRA_KEY, user)
        })
    }

    companion object {
        const val EXTRA_KEY = "deeplink_processor_extra"
    }
}

