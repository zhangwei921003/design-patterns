package com.panda.study.design.patterns.creational.factory;

import static com.panda.study.design.patterns.contract.enums.CarType.LUXURY;

public class LuxuryCar extends Car {

  public LuxuryCar() {
    super(LUXURY);
  }

  @Override
  protected void construct() {
    System.out.println("Building luxury car");
  }
}
