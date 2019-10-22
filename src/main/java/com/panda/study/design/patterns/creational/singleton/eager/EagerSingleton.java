package com.panda.study.design.patterns.creational.singleton.eager;

public class EagerSingleton {

  private static EagerSingleton instance = new EagerSingleton();

  private EagerSingleton() {
    //must private
  }

  public static EagerSingleton getInstance() {
    return instance;
  }
}
