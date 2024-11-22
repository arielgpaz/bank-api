package com.agpaz.bankapi.controller

import com.agpaz.bankapi.model.Account

data class AccountResponse(
    var id: Long? = null,
    val name: String,
    val document: String,
    val phone: String
)

fun Account.toResponse() = AccountResponse(id, name, document, phone)