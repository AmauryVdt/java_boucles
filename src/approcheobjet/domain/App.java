package approcheobjet.domain;

public class App {

    public static void main(String[] args) {

        Contact sega = new Contact("sega", "s@s.fr");
        System.out.println(sega);

        ContactPro sega2 = new ContactPro("in/sega");
        System.out.println(sega2);
    }
}
