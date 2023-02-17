package ru.ex.wallet.service.impl

import org.springframework.data.repository.findByIdOrNull
import org.springframework.stereotype.Service
import ru.ex.wallet.dto.UserDto
import ru.ex.wallet.entity.UserEntity
import ru.ex.wallet.repository.UserRepository
import ru.ex.wallet.service.UserService
import java.lang.RuntimeException

@Service
class UserServiceImpl(
    private val userRepository: UserRepository,
) : UserService {
    override fun getAll(): List<UserDto> {
        return userRepository.findAll().map { it.toDto() }
    }

    override fun create(dto: UserDto): Int {
        return userRepository.save(dto.toEntity()).id
    }

    override fun update(id: Int, dto: UserDto) {
        val existingUser = userRepository.findByIdOrNull(id)
            ?: throw RuntimeException("User not found")

        existingUser.name = dto.name

        userRepository.save(existingUser)
    }

    override fun delete(id: Int) {
        val existingUser = userRepository.findByIdOrNull(id)
            ?: throw RuntimeException("User not found")

        userRepository.deleteById(existingUser.id)
    }

    override fun read(id: Int): UserDto {
        return userRepository.findByIdOrNull(id)
            ?.toDto()
            ?: throw RuntimeException("User not found")
    }

    private fun UserEntity.toDto(): UserDto =
        UserDto(
            id = this.id,
            name = this.name,
        )

    private fun UserDto.toEntity(): UserEntity =
        UserEntity(
            id = 0,
            name = this.name,
        )
}
