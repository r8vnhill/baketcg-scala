package cl.ravenhill.edu.baketcg
package model.effects

import model.Card

class DetachEnergy(val amount: Int, val targetSelf: Boolean) extends Effect {
  override def apply(self: Card, target: Card): Unit = {
    if (targetSelf) {
      target.energy -= amount
    } else {
      self.energy -= amount
    }
  }
}
