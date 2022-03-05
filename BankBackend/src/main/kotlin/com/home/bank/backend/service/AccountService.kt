package com.home.bank.backend.service

class AccountService(val databaseRepository: AccountDatabaseRepository) {
  fun getUserBalanceInfoFromDatabase(): Double {
    //go to authorization service
    //go to database
    //with transaction request info
    return databaseRepository.getDetailsFromDatabase()
  }
}
