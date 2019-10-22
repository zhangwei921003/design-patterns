package com.panda.study.design.patterns.creational.abstractfactory;

import static com.panda.study.design.patterns.creational.abstractfactory.DefaultCarFactory.getCar;
import static com.panda.study.design.patterns.contract.enums.Location.USA;

import com.panda.study.design.patterns.contract.enums.CarType;

public class USACarFactory {

  public static Car getInstance(CarType carType) {
    return getCar(carType, USA);
  }
}
