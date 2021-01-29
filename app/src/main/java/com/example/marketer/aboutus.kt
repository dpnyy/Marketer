package com.example.marketer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_aboutus.*

class aboutus : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_aboutus)

        val kelompok = "Nama kelompok : 3D\nAnggota :\n•  181111641 / Syahidandy Nasgi Nst\n•  181113952 / Dafa Shanrizki\n•  181112035 / Divany Djunita"
        klmpk.setText(kelompok)
    }
}