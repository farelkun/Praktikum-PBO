public class TestBayaran {
    public static void main(String[] args) {

        Manager manager = new Manager("Agus",800,50);
        Programmer programmer = new Programmer("Budi",600,30);
        Bayaran bayaran = new Bayaran();

        System.out.println("Bayaran Manager : "+bayaran.hitungBayaran(manager));
        System.out.println("Bayaran Programmer : "+bayaran.hitungBayaran(programmer));
    }
}
