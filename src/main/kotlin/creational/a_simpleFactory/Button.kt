package creational.a_simpleFactory

interface Button {
    fun render()
    fun onClick()
}

class HtmlButton(val code: String): Button {
    override fun render() {
        println("HtmlButton rendered!")
    }

    override fun onClick() {
        println("HtmlButton clicked!")
    }
}

class WindowsButton(val size: Int): Button {
    override fun render() {
        println("WindowButton rendered!")
    }

    override fun onClick() {
        println("WindowButton rendered!")
    }
}

class MacButton(val size: Int): Button {
    override fun render() {
        println("MacButton rendered!")
    }

    override fun onClick() {
        println("MacButton rendered!")
    }
}