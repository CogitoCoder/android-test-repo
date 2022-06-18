package com.blurrybit.counterapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlin.coroutines.CoroutineContext

class MainActivity : AppCompatActivity() {
    private lateinit var btnCount: Button
    private lateinit var tvCounter: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnCount = findViewById(R.id.btnCount)
        tvCounter = findViewById(R.id.tvCounter)
        var count = 1
        btnCount.setOnClickListener {
            tvCounter.text = (count++).toString()
            Toast.makeText(this@MainActivity, "Count is ${tvCounter.text.toString()}", Toast.LENGTH_SHORT).show()
        }
    }
}