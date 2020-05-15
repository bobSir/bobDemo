package com.bob.demo.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.bob.demo.R

class UiDemoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ui_demo)
    }

    fun flowLayout(view: View) {
        startActivity(Intent(this, FlowLayoutDemoActivity::class.java))
    }
}
