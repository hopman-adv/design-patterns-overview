package structural.b_bridge.remotes

// The "abstraction" defines the interface for the "control"
// part of the two class hierarchies. It maintains a reference
// to an object of the "implementation" hierarchy and delegates
// all the real work to this object.
interface Remote {
    fun power()

    fun volumeDown()

    fun volumeUp()

    fun channelDown()

    fun channelUp()

}