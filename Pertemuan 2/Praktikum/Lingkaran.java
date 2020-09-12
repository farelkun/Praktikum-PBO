public class Lingkaran {
    private Double phi = 3.14;
    private double r = 10;

    public double hitungLuas() {
        double luas = phi*(r*r);
        return luas;
    }

    public double hitungKeliling() {
        double keliling = 2*phi*r;
        return keliling;
    }

    public void cetakStatus() {
        System.out.println("Phi : "+phi);
        System.out.println("r : "+r);
        System.out.println("Luas : "+ hitungLuas());
        System.out.println("Keliling : "+hitungKeliling());
    }
}
