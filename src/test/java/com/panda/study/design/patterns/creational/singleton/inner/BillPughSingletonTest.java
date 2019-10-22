package com.panda.study.design.patterns.creational.singleton.inner;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class BillPughSingletonTest {

  @Test
  public void 内部类单例() {
    BillPughSingleton instance = BillPughSingleton.getInstance();
    System.out.println(instance);
    System.out.println(BillPughSingleton.getInstance());
    System.out.println(BillPughSingleton.getInstance());
    System.out.println(BillPughSingleton.getInstance());
    System.out.println(BillPughSingleton.getInstance());
  }
}
