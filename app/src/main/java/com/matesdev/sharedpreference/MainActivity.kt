package com.matesdev.sharedpreference

import PreferenceHelper
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle


class MainActivity : AppCompatActivity() {

    private lateinit var preferenceHelper: PreferenceHelper
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)




        preferenceHelper = PreferenceHelper(this)
        //guardamos
        preferenceHelper.saveData("name", "Juan")

        //leemos
        val name = preferenceHelper.getData("name", "")

        //Mostrar
        println("Nombre: $name")

    }
}


