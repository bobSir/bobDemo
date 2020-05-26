package com.bob.demo.ui

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.bob.demo.R

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun uiTest(view: View) {
        startActivity(Intent(this, UiDemoActivity::class.java))
    }

    fun animTest(view: View) {
    }
}
