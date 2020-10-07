public class Segitiga extends BangunDatar{
    public float alas;
    public float tinggi;

    public float luas() {
        float luas = (alas * tinggi) / 2;
        System.out.println("Luas Segitiga: " + luas);
        return luas;
    }
}
