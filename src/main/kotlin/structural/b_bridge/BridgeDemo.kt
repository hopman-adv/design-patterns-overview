package structural.b_bridge

import structural.b_bridge.devices.Device
import structural.b_bridge.devices.Radio
import structural.b_bridge.devices.Tv
import structural.b_bridge.remotes.AdvancedRemote
import structural.b_bridge.remotes.BasicRemote

/*
* Bridge rozdělí business logiku nebo velkou třídu
* na samostatné hiarchie, na kterých pak lze pracovat
* samostatně.
* V příkladu máme Zařízení(Devices), který funguje jako implementace.
* Dálkové ovladače(Remotes), který funguje jako abstrakce.
* Základní ovladač - Remote - deklaruje
* */
fun runBridgeDemo() {
    BridgeDemo().run {
        this.testDevice(Tv())
        this.testDevice(Radio())
    }
}

class BridgeDemo {
    fun testDevice(device: Device) {
        println("Tests with basic remote.")
        val basicRemote = BasicRemote(device)
        basicRemote.power()
        device.printStatus()

        println("Tests with advanced remote.")
        val advancedRemote = AdvancedRemote(device)
        advancedRemote.power()
        advancedRemote.mute()
        device.printStatus()
    }
}