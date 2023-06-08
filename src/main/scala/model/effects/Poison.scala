package cl.ravenhill.edu.baketcg
package model.effects

import model.Card

class Poison extends Effect {
  override def apply(self: Card, target: Card): Unit = {
    println(s"${target.name} is poisoned!")
  }
}
