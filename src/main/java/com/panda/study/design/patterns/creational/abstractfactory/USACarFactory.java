package com.panda.study.design.patterns.creational.abstractfactory;

import static com.panda.study.design.patterns.creational.abstractfactory.DefaultCarFactory.getCar;
import static com.panda.study.design.patterns.creational.abstractfactory.Location.USA;

public class USACarFactory {

  public static Car getInstance(CarType carType) {
    return getCar(carType, USA);
  }
}
