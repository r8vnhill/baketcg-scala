package cl.ravenhill.edu.baketcg
package model.effects

import model.Card

class Paralyze extends Effect {
  override def apply(self: Card, target: Card): Unit = {
    println(s"${target.name} is paralyzed!")
  }
}
