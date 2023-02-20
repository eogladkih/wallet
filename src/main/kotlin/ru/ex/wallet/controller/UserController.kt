package ru.ex.wallet.controller

import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import ru.ex.wallet.dto.UserDto
import ru.ex.wallet.service.UserService

@RestController
@RequestMapping("/users")
class UserController(
    private val userService: UserService,
) {
    @GetMapping
    fun getAll(): List<UserDto> = userService.getAll()

    @PostMapping
    fun create(@RequestBody dto: UserDto): Int = userService.create(dto)

    @GetMapping("/{id}")
    fun read(@PathVariable("id") id: Int): UserDto = userService.read(id)

    @PutMapping("/{id}")
    fun update(@PathVariable("id") id: Int, @RequestBody dto: UserDto) = userService.update(id, dto)

    @DeleteMapping("/{id}")
    fun delete(@PathVariable("id") id: Int) = userService.delete(id)
}
