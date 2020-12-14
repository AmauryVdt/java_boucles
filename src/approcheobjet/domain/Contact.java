package approcheobjet.domain;

public class Contact {

    private String name;
    private String email;
    private String tel;

    public Contact() {
        tel = "02.41.74.74.74";
    }

    public Contact(String name, String email) {
        this();
        this.name = name;
        this.email = email;
    }

    public Contact(String name, String email, String tel) {
        this(name, email);
        this.name = tel;
    }

    public void m(int a) {

    }

    public void m(int a, int b) {

    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getTel() {
        return tel;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", tel='" + tel + '\'' +
                '}';
    }
}
