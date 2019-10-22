package com.panda.study.design.patterns.creational.singleton.eager;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class EagerSingletonTest {

  @Test
  public void 饿汉式单例() {
    EagerSingleton instance = EagerSingleton.getInstance();

    System.out.println(instance);
  }
}
