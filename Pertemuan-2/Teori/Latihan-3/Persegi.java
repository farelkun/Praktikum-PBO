public class Persegi {
    public int sisi;

    public void dataPersegi() {
        System.out.println("Menampilkan panjang sisi : "+sisi);
    }

    public int luasPersegi() {
        int luas = sisi*sisi;
        return luas;
    }

    public int kelilingPersegi() {
        int keliling = 4 * sisi;
        return keliling;
    }
}
