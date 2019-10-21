package com.panda.study.design.patterns.creational.factory;

import static com.panda.study.design.patterns.creational.factory.CarFactory.getInstance;
import static com.panda.study.design.patterns.creational.factory.CarType.AUDI;
import static com.panda.study.design.patterns.creational.factory.CarType.LUXURY;
import static com.panda.study.design.patterns.creational.factory.CarType.SEDAN;
import static com.panda.study.design.patterns.creational.factory.CarType.SMALL;

public class TestFactoryPattern {

  public static void main(String[] args) {
    System.out.println(getInstance(SMALL));
    System.out.println(getInstance(SEDAN));
    System.out.println(getInstance(LUXURY));
    System.out.println(getInstance(AUDI));
  }
}
