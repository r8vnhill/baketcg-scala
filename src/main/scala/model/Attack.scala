package cl.ravenhill.edu.baketcg
package model

import model.effects.Effect

class Attack(
    val name: String,
    val damage: Int,
    val cost: Int,
    val effect: Effect
) {
  def apply(self: Card, target: Card): Unit = {
    if (self.energy >= cost) {
      effect(self, target)
      target.hp -= damage
    }
  }
}
