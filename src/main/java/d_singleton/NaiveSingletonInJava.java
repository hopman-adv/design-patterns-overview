package d_singleton;

public class NaiveSingletonInJava {
    //staticka proměnná, kde bude uložen singleton
    private static NaiveSingletonInJava instance;
    public String value;

    // privátní konstruktor nejde použít zvenku
    private NaiveSingletonInJava(String value) {
        // The following code emulates slow initialization.
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        this.value = value;
    }
    // statická metoda pro tvorbu objektu nedovolí vytvořit více jak jeden objekt
    public static NaiveSingletonInJava getInstance(String value) {
        if(instance == null) {
            instance = new NaiveSingletonInJava(value);
        }
        return instance;
    }
}
