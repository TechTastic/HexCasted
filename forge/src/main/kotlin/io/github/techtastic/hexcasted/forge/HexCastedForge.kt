package io.github.techtastic.hexcasted.forge

import dev.architectury.platform.forge.EventBuses
import io.github.techtastic.hexcasted.HexCasted.MOD_ID
import io.github.techtastic.hexcasted.HexCasted.init
import net.minecraftforge.fml.common.Mod
import thedarkcolour.kotlinforforge.KotlinModLoadingContext

@Mod(MOD_ID)
object HexCastedForge {
    init {
        EventBuses.registerModEventBus(MOD_ID, KotlinModLoadingContext.get().getKEventBus())

        init()
    }
}