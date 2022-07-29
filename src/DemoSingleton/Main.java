package DemoSingleton;

public class Main {
    public static void main(String[] args) {
        Singleton x = Singleton.getInstance("1");
        Singleton y = Singleton.getInstance("2");
        Singleton z = Singleton.getInstance("3");

        System.out.println("String from x is " + x.string);
        System.out.println("String from y is " + y.string);
        System.out.println("String from z is " + z.string);

    }
}
