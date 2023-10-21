package creational.a_simpleFactory

abstract class Dialog {
    fun renderWindow() {
        val okButton: Button = createButton()
        okButton.render()
    }

    abstract fun createButton(): Button
}


internal class HtmlDialog : Dialog() {
    override fun createButton(): Button {
        return HtmlButton("Html code for Html Button.")
    }
}

class WindowsDialog : Dialog() {

    override fun createButton(): Button {
        return WindowsButton(30);
    }
}

class MacDialog : Dialog() {

    override fun createButton(): Button {
        return MacButton(30);
    }
}
