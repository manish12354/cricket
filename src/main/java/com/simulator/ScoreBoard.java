package com.simulator;

public class ScoreBoard{
  private String scoreCard;

  public ScoreBoard() {
    this.scoreCard = "";
  }

  public void recordTeamName(String name){
    scoreCard+=name+"\n";
  }

  public void recordPalyerNameAndScore(String name, int score ){
    scoreCard+=name;
    scoreCard+=score+"\n";
  }
}
