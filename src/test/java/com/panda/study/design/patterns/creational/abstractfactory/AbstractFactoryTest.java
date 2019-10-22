package com.panda.study.design.patterns.creational.abstractfactory;

import static com.panda.study.design.patterns.contract.enums.CarType.LUXURY;
import static com.panda.study.design.patterns.contract.enums.CarType.SEDAN;
import static com.panda.study.design.patterns.contract.enums.CarType.SMALL;
import static com.panda.study.design.patterns.creational.abstractfactory.CarFactory.getInstance;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class AbstractFactoryTest {

  @Test
  public void 抽象工厂() {
    System.out.println(getInstance(SMALL));
    System.out.println(getInstance(SEDAN));
    System.out.println(getInstance(LUXURY));
  }
}
