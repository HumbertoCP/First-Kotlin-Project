package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() { //extends

    private var resultado: TextView? = null
    private var soma: Int = 0

    fun add(buttonId: Int, num: Int){
        var button = findViewById<Button>(buttonId)
        button.setOnClickListener{
            this.soma += num
            this.resultado?.text = soma.toString()
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) { //polimorfismo
        super.onCreate(savedInstanceState) //chama o metodo da classe q ele tá extendendo
        setContentView(R.layout.activity_main)

        this.resultado = findViewById<TextView>(R.id.resultado)

        this.add(R.id.button5, 5)
        this.add(R.id.button6, 7)
        this.add(R.id.button7, 9)

        var buttonReset = findViewById<Button>(R.id.button8) //reset 'soma' value
        buttonReset.setOnClickListener{
            this.soma = 0
            this.resultado?.text = soma.toString()
        }


    }

}