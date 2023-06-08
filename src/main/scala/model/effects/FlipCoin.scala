package cl.ravenhill.edu.baketcg
package model.effects

import model.Card

class FlipCoin(val ifHeads: Effect, val ifTails: Effect) extends Effect {
  override def apply(self: Card, target: Card): Unit = {
    if (Math.random() < 0.5) {
      ifHeads(self, target)
    } else {
      ifTails(self, target)
    }
  }
}
