package creational.a_factoryMethod

/**
 * Hlavním účelem Factory method (tovární metoda) je umožnit vytváření
 * objektů bez nutnosti specifikovat konkrétní třídu objektu v předem
 * daném kódu. Tímto způsobem lze odstranit pevné vazby mezi kódem, který
 * potřebuje objekt, a konkrétní třídou objektu, což zvyšuje flexibilitu
 * a rozšířitelnost aplikace.
 */
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
        } else if (System.getProperty("os.name").equals("Mac OS X")) {
            dialog = MacDialog()
        } else {
            dialog = HtmlDialog()
        }
    }

    fun runBusinessLogic() {
        dialog.renderWindow()
    }

}