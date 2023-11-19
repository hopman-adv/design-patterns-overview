package structural.b_bridge.devices

// All devices follow the same interface.
class Tv: Device {
    private var on = false
    private var volume = 30
    private var channel = 1

    override fun isEnabled() = on

    override fun enable() {
        this.on = true
    }

    override fun disable() {
        this.on = false
    }

    override fun getVolume() = volume

    override fun setVolume(percent: Int) {
        if (volume > 100) {
            this.volume = 100
        } else if (volume < 0) {
            this.volume = 0
        } else {
            this.volume = percent
        }
    }

    override fun getChannel() = channel

    override fun setChannel(channel: Int) {
        this.channel = channel
    }

    override fun printStatus() {
        println("------------------------------------")
        println("| I'm TV set.")
        println("| I'm ${ if (on) "enabled" else "disabled" }")
        println("| Current volume is $volume%")
        println("| Current channel is $channel")
        println("------------------------------------\n")
    }
}