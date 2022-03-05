package com.home.bank.backend

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class BankApplication {
  companion object {
    @JvmStatic
    fun main(args: Array<String>) {
      SpringApplication(BankApplication::class.java).run()
    }
  }
}
