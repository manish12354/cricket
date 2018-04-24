package com.simulator;

public class Commentrator implements Listener {
  private String commentry;

  public Commentrator() {
    this.commentry = "";
  }

  @Override
  public void listen(Integer decision) {
    commentry+=decision+"\n";
  }

  public void doCommentry(){
    for (String s : commentry.split ( "\n" )) {
      System.out.println (s);
    }
  }
}
