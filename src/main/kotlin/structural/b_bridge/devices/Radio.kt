package structural.b_bridge.devices

// All devices follow the same interface.
class Radio: Device {
    private var on = false;
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
        this.volume =
            if(this.volume > 100) {
                100
            }else if (volume < 0) {
                0
            } else {
                percent
            }
    }

    override fun getChannel() = channel

    override fun setChannel(channel: Int) {
        this.channel = channel
    }

    override fun printStatus() {
        println("""------------------------------------
        | I'm radio.
        | I'm ${if (on) "enabled" else "disabled"}
        | Current volume is $volume%
        | Current channel is $channel
        ------------------------------------""")
    }
}