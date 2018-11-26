package Program;

public class PersegiPanjang implements BangunDatar{

    private float panjang, lebar;
    
    public PersegiPanjang(float panjang, float lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    
    @Override
    public double luas() {
        return this.panjang*this.lebar;
    }

    @Override
    public double keliling() {
        return this.panjang*this.lebar*2;
    }
    
}

