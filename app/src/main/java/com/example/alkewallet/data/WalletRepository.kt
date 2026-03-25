package com.example.alkewallet.data

import com.example.alkewallet.model.Wallet

class WalletRepository {

    private val wallet = Wallet()

    fun getSaldo(): Int {
        return wallet.saldo
    }

    fun depositar(monto: Int) {
        wallet.saldo += monto
    }

    fun retirar(monto: Int): Boolean {
        return if (monto <= wallet.saldo) {
            wallet.saldo -= monto
            true
        } else {
            false
        }
    }
}