package com.panda.study.design.patterns.creational.singleton;

import java.io.Serializable;
import lombok.Data;

@Data
public class DemoSingleton implements Serializable {

  private static DemoSingleton instance = null;
  private Integer value = 10;

  public static DemoSingleton getInstance() {
    if (instance == null) {
      instance = new DemoSingleton();
    }
    return instance;
  }

  protected Object readResolve() {
    return instance;
  }
}
