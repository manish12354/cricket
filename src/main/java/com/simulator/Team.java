package com.simulator;

import java.util.ArrayList;

public class Team implements Listener{
  private final ArrayList<Player> remainingPlayers;
  private int score;
  private final ArrayList <Player> outPlayers;
  private final ArrayList <Player> strikers;

  public Team(ArrayList Players) {
    this.remainingPlayers = Players;
    this.outPlayers = new ArrayList<> ();
    this.strikers =new ArrayList<Player> (){{
      add ( remainingPlayers.get ( 0 ) );
      add ( remainingPlayers.get ( 1 ) );
    }};
    this.score = 0;
  }

  @Override
  public void listen(Integer latestScore){
    if (latestScore<0) {
      Player outPlayer = strikers.get ( 0 );
      sendNewPlayer( outPlayer );
      return;
    }
    score+=latestScore;
  }

  private void sendNewPlayer(Player outPlayer) {
    if (remainingPlayers.isEmpty ())
      return;
    Player player = remainingPlayers.get(0);
    remainingPlayers.remove (outPlayer);
    strikers.remove ( outPlayer );
    outPlayers.add ( outPlayer );
    strikers.add ( 0, player);
  }

  public String startPlay() {
    Player striker = strikers.get ( 0 );
    return striker.play ();
  }
}
