
public class Baju {
    private String warna;
    private String size;

    public void setWarna(String newValue) {
        warna = newValue;
    }

    public void setSize(String newValue) {
        size = newValue;
    }

    public void cetakStatus() {
        System.out.println("Warna : "+ warna);
        System.out.println("Size : "+ size);
    }
}