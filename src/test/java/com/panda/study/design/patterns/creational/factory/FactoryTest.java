package com.panda.study.design.patterns.creational.factory;

import static com.panda.study.design.patterns.creational.factory.CarType.AUDI;
import static com.panda.study.design.patterns.creational.factory.CarType.LUXURY;
import static com.panda.study.design.patterns.creational.factory.CarType.SEDAN;
import static com.panda.study.design.patterns.creational.factory.CarType.SMALL;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class FactoryTest {

  @Test
  public void 抽象工厂() {
    System.out.println(CarFactory.getInstance(SMALL));
    System.out.println(CarFactory.getInstance(SEDAN));
    System.out.println(CarFactory.getInstance(LUXURY));
    System.out.println(CarFactory.getInstance(AUDI));
  }
}
