package com.agpaz.bankapi.repository

import com.agpaz.bankapi.model.Account
import org.springframework.data.jpa.repository.JpaRepository

interface AccountRepository : JpaRepository<Account, Long> {
}