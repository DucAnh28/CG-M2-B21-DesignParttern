package DemoSingleton;

class Singleton {
    private static Singleton instance = null;
    public String string;

    private Singleton(String demo) {
        string = demo;
    }

    public static Singleton getInstance(String a) {
        if (instance == null) instance = new Singleton(a);
        System.out.println(instance.string);
        return instance;
    }


}