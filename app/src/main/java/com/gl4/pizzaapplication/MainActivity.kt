package com.gl4.pizzaapplication

import android.content.pm.PackageManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.RadioButton
import androidx.core.app.ActivityCompat
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {

    lateinit var nom:TextInputEditText
    lateinit var prenom:TextInputEditText
    lateinit var adresse:TextInputEditText
    lateinit var btnSMS : Button
    lateinit var btnEmail : Button
    lateinit var moyenneRadioButton: RadioButton
    lateinit var miniRadioButton: RadioButton
    lateinit var maxiRadioButton: RadioButton
    lateinit var fromage: CheckBox
    lateinit var champignon: CheckBox
    lateinit var thon: CheckBox
    lateinit var pepperoni:CheckBox
    lateinit var roquefort: CheckBox
    lateinit var pineapple:CheckBox
    lateinit var poivrons:CheckBox
    lateinit var jambon:CheckBox


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        nom = findViewById(R.id.nom)
        prenom = findViewById(R.id.prenom)
        adresse = findViewById(R.id.addresse)

        miniRadioButton = findViewById(R.id.radioButton10)
        moyenneRadioButton = findViewById(R.id.radioButton9)
        maxiRadioButton = findViewById(R.id.radioButton11)

        fromage = findViewById(R.id.checkBox)
        champignon = findViewById(R.id.checkBox2)
        thon = findViewById(R.id.checkBox3)
        pepperoni = findViewById(R.id.checkBox4)
        roquefort = findViewById(R.id.checkBox8)
        pineapple = findViewById(R.id.checkBox7)
        poivrons = findViewById(R.id.checkBox5)
        jambon = findViewById(R.id.checkBox6)


        btnEmail = findViewById(R.id.buttonEmail)
        btnSMS = findViewById(R.id.buttonSMS)

        if(ActivityCompat.checkSelfPermission(this, android.Manifest.permission.SEND_SMS) != PackageManager.PERMISSION_GRANTED){
            ActivityCompat.requestPermissions(this, arrayOf(android.Manifest.permission.SEND_SMS), 111)

        }


    }
}