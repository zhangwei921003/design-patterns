package com.panda.study.design.patterns.creational.factory;


import static com.panda.study.design.patterns.contract.enums.CarType.AUDI;
import static com.panda.study.design.patterns.contract.enums.CarType.LUXURY;
import static com.panda.study.design.patterns.contract.enums.CarType.SEDAN;

import com.panda.study.design.patterns.contract.enums.CarType;
import com.panda.study.design.patterns.contract.exception.NotFoundException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class FactoryTest {

  @Test
  public void 工厂() {
    System.out.println(CarFactory.getInstance(CarType.SMALL));
    System.out.println(CarFactory.getInstance(SEDAN));
    System.out.println(CarFactory.getInstance(LUXURY));
  }

  @Test(expected = NotFoundException.class)
  public void should_throw_not_found_exception() {
    CarFactory.getInstance(AUDI);
  }
}
