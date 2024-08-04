package io.github.techtastic.hexcasted.munitions.big_cannon.hex_shell

import io.github.techtastic.hexcasted.HCEntities.HEX_SHELL
import net.minecraft.world.entity.EntityType
import rbasamoyai.createbigcannons.index.CBCMunitionPropertiesHandlers
import rbasamoyai.createbigcannons.munitions.big_cannon.SimpleShellBlock

class HexShellBlock(properties: Properties) : SimpleShellBlock<HexShellProjectile>(properties) {
    override fun getAssociatedEntityType(): EntityType<HexShellProjectile> = HEX_SHELL.get()

    override fun isBaseFuze() =
        CBCMunitionPropertiesHandlers.COMMON_SHELL_BIG_CANNON_PROJECTILE
            .getPropertiesOf(this.getAssociatedEntityType()).fuze().baseFuze()
}