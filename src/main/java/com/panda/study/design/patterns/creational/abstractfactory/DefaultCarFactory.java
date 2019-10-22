package com.panda.study.design.patterns.creational.abstractfactory;

import static com.panda.study.design.patterns.contract.enums.Location.DEFAULT;

import com.panda.study.design.patterns.contract.enums.CarType;
import com.panda.study.design.patterns.contract.enums.Location;
import com.panda.study.design.patterns.contract.exception.NotFoundException;

public class DefaultCarFactory {

  public static Car getInstance(CarType carType) {
    return getCar(carType, DEFAULT);
  }

  public static Car getCar(CarType carType, Location location) {
    switch (carType) {
      case SEDAN:
        return new SedanCar(location);
      case SMALL:
        return new SmallCar(location);
      case LUXURY:
        return new LuxuryCar(location);
      default:
        throw new NotFoundException("Not Found match car type");
    }
  }
}
