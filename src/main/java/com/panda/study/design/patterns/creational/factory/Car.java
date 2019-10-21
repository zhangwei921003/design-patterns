package com.panda.study.design.patterns.creational.factory;

import lombok.Data;

@Data
public abstract class Car {

  private final CarType model;

  public Car(CarType model) {
    this.model = model;
    arrangeParts();
    construct();
  }

  private void arrangeParts() {
    // Do one time processing here
  }

  // Do subclass level processing in this method
  protected abstract void construct();

}
