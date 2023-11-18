package d_singleton;

public class ThreadSaveSingletonWithLazyLoadingInJava {
    //staticka proměnná, kde bude uložen singleton
    private static volatile ThreadSaveSingletonWithLazyLoadingInJava instance;
    public String value;

    // privátní konstruktor nejde použít zvenku
    private ThreadSaveSingletonWithLazyLoadingInJava(String value) {
        this.value = value;
    }
    // statická metoda pro tvorbu objektu nedovolí vytvořit více jak jeden objekt
    public static ThreadSaveSingletonWithLazyLoadingInJava getInstance(String value) {
        // The approach taken here is called double-checked locking (DCL). It
        // exists to prevent race condition between multiple threads that may
        // attempt to get singleton instance at the same time, creating separate
        // instances as a result.
        //
        // It may seem that having the `result` variable here is completely
        // pointless. There is, however, a very important caveat when
        // implementing double-checked locking in Java, which is solved by
        // introducing this local variable.
        //
        // You can read more info DCL issues in Java here:
        // https://refactoring.guru/java-dcl-issue
        ThreadSaveSingletonWithLazyLoadingInJava result = instance;
        if (result != null) {
            return result;
        }
        synchronized(ThreadSaveSingletonWithLazyLoadingInJava.class) {
            if (instance == null) {
                instance = new ThreadSaveSingletonWithLazyLoadingInJava(value);
            }
            return instance;
        }
    }
}
