package com.simulator;

import java.util.HashMap;

public class Umpire {
  private final HashMap <String, Integer> decisions;
  private final Listeners listeners;

  public Umpire(Listeners listeners) {
    this.listeners = listeners;
    this.decisions = new HashMap<> (  );
    setup();
  }

  private void setup() {
    decisions.put ( "out" , -1 );
    decisions.put ( "zero" , 0 );
    decisions.put ( "one" , 1 );
    decisions.put ( "two" , 2 );
    decisions.put ( "three" , 3 );
    decisions.put ( "four" , 4 );
    decisions.put ( "five" , 5 );
    decisions.put ( "six" , 6 );
  }

  public Integer decide(String action) {
    Integer decision = decisions.get ( action );
    listeners.listen(decision);
    return decision;
  }
}
