package com.example.login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.firebase.auth.FirebaseAuth
import kotlinx.android.synthetic.main.activity_main.*
import java.lang.reflect.Member

class MainActivity : AppCompatActivity() {

    var auth:FirebaseAuth? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        auth = FirebaseAuth.getInstance()

        if (auth!!.currentUser != null){
            val it = Intent(this,Member::class.java)
            startActivity(it)
            finish()
        }

        emaillogbtn.setOnClickListener{
            val it = Intent(this,Login::class.java)
            startActivity(it)
        }
        
    }
}