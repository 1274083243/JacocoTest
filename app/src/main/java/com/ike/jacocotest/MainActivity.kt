package com.ike.jacocotest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

open class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<Button>(R.id.test1).setOnClickListener {
            MyTestUtils.test1()
        }
        findViewById<Button>(R.id.test2).setOnClickListener {
            MyTestUtils.test2()
        }
        findViewById<Button>(R.id.test3).setOnClickListener {
            MyTestUtils.test3()
        }
        findViewById<Button>(R.id.test4).setOnClickListener {
            MyTestUtils.test4()
        }
    }
}