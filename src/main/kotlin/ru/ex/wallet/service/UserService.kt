package ru.ex.wallet.service

import ru.ex.wallet.dto.UserDto

interface UserService {
        fun getAll(): List<UserDto>
}