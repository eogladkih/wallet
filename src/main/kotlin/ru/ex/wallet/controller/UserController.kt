package ru.ex.wallet.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import ru.ex.wallet.dto.UserDto
import ru.ex.wallet.service.UserService
import ru.ex.wallet.service.impl.UserServiceImpl

@RestController
@RequestMapping("/users")
class UserController (
    private val userService: UserService
){

    @GetMapping

    fun getAll(): List<UserDto> = userService.getAll()
}