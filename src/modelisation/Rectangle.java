package modelisation;

public class Rectangle implements ObjetGeometrique {

    public double largeur;

    public double longueur;

    public Rectangle(int largeur, int longueur) {
        this.largeur = largeur;
        this.longueur = longueur;
    }

    @Override
    public double perimetre() {
        return this.largeur * 2 + this.longueur * 2;
    }

    @Override
    public double surface() {
        return this.largeur * this.longueur;
    }
}
