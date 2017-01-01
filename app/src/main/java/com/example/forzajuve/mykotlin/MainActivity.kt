package com.example.forzajuve.mykotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val items = listOf("mon 6/23 sunny",
            "mon 6/24 sunny",
            "mon 6/25 sunny",
            "mon 6/26 sunny",
            "mon 6/27 sunny")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        toast("hello kotlin")
        initView()
    }

    private fun initView() {
        val forcastRecycleView = findViewById(R.id.forcast_list) as RecyclerView
        forcastRecycleView.layoutManager = LinearLayoutManager(this)
        forcastRecycleView.adapter = ForcastListAdapter(items)
    }

    fun toast(text:String,time:Int = Toast.LENGTH_SHORT){
        Toast.makeText(this,text,time).show()
    }
}
