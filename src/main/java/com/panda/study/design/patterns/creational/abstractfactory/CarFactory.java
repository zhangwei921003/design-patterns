package com.panda.study.design.patterns.creational.abstractfactory;

public class CarFactory {
  private CarFactory() {
    //Prevent instantiation
  }

  public static Car getInstance(CarType type)
  {
    Car car = null;
    Location location = Location.ASIA; //Read location property somewhere from configuration
    //Use location specific car factory
    switch(location)
    {
      case USA:
        return USACarFactory.getInstance(type);
      case ASIA:
        return AsiaCarFactory.getInstance(type);
      default:
        return DefaultCarFactory.getInstance(type);
    }
  }
}
