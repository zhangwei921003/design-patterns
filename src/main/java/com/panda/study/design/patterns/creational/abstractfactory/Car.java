package com.panda.study.design.patterns.creational.abstractfactory;

import lombok.Data;

@Data
public abstract class Car {

  private final CarType model;
  private final Location location;

  public Car(CarType model, Location location) {
    this.model = model;
    this.location = location;
    arrangeParts();
    construct();
  }

  private void arrangeParts() {
    // Do one time processing here
  }

  // Do subclass level processing in this method
  protected abstract void construct();

  @Override
  public String toString() {
    return "Model- "+model + " built in "+location;
  }

}
