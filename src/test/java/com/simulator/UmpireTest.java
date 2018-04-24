package com.simulator;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class UmpireTest {

  private Listeners listeners;
  private Umpire umpire;

  @Before
  public void setUp() {
    listeners = new Listeners ();
    listeners.add(new ScoreBoard ());
    umpire = new Umpire ( listeners );
  }

  @Test
  public void shouldGiveZeroIfPlayerScoredZero() {
    Integer score = umpire.decide ( "zero");
    assertThat (score , is(0));
  }

  @Test
  public void shouldGiveOutIfPlayerPlayedNegative() {
    Integer score = umpire.decide ( "out" );
    assertThat (score , is ( -1 ));
  }

  @Test
  public void shouldGiveSixIfPlayerScoredSix() {
    Integer score = umpire.decide ( "six" );
    assertThat (score , is ( 6 ));
  }
}
