package com.panda.study.design.patterns.creational.singleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class DemoSingletonTest {


  @Test
  public void 修改单例() throws Exception {
    DemoSingleton instance = DemoSingleton.getInstance();
    // Serialize to a file
    ObjectOutput out = new ObjectOutputStream(new FileOutputStream(
        "filename.ser"));
    out.writeObject(instance);
    out.close();
    instance.setValue(20);
    // Serialize to a file
    ObjectInput in = new ObjectInputStream(new FileInputStream(
        "filename.ser"));
    DemoSingleton instanceTwo = (DemoSingleton) in.readObject();
    in.close();
    System.out.println(instance.getValue());
    System.out.println(instanceTwo.getValue());
  }
}
