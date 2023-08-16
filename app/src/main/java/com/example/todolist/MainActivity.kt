package com.example.todolist

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
//import kotlinx.android.synthetic.main.activity_first.*
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        firstBtn.setOnClickListener {
            activityPage()
        }

    }

    private fun activityPage() {
        val intent = Intent(this,SecondActivity::class.java)
        startActivity(intent)
    }
}