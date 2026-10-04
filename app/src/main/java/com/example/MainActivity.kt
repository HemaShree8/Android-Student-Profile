package com.example

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val button=findViewById<Button>(R.id.btn1)

        val name=findViewById<EditText>(R.id.username)
        val branch=findViewById<EditText>(R.id.branch)
        val email=findViewById<EditText>(R.id.email)

        val displayname=findViewById<TextView>(R.id.display1)
        val displaybranch=findViewById<TextView>(R.id.display2)
        val displayemail=findViewById<TextView>(R.id.display3)

        button.setOnClickListener {
            Toast.makeText(this,"Profile Saved",Toast.LENGTH_LONG).show()
            displayname.text=name.text.toString()
            displaybranch.text=branch.text.toString()
            displayemail.text=email.text.toString()
        }

    }
}