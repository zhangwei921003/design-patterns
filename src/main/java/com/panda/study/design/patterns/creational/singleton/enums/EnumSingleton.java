package com.panda.study.design.patterns.creational.singleton.enums;

import lombok.Getter;

@Getter
public enum EnumSingleton {
  INSTANCE;

  public void someMethod(String param) {
    // some class member
  }
}
