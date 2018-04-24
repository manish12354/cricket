package com.simulator;

import java.util.ArrayList;

public class Game implements Listener {
  private int balls;
  private final Umpire umpire;
  private final ArrayList <Team> teams;
  private final ArrayList <Player> currentBatsMan;

  public Game(Umpire umpire , int overs) {
    this.umpire = umpire;
    this.balls = overs*6;
    this.teams = new ArrayList <> ();
    this.currentBatsMan = new ArrayList <> ();
  }

  public void add(Team team) {
    teams.add ( team );
  }

  public void start() {
    while (balls!=0){
      if (balls%6==0) {
        rotatePlayers ();
      }
      String action = teams.get ( 0 ).startPlay ();
      System.out.println (action);
      umpire.decide ( action );
      balls--;
    }
  }

  @Override
  public void listen(Integer latestScore) {
    if (latestScore % 2 == 1) {
      rotatePlayers ();
    }
  }

  private void rotatePlayers() {
    Player player = currentBatsMan.get ( 0 );
    currentBatsMan.remove ( player );
    currentBatsMan.add ( player );
  }

  public static void main(String[] args) {
    Player kirat = new Player ();
    Player boni = new Player ();
    Player rahul = new Player ();
    ArrayList <Player> players = new ArrayList <Player> () {{
      add ( kirat );
      add ( boni );
      add ( rahul );
    }};
    Team team = new Team ( players );
    Listeners listeners = new Listeners ();
    Commentrator commentrator = new Commentrator ();
    listeners.add ( commentrator );
    listeners.add ( team );
    Umpire umpire = new Umpire ( listeners );
    Game cricketMatch = new Game ( umpire , 4 );
    cricketMatch.add (team);
    cricketMatch.start();
  }
}