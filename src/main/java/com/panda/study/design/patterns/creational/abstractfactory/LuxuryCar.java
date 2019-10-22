package com.panda.study.design.patterns.creational.abstractfactory;

import com.panda.study.design.patterns.contract.enums.CarType;
import com.panda.study.design.patterns.contract.enums.Location;

public class LuxuryCar extends Car {

  public LuxuryCar(Location location) {
    super(CarType.LUXURY, location);
  }

  @Override
  protected void construct() {
    System.out.println("Building luxury car");
  }
}
