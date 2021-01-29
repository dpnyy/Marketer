package com.example.marketer

import android.content.DialogInterface
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.activity_daftar.*
import kotlinx.android.synthetic.main.activity_login_daftar_guest.*

class Daftar : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_daftar)

        dftrbtn.setOnClickListener({
            if(!email.text.toString().contains("@")){
                Toast.makeText(this, "Format email salah", Toast.LENGTH_SHORT).show()
            }else if(dftruname.text.toString().trim().isEmpty()){
                Toast.makeText(this, "Username tidak boleh kosong atau hanya spasi", Toast.LENGTH_SHORT).show()
            }else if(dftrpass.text.toString().length<6){
                Toast.makeText(this, "Panjang password minimal 6", Toast.LENGTH_SHORT).show()
            }else if(dftruname.text.toString().length<5){
                Toast.makeText(this, "Panjang username minimal 5", Toast.LENGTH_SHORT).show()
            }else{
                Toast.makeText(this, "Akun berhasil didaftarkan", Toast.LENGTH_SHORT).show()
                val intent = Intent(this, login_daftar_guest::class.java)
                startActivity(intent)
                finish()
            }
        })
        gstbtn.setOnClickListener({
            Toast.makeText(applicationContext,"Masuk Menggunakan Guest",Toast.LENGTH_SHORT).show()
            val intent = Intent(this, menu::class.java)
            startActivity(intent)
            finish()
        })
    }
    fun dlg(view: View) {
        var dialog = AlertDialog.Builder(this)
            .setTitle("Peringatan")
            .setMessage(
                "Mohon memasukkan data dengan benar. " +
                        "Login akan memerlukan username dan password, tolong diingat"
            )
            .setPositiveButton("OK!", DialogInterface.OnClickListener { dialogInterface, i ->
                Toast.makeText(this, "Terima Kasih", Toast.LENGTH_SHORT).show()
            })
        dialog.show()
    }

}