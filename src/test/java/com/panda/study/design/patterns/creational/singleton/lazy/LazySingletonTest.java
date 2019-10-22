package com.panda.study.design.patterns.creational.singleton.lazy;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class LazySingletonTest {

  @Test
  public void 懒汉式单例() {
    LazySingleton instance = LazySingleton.getInstance();

    System.out.println(instance);
    System.out.println(LazySingleton.getInstance());
    System.out.println(LazySingleton.getInstance());
    System.out.println(LazySingleton.getInstance());
  }
}
