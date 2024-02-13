package com.cauandzn.writecode

import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var btnFinalizarPedido: Button
    private lateinit var checkboxPrato1: CheckBox
    private lateinit var checkboxPrato2: CheckBox
    private lateinit var checkboxBebida1: CheckBox
    private lateinit var checkboxBebida2: CheckBox
    private lateinit var tvTotal: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnFinalizarPedido = findViewById(R.id.btnFinalizarPedido)
        checkboxPrato1 = findViewById(R.id.checkboxPrato1)
        checkboxPrato2 = findViewById(R.id.checkboxPrato2)
        checkboxBebida1 = findViewById(R.id.checkboxBebida1)
        checkboxBebida2 = findViewById(R.id.checkboxBebida2)
        tvTotal = findViewById(R.id.tvTotal)

        btnFinalizarPedido.setOnClickListener {
            realizarPedido()
        }
    }

    private fun realizarPedido() {
        val total = calcularTotal()
        if (total > 0) {
            exibirMensagem("Seu pedido foi enviado para o balcão do restaurante.")
        } else {
            exibirMensagemCurta("Selecione pelo menos um produto.")
        }
    }

    private fun calcularTotal(): Int {
        var total = 0
        if (checkboxPrato1.isChecked) {
            total += 10
        }
        if (checkboxPrato2.isChecked) {
            total += 15
        }
        if (checkboxBebida1.isChecked) {
            total += 5
        }
        if (checkboxBebida2.isChecked) {
            total += 4
        }

        tvTotal.text = "Total: R$ $total,00"
        return total
    }

    private fun exibirMensagem(mensagem: String) {
        Toast.makeText(this, mensagem, Toast.LENGTH_LONG).show()
    }

    private fun exibirMensagemCurta(mensagem: String) {
        Toast.makeText(this, mensagem, Toast.LENGTH_SHORT).show()
    }
}
