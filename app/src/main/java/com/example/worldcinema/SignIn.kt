package com.example.worldcinema

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.FrameLayout
import androidx.activity.result.contract.ActivityResultContracts
import kotlinx.android.synthetic.main.activity_sign_in.*

class SignIn : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in)

       /*regButton.setOnClickListener{
            val intent = Intent (this, SignUp:: class.java)
                startActivity(intent)*/

            val btIn:FrameLayout
            btIn = findViewById(R.id.regButton)

        btIn.setOnClickListener{
            val intent = Intent (this, SignUp:: class.java)
            startActivity(intent)


        }
    }



}