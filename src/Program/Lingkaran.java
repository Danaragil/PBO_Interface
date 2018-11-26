package Program;

public class Lingkaran implements BangunDatar{

    private float jari;
    private static double phi = 3.14;

    public Lingkaran(float jari) {
        this.jari = jari;
    }
    
    @Override
    public double luas() {
        return (float) (phi*this.jari*this.jari);
    }

    @Override
    public double keliling() {
        return (float) (2*phi*this.jari);
    }
    
}
