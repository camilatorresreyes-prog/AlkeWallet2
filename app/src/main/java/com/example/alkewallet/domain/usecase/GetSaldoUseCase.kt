package com.example.alkewallet.domain.usecase

import com.example.alkewallet.data.WalletRepository

class GetSaldoUseCase(
    private val repository: WalletRepository
) {
    operator fun invoke(): Int {
        return repository.getSaldo()
    }
}