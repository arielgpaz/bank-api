package com.agpaz.bankapi.controller

import com.agpaz.bankapi.model.Account

data class AccountRequest(
    val name: String,
    val document: String,
    val phone: String
)

fun AccountRequest.toModel() = Account(name = name, document = document, phone = phone)