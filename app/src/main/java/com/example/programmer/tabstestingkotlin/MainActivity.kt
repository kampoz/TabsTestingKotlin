package com.example.programmer.tabstestingkotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.R.attr.fragment



class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val fragment = Tab1Fragment()
        val transaction = supportFragmentManager.beginTransaction()
        transaction.add(R.id.ll_main_container, fragment)
        transaction.commit()
    }
}


