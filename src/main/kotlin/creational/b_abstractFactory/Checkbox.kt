package creational.b_abstractFactory

interface Checkbox {
    fun render()
    fun onClick()
}

class WindowsCheckbox(): Checkbox {
    override fun render() {
        println("WindowsCheckbox rendered!")
    }

    override fun onClick() {
        println("WindowsCheckbox clicked!")
    }
}

class MacCheckbox(): Checkbox {
    override fun render() {
        println("MacCheckbox rendered!")
    }

    override fun onClick() {
        println("MacCheckbox clicked!")
    }
}

class HtmlCheckbox(): Checkbox {
    override fun render() {
        println("HtmlCheckbox rendered!")
    }

    override fun onClick() {
        println("HtmlCheckbox clicked!")
    }
}
