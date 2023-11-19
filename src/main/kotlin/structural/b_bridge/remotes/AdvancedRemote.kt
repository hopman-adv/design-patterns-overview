package structural.b_bridge.remotes

import structural.b_bridge.devices.Device

class AdvancedRemote(device: Device): BasicRemote(device) {
    fun mute() {
        println("Remote: mute")
        device.setVolume(0)
    }
}