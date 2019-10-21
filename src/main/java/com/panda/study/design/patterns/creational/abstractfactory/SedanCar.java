package com.panda.study.design.patterns.creational.abstractfactory;

public class SedanCar extends Car {

  public SedanCar(Location location) {
    super(CarType.SEDAN, location);
  }

  @Override
  protected void construct() {
    System.out.println("Building sedan car");
  }
}
