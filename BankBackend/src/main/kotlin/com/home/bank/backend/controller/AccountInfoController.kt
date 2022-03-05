package com.home.bank.backend.controller

import com.home.bank.backend.controller.pojo.AccountInfo
import mu.KLogging
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/account")
class AccountInfoController {
  companion object : KLogging()

  @GetMapping("/balance")
  fun accountBalance(): AccountInfo {
    logger.info { "Yo got request to account balance" }
    return AccountInfo(1488.0)
  }
}
