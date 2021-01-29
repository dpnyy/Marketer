package com.example.marketer

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.*
import com.afollestad.materialdialogs.MaterialDialog
import com.afollestad.materialdialogs.customview.customView
import kotlinx.android.synthetic.main.activity_menu.*

class menu : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        val adapter = ArrayAdapter.createFromResource(this,
            R.array.daftarmap,
            android.R.layout.simple_spinner_dropdown_item)
        spinnermap.adapter = adapter

        spinnermap.onItemSelectedListener = object : AdapterView.OnItemSelectedListener{
            override fun onNothingSelected(parent: AdapterView<*>?) {
            }
            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
                if(parent!=null){
                    var selected = parent.getItemAtPosition(position).toString()
                    if(selected == "demo"){
                        openmap.setOnClickListener({
                            val intent = Intent(this@menu, jendelamap::class.java)
                            intent.putExtra("namamap", selected)
                            startActivity(intent)
                        })
                    }
                }
            }
        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.abmenu,menu);
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        val id = item.itemId
        if(id == R.id.out){
            val intent = Intent(this, login_daftar_guest::class.java)
            startActivity(intent)
            Toast.makeText(this, "Log out", Toast.LENGTH_SHORT).show()
            finish()
            return true
        }
        else if(id == R.id.mnabout){
            showAbout()
            return true
        }
        return super.onOptionsItemSelected(item)
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