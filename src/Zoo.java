public final class Zoo {

    static {
        System.out.println("Static Zoo block");
    }

    private final int totalAnimals  = 10;
    private static String name = "Zoo";

    public final void printInfo(){
        System.out.println("In Zoo are " + totalAnimals + " animals");
    }

    public static void checkName(){
        System.out.println("Check zoo name: " + name);
    }
}
