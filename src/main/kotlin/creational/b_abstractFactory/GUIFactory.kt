package creational.b_abstractFactory

import creational.a_factoryMethod.Button
import creational.a_factoryMethod.HtmlButton
import creational.a_factoryMethod.MacButton
import creational.a_factoryMethod.WindowsButton

abstract class GUIFactory {
    abstract fun createButton(): Button
    abstract fun createCheckbox(): Checkbox
}


class MacOSFactory : GUIFactory() {
    override fun createButton(): Button {
        return MacButton(35)
    }

    override fun createCheckbox(): Checkbox {
        return MacCheckbox()
    }
}

class WindowsFactory : GUIFactory() {
    override fun createButton(): Button {
        return WindowsButton(50)
    }

    override fun createCheckbox(): Checkbox {
        return WindowsCheckbox()
    }
}

class HtmlFactory : GUIFactory() {
    override fun createButton(): Button {
        return HtmlButton("code for html")
    }

    override fun createCheckbox(): Checkbox {
        return HtmlCheckbox()
    }
}
