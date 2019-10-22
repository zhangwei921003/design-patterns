package com.panda.study.design.patterns.creational.factory;

import com.panda.study.design.patterns.contract.enums.CarType;
import com.panda.study.design.patterns.contract.exception.NotFoundException;

public class CarFactory {

  public static Car getInstance(CarType carType) {
    switch (carType) {
      case SEDAN:
        return new SedanCar();
      case SMALL:
        return new SmallCar();
      case LUXURY:
        return new LuxuryCar();
      default:
        throw new NotFoundException("Not Found match car type");
    }
  }
}
