package cl.ravenhill.edu.baketcg

import model.{Player, WinCondition}
import observer.{Observer, Subject}

class GameController(private val players: List[Player])
    extends Observer[WinCondition] {
  for (player <- players) {
    player.addObserver(this)
  }

  override def update(
      subject: Subject[WinCondition],
      value: WinCondition
  ): Unit = {
    val winCondition = value.asInstanceOf[WinCondition]
    println(s"Player $subject has won the game with ${winCondition.name}")
  }
}
