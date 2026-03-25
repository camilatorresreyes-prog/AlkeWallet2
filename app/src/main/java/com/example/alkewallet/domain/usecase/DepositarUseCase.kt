package com.example.alkewallet.domain.usecase

import com.example.alkewallet.data.WalletRepository

class DepositarUseCase(
    private val repository: WalletRepository
) {
    operator fun invoke(monto: Int) {
        repository.depositar(monto)
    }
}