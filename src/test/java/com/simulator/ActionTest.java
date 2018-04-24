package com.simulator;

import org.junit.Test;

public class ActionTest {
  @Test
  public void name() {
    Action single = Action.ONE;
    System.out.println (single.probability);
  }
}
