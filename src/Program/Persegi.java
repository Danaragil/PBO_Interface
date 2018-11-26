package Program;

public class Persegi implements BangunDatar{

    private int sisi;

    public Persegi(int sisi) {
        this.sisi = sisi;
    }
    
    
    @Override
    public double luas() {
        return this.sisi*this.sisi;
    }

    @Override
    public double keliling() {
        return this.sisi*4;
    }
    
}
