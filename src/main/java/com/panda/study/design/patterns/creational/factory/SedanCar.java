package com.panda.study.design.patterns.creational.factory;

import static com.panda.study.design.patterns.contract.enums.CarType.SEDAN;

public class SedanCar extends Car {

  public SedanCar() {
    super(SEDAN);
  }

  @Override
  protected void construct() {
    System.out.println("Building sedan car");
  }
}
