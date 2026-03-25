package com.example.alkewallet.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.alkewallet.data.WalletRepository
import com.example.alkewallet.domain.usecase.DepositarUseCase
import com.example.alkewallet.domain.usecase.GetSaldoUseCase
import com.example.alkewallet.domain.usecase.RetirarUseCase

class WalletViewModel : ViewModel() {

    private val repository = WalletRepository()
    private val getSaldoUseCase = GetSaldoUseCase(repository)
    private val depositarUseCase = DepositarUseCase(repository)
    private val retirarUseCase = RetirarUseCase(repository)

    val saldo = MutableLiveData<Int>()
    val mensaje = MutableLiveData<String>()

    init {
        saldo.value = getSaldoUseCase()
    }

    fun depositar(monto: Int) {
        if (monto <= 0) {
            mensaje.value = "Monto inválido"
            return
        }

        depositarUseCase(monto)
        saldo.value = getSaldoUseCase()
        mensaje.value = "Depósito exitoso"
    }

    fun retirar(monto: Int) {
        if (monto <= 0) {
            mensaje.value = "Monto inválido"
            return
        }

        val exito = retirarUseCase(monto)

        if (exito) {
            saldo.value = getSaldoUseCase()
            mensaje.value = "Retiro exitoso"
        } else {
            mensaje.value = "Saldo insuficiente"
        }
    }
}