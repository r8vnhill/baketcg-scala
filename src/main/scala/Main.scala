package cl.ravenhill.edu.baketcg

import model.Attack
import model.effects.{CompositeEffect, FlipCoin, NullEffect, Paralyze, Poison}

object Main {
  def main(args: Array[String]): Unit = {
    val needles = new Attack(
      "Needles",
      10,
      4,
      new FlipCoin(
        ifHeads = new CompositeEffect(List(
          new Paralyze(),
          new Poison()
        )),
        ifTails = new NullEffect
      )
    )
  }
}
