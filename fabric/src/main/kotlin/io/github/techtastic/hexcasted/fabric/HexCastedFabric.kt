package io.github.techtastic.hexcasted.fabric

import io.github.techtastic.hexcasted.HexCasted.init
import net.fabricmc.api.ClientModInitializer
import net.fabricmc.api.ModInitializer

object HexCastedFabric: ModInitializer {
    override fun onInitialize() {
        init()
    }

    object Client: ClientModInitializer {
        override fun onInitializeClient() {
        }
    }
}