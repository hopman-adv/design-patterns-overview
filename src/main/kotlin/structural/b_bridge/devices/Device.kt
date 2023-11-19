package structural.b_bridge.devices


// The "implementation" interface declares methods common to all
// concrete implementation classes. It doesn't have to match the
// abstraction's interface. In fact, the two interfaces can be
// entirely different. Typically, the implementation interface
// provides only primitive operations, while the abstraction
// defines higher-level operations based on those primitives.
interface Device {
    fun isEnabled(): Boolean

    fun enable()

    fun disable()

    fun getVolume(): Int

    fun setVolume(percent: Int)

    fun getChannel(): Int

    fun setChannel(channel: Int)

    fun printStatus()
}