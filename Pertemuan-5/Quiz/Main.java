public class Main {
    public static void main(String[] args) {
        Manusia anak = new Manusia(13, "Dandi", false);

        Pria pria = new Pria();
        pria.setUmur(25);
        pria.setNama("Wildan");
        pria.setDewasa(true);
        
        Wanita wanita2 = new Wanita(27, "Ayu", true, pria, anak);
        
        Pria pria2 = new Pria(29, "Doni", false, wanita2);
        pria2.info();
    }
}
