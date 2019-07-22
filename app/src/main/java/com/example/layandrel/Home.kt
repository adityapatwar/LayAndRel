package com.example.layandrel

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_home.*

class Home : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)


        //data data
//        pindah.putExtra("firstTeam",firstTeam)
//        pindah.putExtra("secondTeam",secondTeam)
//        startActivity(pindah)
//        finish();
        btn_latihan1.setOnClickListener {
            var pindah: Intent = Intent(applicationContext,MainActivity::class.java)
            startActivity(pindah)
            finish();
            //
        }
        btn_latihan2.setOnClickListener {
            var pindah: Intent = Intent(applicationContext,Activty_Relatve::class.java)
            startActivity(pindah)
            finish();
        }
        btn_latihan3.setOnClickListener {
            var pindah: Intent = Intent(applicationContext,Main2Activity::class.java)
            startActivity(pindah)
            finish();
        }
        btn_latihan4.setOnClickListener {
            var pindah: Intent = Intent(applicationContext,Tugas::class.java)
            startActivity(pindah)
            finish();
        }

    }
}
