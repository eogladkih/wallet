package ru.ex.wallet.service.impl

import org.springframework.stereotype.Service
import ru.ex.wallet.dto.UserDto
import ru.ex.wallet.entity.UserEntity
import ru.ex.wallet.repository.UserRepository
import ru.ex.wallet.service.UserService

@Service
class UserServiceImpl(
    private val userRepository: UserRepository
) : UserService {
    override fun getAll(): List<UserDto> {
        return userRepository.findAll().map { it.toDto() }
    }

    private fun UserEntity.toDto(): UserDto =
        UserDto(
            id = this.id,
            name = this.name,
        )
}