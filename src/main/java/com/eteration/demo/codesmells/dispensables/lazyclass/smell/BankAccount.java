package com.eteration.demo.codesmells.dispensables.lazyclass.smell;

import java.math.BigDecimal;

public class BankAccount {
  private final Account account;

  public BankAccount(Account account) {
    this.account = account;
  }

  public long getId() {
    return account.getId();
  }

  public void setId(long id) {
    account.setId(id);
  }

  public BigDecimal getBalance() {
    return account.getBalance();
  }

  public void setBalance(BigDecimal balance) {
    account.setBalance(balance);
  }
}
