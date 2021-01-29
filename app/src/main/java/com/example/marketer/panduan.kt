package com.example.marketer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_panduan.*

class panduan : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_panduan)

        val txtgd = "Tata cara belanja di pasar :\n1.  Sebelum pergi ke pasar yang ingin dituju, ingat atau bila perlu catat apa saja yang ingin dibeli.\n2.  Perkirakan total harga belanjaan yang akan dibeli, agar tidak berlebihan membawa uang ke pasar tradisional karena suasana yang cukup ramai dan sempit.\n3.  Sesampainya di pasar, beli lah barang yang posisi toko nya paling dekat dengan kamu terlebih dahulu\n4.  Kita juga bisa mengunjungi toko yang banyak pembelinya, biasanya itu menandakan bahwa harga barang di toko tersebut murah sehingga banyak peminatnya.\n5.  Sebelum membeli, sebaiknya tanyakan dahulu harga barang yang ingin dibeli, agar dapat membandingkannya dengan toko yang lain jika berminat.\n6.  Pilihlah barang yang ingin dibeli dengan teliti agar mendapatkan barang dengan kualitas yang baik.\n7.  Pastikan penjual menghitung total belanjaanmu dengan benar agar tidak mengalami kerugian, dan segera koreksi jika hitungannya ada yang salah sebelum beranjak pergi dari toko tersebut."
        txtguide.setText(txtgd)
    }
}