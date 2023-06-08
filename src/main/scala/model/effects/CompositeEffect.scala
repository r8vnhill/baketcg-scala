
package cl.ravenhill.edu.baketcg
package model.effects

import model.Card

class CompositeEffect(val effects: List[Effect]) extends Effect {
  override def apply(self: Card, target: Card): Unit = {
    for (effect <- effects) {
      effect(self, target)
    }
  }
}
