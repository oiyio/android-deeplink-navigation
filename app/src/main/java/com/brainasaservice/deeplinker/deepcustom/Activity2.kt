package com.brainasaservice.deeplinker.deepcustom

import android.os.Bundle
import android.support.v4.app.NavUtils
import android.support.v7.app.AppCompatActivity
import com.brainasaservice.deeplinker.R
import kotlinx.android.synthetic.main.activity_deep_custom.*

class Activity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        println("onCreate(${javaClass.simpleName})")
        setContentView(R.layout.activity_deep_custom)

        intent.extras?.getParcelable<User>(DeeplinkProcessor.EXTRA_KEY)
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
