package com.example.recipeapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val fragment = LoginFragment()
        val fragmentManager = supportFragmentManager
        val trans = fragmentManager.beginTransaction()
        trans.add(R.id.container, fragment)
        trans.commit()
    }
}