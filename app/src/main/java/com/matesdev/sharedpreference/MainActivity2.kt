package com.matesdev.sharedpreference

import PreferenceHelper
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    private lateinit var newUserAdded: String
    private lateinit var twUser: TextView

    private lateinit var preferenceHelper: PreferenceHelper


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        twUser = findViewById<EditText>(R.id.twUser)

        preferenceHelper = PreferenceHelper(this)

        //leemos
        val userToText = preferenceHelper.getData("newUser", "")

        twUser.text = userToText

    }



}