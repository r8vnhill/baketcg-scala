
package cl.ravenhill.edu.baketcg
package model.effects

import model.Card

class NullEffect extends Effect {
  override def apply(self: Card, target: Card): Unit = {
    // Do nothing
  }
}
