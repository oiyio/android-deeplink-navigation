package com.brainasaservice.deeplinker.deepcustom

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.support.v4.app.NavUtils
import android.support.v7.app.AppCompatActivity
import com.brainasaservice.deeplinker.R
import kotlinx.android.synthetic.main.activity_deep_custom.*

class Activity2 : AppCompatActivity() {

    companion object {
        const val EXTRA_KEY = "deeplink_processor_extra"

        @JvmStatic
        fun start(context: Context, user: User) {
            val intent = Intent(context, Activity2::class.java)
            intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK
            intent.putExtra(EXTRA_KEY, user)
            context.startActivity(intent)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        println("onCreate(${javaClass.simpleName})")
        setContentView(R.layout.activity_deep_custom)

        intent.extras?.getParcelable<User>(EXTRA_KEY)
            ?.let { user ->
                textTitle.text = "Hello, ${user.name}!"
            }

        buttonBack.setOnClickListener {
            NavUtils.getParentActivityIntent(this)?.let { intent ->
                intent.component?.className?.let { print("Component Class: $it") }
                startActivity(intent)
            }
            super.onBackPressed()
        }
    }

    override fun onStart() {
        super.onStart()
        println("onStart(${javaClass.simpleName})")
    }

    override fun onStop() {
        super.onStop()
        println("onStop(${javaClass.simpleName})")
    }

    override fun onDestroy() {
        super.onDestroy()
        println("onDestroy(${javaClass.simpleName})")
    }
}
