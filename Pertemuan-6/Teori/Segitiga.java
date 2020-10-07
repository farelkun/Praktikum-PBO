public class Segitiga extends BangunDatar{
    public float alas;
    public float tinggi;

    public float luas() {
        float luas = 1/2 * (alas * tinggi);
        System.out.println("Luas Segitiga: " + luas);
        return luas;
    }   
}
