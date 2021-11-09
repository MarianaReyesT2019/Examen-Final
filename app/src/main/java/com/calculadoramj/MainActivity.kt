package com.calculadoramj

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private var num1: Double = 0.0
    private var num2: Double = 0.0
    private var operacion: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        
        val uno:Button = findViewById(R.id.uno)
        val dos:Button = findViewById(R.id.dos)
        val tres:Button = findViewById(R.id.tres)
        val cuatro:Button = findViewById(R.id.cuatro)
        val cinco:Button = findViewById(R.id.cinco)
        val seis:Button = findViewById(R.id.seis)
        val siete:Button = findViewById(R.id.siete)
        val ocho:Button = findViewById(R.id.ocho)
        val nueve:Button = findViewById(R.id.nueve)
        val cero:Button = findViewById(R.id.cero)
        val suma:Button = findViewById(R.id.suma)
        val resta:Button = findViewById(R.id.resta)
        val multiplicacion:Button = findViewById(R.id.multiplicacion)
        val division:Button = findViewById(R.id.division)

        uno.setOnClickListener { 
            numeropre(1)
        }
        dos.setOnClickListener { 
            numeropre(2)
        }
        tres.setOnClickListener { 
            numeropre(3)
        }
        cuatro.setOnClickListener {
            numeropre(4)
        }
        cinco.setOnClickListener {
            numeropre(5)
        }
        seis.setOnClickListener {
            numeropre(6)
        }
        siete.setOnClickListener {
            numeropre(7)
        }
        ocho.setOnClickListener {
            numeropre(8)
        }
        nueve.setOnClickListener {
            numeropre(9)
        }
        cero.setOnClickListener {
            numeropre(0)
        }

        suma.setOnClickListener {
            operacionpre(1) }
        resta.setOnClickListener {
            operacionpre(2) }
        multiplicacion.setOnClickListener {
            operacionpre(3) }
        division.setOnClickListener {
            operacionpre(4) }
        val limpiador:Button = findViewById(R.id.limpiador)
        limpiador.setOnClickListener {
            num1 = 0.0
            num2 = 0.0
            val resultado:TextView = findViewById(R.id.resultadotext)
            resultado.text = ""
            operacion = 0

        }

        val resultadoOperacion:TextView = findViewById(R.id.resultadotext)
        val igual:Button = findViewById(R.id.igual)
        igual.setOnClickListener {
            val resultado = when(this.operacion){
                1 -> num1+num2
                2 -> num1-num2
                3 -> num1 * num2
                4 -> num1/num2
                else-> 0
            }
            resultadoOperacion.text = resultado.toString()
            this.operacion = 0
            num1 = resultado.toDouble()
        }

        val info:Button = findViewById(R.id.info)
        info.setOnClickListener {
            val intent = Intent(this,Informacion::class.java).apply {

            }
            startActivity(intent)
        }
        }
        private fun numeropre(digito:Int){
            val resultado:TextView = findViewById(R.id.resultadotext)
            resultado.text ="${resultado.text}$digito"

            if(operacion == 0){
                num1 = resultado.text.toString().toDouble()
            }else{
                num2 = resultado.text.toString().toDouble()
            }
        }

    private fun operacionpre(operacion:Int) {
        val textoGuardado:TextView = findViewById(R.id.resultadotext)
        this.operacion = operacion
        textoGuardado.text = ""
    }
    }