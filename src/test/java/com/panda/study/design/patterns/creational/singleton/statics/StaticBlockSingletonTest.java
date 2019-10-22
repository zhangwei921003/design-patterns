package com.panda.study.design.patterns.creational.singleton.statics;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class StaticBlockSingletonTest {

  @Test
  public void 静态块单例() {
    StaticBlockSingleton instance = StaticBlockSingleton.getInstance();

    System.out.println(instance);
    System.out.println(StaticBlockSingleton.getInstance());
    System.out.println(StaticBlockSingleton.getInstance());
    System.out.println(StaticBlockSingleton.getInstance());
  }
}
