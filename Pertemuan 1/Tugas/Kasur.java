
public class Kasur {
    private String bahan;
    private int lebar;

    public void setBahan(String newValue) {
        bahan = newValue;
    }

    public void setLebar(int newValue) {
        lebar = newValue;
    }

    public void cetakStatus() {
        System.out.println("Bahan : "+ bahan);
        System.out.println("Lebar : "+ lebar+"cm");
    }
}