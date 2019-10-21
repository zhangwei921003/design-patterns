package com.panda.study.design.patterns.creational.factory;

public class LuxuryCar extends Car {

  public LuxuryCar() {
    super(CarType.LUXURY);
  }

  @Override
  protected void construct() {
    System.out.println("Building luxury car");
  }
}
