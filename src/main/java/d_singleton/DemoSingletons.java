package d_singleton;

public class DemoSingletons {
    public static void runJavaNaiveSingletonSingleThread() {
        var demo = new DemoSingletons();
        demo.naiveSingletonSingleThread();
    }

    public static void runJavaNaiveSingletonMultiThread() {
        var demo = new DemoSingletons();
        demo.naiveSingletonMultiThread();
    }

    public static void runJavaSafeSingletonMultiThread() {
        var demo = new DemoSingletons();
        demo.safeSingletonMultiThread();
    }

    public void naiveSingletonSingleThread() {
        System.out.println("If you see the same value, then singleton was reused (yay!)" + "\n" +
                "If you see different values, then 2 singletons were created (booo!!)" + "\n\n" +
                "RESULT:" + "\n");
        NaiveSingletonInJava singleton = NaiveSingletonInJava.getInstance("FOO");
        NaiveSingletonInJava anotherSingleton = NaiveSingletonInJava.getInstance("BAR");
        System.out.println(singleton.value);
        System.out.println(anotherSingleton.value);

    }

    public void naiveSingletonMultiThread() {
        System.out.println("If you see the same value, then singleton was reused (yay!)" + "\n" +
                "If you see different values, then 2 singletons were created (booo!!)" + "\n\n" +
                "RESULT:" + "\n");
        Thread threadFoo = new Thread(new ThreadFoo());
        Thread threadBar = new Thread(new ThreadBar());
        threadFoo.start();
        threadBar.start();
    }

    public void safeSingletonMultiThread() {
        System.out.println("If you see the same value, then singleton was reused (yay!)" + "\n" +
                "If you see different values, then 2 singletons were created (booo!!)" + "\n\n" +
                "RESULT:" + "\n");
        Thread threadFoo = new Thread(new ThreadFooSafe());
        Thread threadBar = new Thread(new ThreadBarSafe());
        threadFoo.start();
        threadBar.start();
    }

    static class ThreadFoo implements Runnable {
        @Override
        public void run() {
            NaiveSingletonInJava singleton = NaiveSingletonInJava.getInstance("FOO");
            System.out.println(singleton.value);
        }
    }

    static class ThreadBar implements Runnable {
        @Override
        public void run() {
            NaiveSingletonInJava singleton = NaiveSingletonInJava.getInstance("BAR");
            System.out.println(singleton.value);
        }
    }

    static class ThreadFooSafe implements Runnable {
        @Override
        public void run() {
            ThreadSaveSingletonWithLazyLoadingInJava singleton =
                    ThreadSaveSingletonWithLazyLoadingInJava.getInstance("FOO");
            System.out.println(singleton.value);
        }
    }

    static class ThreadBarSafe implements Runnable {
        @Override
        public void run() {
            ThreadSaveSingletonWithLazyLoadingInJava singleton
                    = ThreadSaveSingletonWithLazyLoadingInJava.getInstance("BAR");
            System.out.println(singleton.value);
        }
    }
}
