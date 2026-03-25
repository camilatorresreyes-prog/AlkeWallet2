package com.example.alkewallet.domain.usecase

import com.example.alkewallet.data.WalletRepository

class RetirarUseCase(
    private val repository: WalletRepository
) {
    operator fun invoke(monto: Int): Boolean {
        return repository.retirar(monto)
    }
}