package com.panda.study.design.patterns.creational.abstractfactory;

import static com.panda.study.design.patterns.creational.abstractfactory.CarFactory.getInstance;
import static com.panda.study.design.patterns.creational.abstractfactory.CarType.LUXURY;
import static com.panda.study.design.patterns.creational.abstractfactory.CarType.SEDAN;
import static com.panda.study.design.patterns.creational.abstractfactory.CarType.SMALL;

public class TestFactoryPattern {

  public static void main(String[] args) {
    System.out.println(getInstance(SMALL));
    System.out.println(getInstance(SEDAN));
    System.out.println(getInstance(LUXURY));
  }
}
