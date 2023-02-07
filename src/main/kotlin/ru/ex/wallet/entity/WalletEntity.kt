package ru.ex.wallet.entity

import jakarta.persistence.*


@Entity
@Table(name="wallet")
class WalletEntity (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Int,
    val name: String
)