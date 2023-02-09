package ru.ex.wallet.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import ru.ex.wallet.dto.WalletDto

@RestController
@RequestMapping("/wallets")
class WalletController {
    @GetMapping
    fun getAll(): List<WalletDto> = listOf(
        WalletDto(1, "RUR"),
        WalletDto(2, "USD"),
        WalletDto(3, "TBT"),
    )
}