package com.matesdev.sharedpreference

import PreferenceHelper
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import android.content.Intent



class MainActivity : AppCompatActivity() {

    //Declaracion de ojbetos lateint var: Declara variables que no se inicializan hasta que sean usadas
    private lateinit var user: EditText
    private lateinit var pass: EditText
    private lateinit var newUser: String

    private lateinit var buttonGuardar: Button
    private lateinit var buttonLeer: Button

    private lateinit var preferenceHelper: PreferenceHelper
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        user = findViewById<EditText>(R.id.edUser)
        pass = findViewById<EditText>(R.id.edPassword)

        buttonGuardar = findViewById<Button>(R.id.btGuardar)
        buttonLeer = findViewById<Button>(R.id.btLeer)

        buttonGuardar.setOnClickListener {
            val usuario = user.text.toString()
            val password = pass.text.toString()
            preferenceHelper = PreferenceHelper(this)


            if( user.text.isEmpty() || pass.text.isEmpty() ){
                Toast.makeText(this, "Por favor ingrese el nombre y/o apellido", Toast.LENGTH_SHORT).show()
            }else{
                val newUserAdd = " $usuario $password"
                newUser = usuario

                //guardamos
                preferenceHelper.saveData("newUser", newUser)

                //Comentario de lo sucedido
                Toast.makeText(this, "Se agregó a: $newUserAdd", Toast.LENGTH_SHORT).show()

                // Clear EditText
                user.text.clear()
                pass.text.clear()
            }
        }

        buttonLeer.setOnClickListener {

            // Llamo a la actividad 2
            val intent = Intent(this, MainActivity2::class.java)
            startActivity(intent)

        }
    }

}


