package creational.a_factoryMethod
//Factory umožňuje 


    private lateinit var dialog: Dialog
    fun runFactoryMethodDemo() {
        println("-----------------------------------------------------------------------")
        println("Running Factory Method Demo...")
        val demo = FactoryMethodDemo()
        demo.configure()
        demo.runBusinessLogic()
        println("Ending Factory Method Demo...")
        println("-----------------------------------------------------------------------")
    }
class FactoryMethodDemo {

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