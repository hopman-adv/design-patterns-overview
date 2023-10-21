package creational.b_abstractFactory


fun runAbstractFactoryDemo() {
    println("-----------------------------------------------------------------------")
    println("Running Abstract Factory Demo...")
    val app = AbstractFactoryDemo(configure())
    app.render()
    println("Ending Abstract Factory Demo...")
    println("-----------------------------------------------------------------------")
}

fun configure(): GUIFactory {
    println("OS is: ${System.getProperty("os.name")}")
    return if (System.getProperty("os.name").equals("Windows 10")) {
        WindowsFactory()
    }else if (System.getProperty("os.name").equals("Mac OS X")) {
        MacOSFactory()
    } else {
        HtmlFactory()
    }
}


class AbstractFactoryDemo(private val guiFactory: GUIFactory) {
    private val button = guiFactory.createButton()
    private val checkbox = guiFactory.createCheckbox()

    fun render() {
        button.render()
        checkbox.render()
    }
}