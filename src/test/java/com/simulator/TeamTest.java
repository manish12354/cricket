package com.simulator;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class TeamTest {

  private ArrayList <Player> players;
  private Team team;
  private Player kirat;
  private Player boni;
  private Player rahul;

  @Before
  public void setUp() {
    kirat = new Player ();
    boni = new Player ();
    rahul = new Player ();
    players = new ArrayList<Player> () {{
      add ( kirat );
      add ( boni );
      add ( rahul );
    }};
    team = new Team ( players );
  }

  @Test
  public void shouldRotatePlayers() {
    team.listen (1);
  }
}
