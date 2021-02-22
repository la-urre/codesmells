package com.eteration.demo.codesmells.couplers.featureenvy.smell;

public class BICProcessor {
  public String getBIC(Bank bank) {
    return bank.getBankCode() + bank.getCountryCode() + bank.getLocationCode();
  }
}
