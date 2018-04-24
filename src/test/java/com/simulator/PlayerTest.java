package com.simulator;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class PlayerTest {
  @Test
  public void shouldPlay() {
    Player player = new Player ();
    String score = player.play ();
    assertThat( score,is(2));
  }
}
