package com.eteration.demo.codesmells.couplers.messagechain.refactored;

public class Customer {
  public CustomerDetails getDetails() {
    return null;
  }

  public boolean isMajor() {
    return getDetails().getAge() >= 18;
  }

  public boolean isLegallyEmancipated() {
    return getDetails().getLegalSituation().isEmancipated();
  }
}
