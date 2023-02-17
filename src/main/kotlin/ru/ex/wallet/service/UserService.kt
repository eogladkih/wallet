package ru.ex.wallet.service

import ru.ex.wallet.dto.UserDto

interface UserService {
    fun getAll(): List<UserDto>
    fun create(dto: UserDto): Int
    fun read(id: Int): UserDto
    fun update(id: Int, dto: UserDto)
    fun delete(id: Int)
}
