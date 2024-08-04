package io.github.techtastic.hexcasted.munitions.big_cannon.hex_shell

import net.minecraft.core.Position
import net.minecraft.world.entity.EntityType
import net.minecraft.world.level.Level
import net.minecraft.world.level.block.state.BlockState
import rbasamoyai.createbigcannons.index.CBCMunitionPropertiesHandlers
import rbasamoyai.createbigcannons.munitions.big_cannon.FuzedBigCannonProjectile

class HexShellProjectile(type: EntityType<out FuzedBigCannonProjectile>, level: Level) : FuzedBigCannonProjectile(type, level) {
    override fun getDamageProperties() = this.getAllProperties().damage

    override fun getBallisticProperties() = this.getAllProperties().ballistics

    override fun getRenderedBlockState(): BlockState {
        TODO("Not yet implemented")
    }

    override fun getBigCannonProjectileProperties() = this.getAllProperties().bigCannonProperties

    override fun getFuzeProperties() = this.getAllProperties().fuze

    override fun detonate(target: Position) {

    }

    private fun getAllProperties() =
        CBCMunitionPropertiesHandlers.COMMON_SHELL_BIG_CANNON_PROJECTILE.getPropertiesOf(this)
}