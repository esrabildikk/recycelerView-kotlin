package com.example.recycelerview_kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.recycelerview_kotlin.databinding.ActivityMainBinding

private lateinit var binding: ActivityMainBinding
private lateinit var kartlarList : ArrayList<kartlar>

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        kartlarList = ArrayList<kartlar>()
        //data
        val t1 =  kartlar("Dönel kavşak levhası","bir")
        val t2  = kartlar("Dur","iki")
        val t3= kartlar("Ehli hayvanlar geçebilir","uc")
        val t4=kartlar("Vahşi hayvanlar geçebilir","dort")
        val t5= kartlar("İki yönlü trafik","bes")
        val t6= kartlar("Sağa tehlikeli viraj","alti")
        val t7= kartlar("Yandan rüzgar","yedi")
        val t8=kartlar("Yol ver","sekiz")
        val t9=kartlar("Motorlu taşıt giremez","dokuz")
        val t10=kartlar("Kasisli yol","on")
        kartlarList.add(t1)
        kartlarList.add(t2)
        kartlarList.add(t3)
        kartlarList.add(t4)
        kartlarList.add(t5)
        kartlarList.add(t6)
        kartlarList.add(t7)
        kartlarList.add(t8)
        kartlarList.add(t9)
        kartlarList.add(t10)
        binding.rv.layoutManager = LinearLayoutManager(this)
        val adapter = Adapter(kartlarList)
        binding.rv.adapter = adapter

    }
}