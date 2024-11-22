package com.agpaz.bankapi.controller

import com.agpaz.bankapi.service.AccountService
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/accounts")
class AccountController(private val service: AccountService) {

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    fun create(@RequestBody accountRequest: AccountRequest): AccountResponse =
        service.create(accountRequest.toModel()).toResponse()

    @GetMapping
    fun getAll(): List<AccountResponse> =
        service.getAll().map { it.toResponse() }

    @GetMapping("/{id}")
    fun getById(@PathVariable id: Long): ResponseEntity<AccountResponse> =
        service.getById(id).map {
            ResponseEntity.ok(it.toResponse())
        }.orElse(ResponseEntity.notFound().build())

    @PutMapping("/{id}")
    fun update(@PathVariable id: Long, @RequestBody accountRequest: AccountRequest): ResponseEntity<AccountResponse> =
        service.update(id, accountRequest.toModel()).map {
            ResponseEntity.ok(it.toResponse())
        }.orElse(ResponseEntity.notFound().build())

    @DeleteMapping("/{id}")
    fun delete(@PathVariable id: Long): ResponseEntity<Void> {
        service.delete(id)
        return ResponseEntity.ok().build()
    }
}

