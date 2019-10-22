package com.panda.study.design.patterns.creational.abstractfactory;

import com.panda.study.design.patterns.contract.enums.CarType;
import com.panda.study.design.patterns.contract.enums.Location;

public class SedanCar extends Car {

  public SedanCar(Location location) {
    super(CarType.SEDAN, location);
  }

  @Override
  protected void construct() {
    System.out.println("Building sedan car");
  }
}
