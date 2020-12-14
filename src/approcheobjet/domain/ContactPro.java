package approcheobjet.domain;

public class ContactPro extends Contact {

    private String linkedIn;

    public ContactPro(String linkedIn) {
        this.linkedIn = linkedIn;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ContactPro{");
        sb.append("linkedIn='").append(linkedIn).append('\'');
        sb.append('}');
        return sb.toString()+super.toString();
    }
}
