public class Main {
    public static void main(String[] args) {

        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        s1.displayMessage();
        s2.displayMessage();

        Builder b = new Builder.PersonBuilder("Din","Djarin")
                        .age(30)
                        .build();

        System.out.println(b);

    }
}