package com.home.bank.backend.service

class AccountDatabaseRepository(
  private val postgresqlUrl: String,
  private val postgresqlPort: Int,
  private val name: String,
  private val password: String,
  private val databaseName: String
) {
  fun getDetailsFromDatabase(): Double {
    return 123123.2
  }
}
