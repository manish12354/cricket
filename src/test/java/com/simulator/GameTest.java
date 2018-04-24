package com.simulator;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class GameTest {

  private Player kirat;
  private Player boni;
  private Player rahul;
  private ArrayList <Player> players;
  private Team team;
  private Game cricket;

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


    Listeners listeners = new Listeners ();
    Commentrator commentrator = new Commentrator ();
    listeners.add ( commentrator );
    listeners.add ( team );
    Umpire umpire = new Umpire (listeners);
    cricket = new Game ( umpire , 4 );
  }

  @Test
  public void name() {
    cricket.start();
  }
}
