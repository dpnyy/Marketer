package com.example.marketer

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.afollestad.materialdialogs.MaterialDialog
import com.afollestad.materialdialogs.customview.customView
import com.davemorrissey.labs.subscaleview.ImageSource
import com.google.android.material.dialog.MaterialDialogs
import kotlinx.android.synthetic.main.activity_jendelamap.*
import kotlinx.android.synthetic.main.activity_note.*
import org.w3c.dom.Text

class jendelamap : AppCompatActivity() {

    var isi = ""

    lateinit var preferences: SharedPreferences
    lateinit var editor: SharedPreferences.Editor

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_jendelamap)

        var namamap = intent.getStringExtra("namamap")
        mapbox.setImage(ImageSource.resource(R.drawable.pasar))

        btnback.setOnClickListener({
            onBackPressed()
        })
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.daftarmenu,menu);
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        val id = item.itemId
        if(id == R.id.notebtn){
            showNote()
            return true
        }else if(id == R.id.guide){
            val intent = Intent(this, panduan::class.java)
            startActivity(intent)
            return true
        }else if(id == R.id.aboutus){
            showAbout()
            return true
        }
        return super.onOptionsItemSelected(item)
    }

    private fun initPrefs(){
        preferences = getSharedPreferences("MyPrefs", Context.MODE_PRIVATE)
        editor = preferences.edit()
    }

    private fun showNote(){
        val note = MaterialDialog(this)
            .noAutoDismiss()
            .customView(R.layout.activity_note)

        note.findViewById<EditText>(R.id.isinote).setText(isi)

        note.findViewById<TextView>(R.id.savebtn).setOnClickListener({
            isi = note.findViewById<EditText>(R.id.isinote).text.toString()
            Toast.makeText(this, "Catatan Disimpan", Toast.LENGTH_SHORT).show()
            note.dismiss()
        })
        note.findViewById<TextView>(R.id.cancelbtn).setOnClickListener({
            note.dismiss()
        })
        note.show()
    }
    private fun showAbout(){
        val note = MaterialDialog(this)
            .noAutoDismiss()
            .customView(R.layout.activity_aboutus)
        val kelompok = "Nama kelompok : 3D\nAnggota :\n•  181111641 / Syahidandy Nasgi Nst\n•  181113952 / Dafa Shanrizki\n•  181112035 / Divany Djunita"
        note.findViewById<TextView>(R.id.klmpk).setText(kelompok)
        note.show()
    }
}