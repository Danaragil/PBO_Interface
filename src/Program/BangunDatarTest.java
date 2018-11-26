package Program;

public class BangunDatarTest {
    
    public static void main(String[] args) {
        BangunDatar bd = new Lingkaran(13);
        System.out.println("Luas Lingkaran : " + bd.luas());
        System.out.println("Keliling Lingkaran : "+bd.keliling());
        
        bd = new Persegi(22);
        System.out.println("Luas Persegi : " +bd.luas());
        System.out.println("Keliling Persegi : "+bd.keliling());
        
        bd = new PersegiPanjang(13, 20);
        System.out.println("Luas PersegiPanjang : "+bd.luas());
        System.out.println("Keliling PersegiPanjang : "+bd.keliling());
    }
    
}
