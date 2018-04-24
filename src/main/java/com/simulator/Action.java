package com.simulator;

public enum  Action {
  ONE(0.1),TWO(2.0),THREE(0.5),FOUR(0.4),FIVE(0.5),SIX(0.1),OUT(0.5),ZERO(4.0);

  final Double probability;

  Action(Double probability) {
    this.probability = probability;
  }
}
