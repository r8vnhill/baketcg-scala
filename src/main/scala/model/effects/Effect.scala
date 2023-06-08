
package cl.ravenhill.edu.baketcg
package model.effects

import model.Card

trait Effect {
  def apply(self: Card, target: Card): Unit
}
