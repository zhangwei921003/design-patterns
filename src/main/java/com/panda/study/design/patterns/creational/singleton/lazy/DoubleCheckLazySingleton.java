package com.panda.study.design.patterns.creational.singleton.lazy;

public class DoubleCheckLazySingleton {

  private static volatile DoubleCheckLazySingleton instance = null;

  private DoubleCheckLazySingleton() {
  }

  public static DoubleCheckLazySingleton getInstance() {
    if (null == instance) {
      synchronized (DoubleCheckLazySingleton.class) {
        // Double check
        if (null == instance) {
          instance = new DoubleCheckLazySingleton();
        }
      }
    }
    return instance;
  }
}
