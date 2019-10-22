package com.panda.study.design.patterns.creational.singleton.lazy;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class DoubleCheckLazySingletonTest {

  @Test
  public void double_checked_locking_懒汉式单例() {
    DoubleCheckLazySingleton instance = DoubleCheckLazySingleton.getInstance();

    System.out.println(instance);
    System.out.println(DoubleCheckLazySingleton.getInstance());
    System.out.println(DoubleCheckLazySingleton.getInstance());
    System.out.println(DoubleCheckLazySingleton.getInstance());
  }
}
