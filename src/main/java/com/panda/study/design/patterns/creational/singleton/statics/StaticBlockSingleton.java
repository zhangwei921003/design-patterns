package com.panda.study.design.patterns.creational.singleton.statics;

import com.panda.study.design.patterns.contract.exception.NotModifiedException;

public class StaticBlockSingleton {

  private static final StaticBlockSingleton INSTANCE;

  static {
    try {
      INSTANCE = new StaticBlockSingleton();

    } catch (Exception e) {
      throw new NotModifiedException("Uffff, i was not expecting this!", e);
    }
  }

  public static StaticBlockSingleton getInstance() {
    return INSTANCE;
  }

  private StaticBlockSingleton() {

  }
}
