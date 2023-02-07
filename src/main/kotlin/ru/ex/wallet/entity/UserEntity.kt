package ru.ex.wallet.entity

import jakarta.persistence.*


@Entity
@Table(name = "\"user\"")
class UserEntity (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Int,
    val name: String
)