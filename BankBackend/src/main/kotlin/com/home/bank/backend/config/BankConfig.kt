package com.home.bank.backend.config

import com.home.bank.backend.service.AccountDatabaseRepository
import com.home.bank.backend.service.AccountService
import org.springframework.beans.factory.annotation.Value
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class BankConfig {
  @Bean
  fun accountServiceBean(bankRepository: AccountDatabaseRepository): AccountService {
    return AccountService(bankRepository)
  }

  @Bean
  fun repository(@Value("\${POSTGRESQL_URL}") databaseUrl: String): AccountDatabaseRepository {
    return AccountDatabaseRepository(databaseUrl, 123512, " adsfas ", " asdfas ", " asdfasdf ")
  }
}
