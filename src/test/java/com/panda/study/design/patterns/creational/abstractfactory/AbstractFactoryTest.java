package com.panda.study.design.patterns.creational.abstractfactory;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import static com.panda.study.design.patterns.creational.abstractfactory.CarFactory.getInstance;
import static com.panda.study.design.patterns.creational.abstractfactory.CarType.*;

@RunWith(MockitoJUnitRunner.class)
public class AbstractFactoryTest {

    @Test
    public void 抽象工厂() {
        System.out.println(getInstance(SMALL));
        System.out.println(getInstance(SEDAN));
        System.out.println(getInstance(LUXURY));
    }
}
