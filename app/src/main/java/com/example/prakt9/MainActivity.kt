package com.example.prakt9

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast



class MainActivity : AppCompatActivity() {
    private lateinit var btn: Button
    private lateinit var Ves: EditText
    private lateinit var Rost: EditText
    private lateinit var stw: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btn = findViewById(R.id.button)
        Ves = findViewById(R.id.Ves)
        Rost = findViewById(R.id.Rost)
        btn.setOnClickListener {
            if(Rost.text.toString()!=""&&Ves.text.toString()!=""){
                val First:String = Ves.text.toString()
                val Second:String = Rost.text.toString()
                val res:Float = First.toFloat() / ((Second.toFloat() / 100)*(Second.toFloat() / 100))
                val intent = Intent(this, ResultActivity::class.java)
                intent.putExtra("data",res.toFloat())
                startActivity(intent)
            }
            else {
                Toast.makeText(this,"Не все поля заполнены",Toast.LENGTH_SHORT).show()
            }
        }
    }
}