package com.agpaz.bankapi.service

import com.agpaz.bankapi.model.Account
import java.util.Optional

interface AccountService {
    fun create(account: Account): Account
    fun getAll(): List<Account>
    fun getById(id: Long): Optional<Account>
    fun update(id: Long, account: Account): Optional<Account>
    fun delete(id: Long)
}