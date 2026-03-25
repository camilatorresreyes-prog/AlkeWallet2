package com.example.alkewallet.ui.wallet

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.example.alkewallet.R
import com.example.alkewallet.viewmodel.WalletViewModel
import java.text.NumberFormat
import java.util.Locale

class WalletActivity : AppCompatActivity() {

    private lateinit var tvSaldo: TextView
    private lateinit var etMonto: EditText
    private lateinit var btnDepositar: Button
    private lateinit var btnRetirar: Button
    private lateinit var tvMovimientos: TextView
    private lateinit var viewModel: WalletViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_wallet)

        viewModel = ViewModelProvider(this)[WalletViewModel::class.java]

        tvSaldo = findViewById(R.id.tvSaldo)
        etMonto = findViewById(R.id.etMonto)
        btnDepositar = findViewById(R.id.btnDepositar)
        btnRetirar = findViewById(R.id.btnRetirar)
        tvMovimientos = findViewById(R.id.tvMovimientos)

        val prefs = getSharedPreferences("wallet", MODE_PRIVATE)
        val saldoGuardado = prefs.getInt("saldo", 100000)
        viewModel.saldo.value = saldoGuardado

        viewModel.saldo.observe(this) { saldoActual ->
            val formato = NumberFormat.getNumberInstance(Locale("es", "CL"))
            tvSaldo.text = "$ ${formato.format(saldoActual)}"
            prefs.edit().putInt("saldo", saldoActual).apply()
        }

        viewModel.mensaje.observe(this) { mensaje ->
            Toast.makeText(this, mensaje, Toast.LENGTH_SHORT).show()
        }

        btnDepositar.setOnClickListener {
            val monto = etMonto.text.toString().toIntOrNull()

            if (monto == null) {
                Toast.makeText(this, "Ingresa un monto válido", Toast.LENGTH_SHORT).show()
            } else {
                viewModel.depositar(monto)
                tvMovimientos.text = "Depósito: +$monto"
                etMonto.text.clear()
            }
        }

        btnRetirar.setOnClickListener {
            val monto = etMonto.text.toString().toIntOrNull()

            if (monto == null) {
                Toast.makeText(this, "Ingresa un monto válido", Toast.LENGTH_SHORT).show()
            } else {
                val saldoAntes = viewModel.saldo.value ?: 0
                viewModel.retirar(monto)
                val saldoDespues = viewModel.saldo.value ?: 0

                if (saldoDespues < saldoAntes) {
                    tvMovimientos.text = "Retiro: -$monto"
                }

                etMonto.text.clear()
            }
        }
    }
}