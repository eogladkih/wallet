package ru.ex.wallet.repository

import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository
import ru.ex.wallet.entity.UserEntity

@Repository
interface UserRepository : CrudRepository<UserEntity, Int>
