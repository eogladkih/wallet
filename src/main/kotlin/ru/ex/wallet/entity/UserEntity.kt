package ru.ex.wallet.entity

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.Table

@Entity
@Table(name = "wallet_user")
class UserEntity(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Int,
    var name: String,
//    @OneToMany(mappedBy = "user")
//    val wallets: List<WalletEntity> = emptyList(),
)
