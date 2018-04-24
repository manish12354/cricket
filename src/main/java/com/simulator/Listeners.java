package com.simulator;

import java.util.ArrayList;

public class Listeners {
  private final ArrayList <Listener> listeners;

  public Listeners() {
    this.listeners = new ArrayList<> (  );
  }

  public void listen(Integer decision) {
    for (Listener listener : listeners) {
      listener.listen(decision);
    }
  }

  public void add(Listener listener) {
    listeners.add ( listener );
  }
}
