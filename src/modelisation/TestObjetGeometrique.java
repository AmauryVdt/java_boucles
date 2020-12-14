package modelisation;

public class TestObjetGeometrique {

    public static void main(String[] args) {

        ObjetGeometrique[] objetGeometriquestab = new ObjetGeometrique[2];

        objetGeometriquestab[0] = new Cercle(10);
        objetGeometriquestab[1] = new Rectangle(5, 10);

        for (ObjetGeometrique objet : objetGeometriquestab) {
            System.out.println("Perimetre : " + objet.perimetre());
            System.out.println("Surface : " + objet.surface());
        }
    }
}
