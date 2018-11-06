package com.btzw.kpx

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class login : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
    }

    fun login(view: View){

        val login = findViewById<Button>(R.id.login)
        var myemail = findViewById<EditText>(R.id.editEmail)
        var mypassword = findViewById<EditText>(R.id.editPassword)

        val email = myemail.text
        val password = mypassword.text
        val e:String = "theophilusokoye6@gmail.com"
        val p:String = "admin"

        if(email.equals(e) and password.equals(p))
        {
            val intent = Intent(this, tiles::class.java)
            startActivity(intent)
        }
        else{
            Toast.makeText(this, "Invalid Credentials", Toast.LENGTH_LONG).show()
        }

    }
}
