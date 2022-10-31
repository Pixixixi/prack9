package com.example.prakt9

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.style.BackgroundColorSpan
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout

public lateinit var bcg: BackgroundColorSpan
class ResultActivity : AppCompatActivity() {
    private lateinit var twr: TextView
    private lateinit var bcg: ConstraintLayout
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)
        val data:Float = intent.getFloatExtra("data", 0.0F)
        bcg = findViewById(R.id.layout_back)
        twr = findViewById(R.id.textViewResult)
        if (data < 18.5){
            bcg.setBackgroundResource(R.color.blue)
            twr.text = "Индекс массы:\n$data\nМеньше нормы"
        }
        else if (data > 24.9){
            bcg.setBackgroundResource(R.color.red)
            twr.text = "Индекс массы:\n$data\nБольше нормы"
        }
        else {
            bcg.setBackgroundResource(R.color.green)
            twr.text = "Индекс массы:\n$data\nХороший показатель"
        }
    }
}