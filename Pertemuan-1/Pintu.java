
public class Pintu extends Kasur{
    private String warna;
    private int jumlahGagang;

    public void setWarna(String newValue) {
        warna = newValue;
    }

    public void setjJumlahGagang(int newValue) {
        jumlahGagang = newValue;
    }

    public void cetakStatus() {
        super.cetakStatus();
        System.out.println("Warna : "+ warna);
        System.out.println("Jumlah Gagang : "+ jumlahGagang);
    }
}