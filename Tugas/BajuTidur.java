
public class BajuTidur extends Baju{
    private String merek;
    private String jenisKain;

    public void setMerek(String newValue) {
        merek = newValue;
    }

    public void setJenisKain(String newValue) {
        jenisKain = newValue;
    }

    public void cetakStatus() {
        super.cetakStatus();
        System.out.println("Merek : "+ merek);
        System.out.println("Jenis Kain : "+ jenisKain);
    }
}