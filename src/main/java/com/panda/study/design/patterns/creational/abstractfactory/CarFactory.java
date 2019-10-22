package com.panda.study.design.patterns.creational.abstractfactory;

public class CarFactory {

  private CarFactory() {
    //Prevent instantiation
  }

  public static Car getInstance(CarType type) {
    Location location = Location.ASIA;
    switch (location) {
      case USA:
        return USACarFactory.getInstance(type);
      case ASIA:
        return AsiaCarFactory.getInstance(type);
      default:
        return DefaultCarFactory.getInstance(type);
    }
  }
}
