package io.github.techtastic.hexcasted

import io.github.techtastic.hexcasted.munitions.big_cannon.hex_shell.HexShellProjectile
import net.minecraft.world.entity.EntityType
import rbasamoyai.createbigcannons.index.CBCMunitionPropertiesHandlers


object HCEntities {
    val HEX_SHELL = RegistrateHandler.cannonProjectile(
        "hex_shell", ::HexShellProjectile, CBCMunitionPropertiesHandlers.COMMON_SHELL_BIG_CANNON_PROJECTILE)
}