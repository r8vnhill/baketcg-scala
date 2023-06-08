package cl.ravenhill.edu.baketcg

import model.{Player, WinCondition}
import observer.{Observer, Subject}

class GameController(private val players: List[Player]) extends Observer {
  for (player <- players) {
    player.addObserver(this)
  }

  override def update(subject: Subject, value: Any): Unit = {
    if (value.isInstanceOf[WinCondition]) {
      val winCondition = value.asInstanceOf[WinCondition]
      println(s"Player $subject has won the game with $winCondition")
    }
  }
}
