package com.panda.study.design.patterns.creational.factory;

import static com.panda.study.design.patterns.contract.enums.CarType.SMALL;

public class SmallCar extends Car {

  public SmallCar() {
    super(SMALL);
  }

  @Override
  protected void construct() {
    System.out.println("Building small car");
  }
}
