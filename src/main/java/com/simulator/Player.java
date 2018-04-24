package com.simulator;

import java.util.ArrayList;

public class Player {
  private final ArrayList <String> possibilities;

  public Player() {
    this.possibilities = new ArrayList<String> (){{
      add ( "out" );
      add ( "zero" );
      add ( "one" );
      add ( "two" );
      add ( "three" );
      add ( "four" );
      add ( "five" );
      add ( "six" );
    }};
  }

  public String play() {
    return possibilities.get ( (int) Math.floor ( Math.random ()*8 ) );
  }
}
