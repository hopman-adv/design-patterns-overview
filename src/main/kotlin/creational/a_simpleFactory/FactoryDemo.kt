package creational.a_simpleFactory

    private lateinit var dialog: Dialog
    fun runFactoryDemo() {
        val demo = FactoryDemo()
        demo.configure()
        demo.runBusinessLogic()
    }
class FactoryDemo {

    fun configure() {
        println("OS is: ${System.getProperty("os.name")}")
        if (System.getProperty("os.name").equals("Windows 10")) {
            dialog = WindowsDialog()
        }else if (System.getProperty("os.name").equals("Mac OS X")) {
            dialog = MacDialog()
            } else {
            dialog = HtmlDialog()
        }
    }

    fun runBusinessLogic() {
        dialog.renderWindow()
    }

}