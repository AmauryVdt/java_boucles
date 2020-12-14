package modelisation;

public class Cercle implements ObjetGeometrique {

    protected double rayon;

    public Cercle (double rayon) {
        this.rayon = rayon;
    }

    @Override
    public double perimetre() {
        return 2 * Math.PI * this.rayon;
    }

    @Override
    public double surface() {
        return Math.pow(2, this.rayon) * Math.PI;
    }
}
