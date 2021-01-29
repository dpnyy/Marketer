package com.example.marketer

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_login_daftar_guest.*

import kotlin.Boolean as Boolean1

class login_daftar_guest : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_daftar_guest)

        lgnbtn.setOnClickListener({
            if(validasi()){
                startActivity(Intent(this, menu::class.java))
                Toast.makeText(applicationContext,"Berhasil",Toast.LENGTH_SHORT).show()
                finish()
            }
        })
        btndaftar.setOnClickListener({
            startActivity(Intent(this, Daftar::class.java))
        })
        gst.setOnClickListener({
            startActivity(Intent(this, menu::class.java))
            Toast.makeText(applicationContext,"Masuk Menggunakan Guest",Toast.LENGTH_SHORT).show()
            finish()
        })

    }

    private fun validasi(): kotlin.Boolean {
        if(uname.text.toString().trim().isEmpty()){
            uname.error="Username Salah"
            return false
        }else if(pass.text.toString().trim().isEmpty()){
            pass.error="Password Salah"
            return false
        }
        return true
    }


}