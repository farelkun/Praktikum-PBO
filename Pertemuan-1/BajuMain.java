public class BajuMain extends Baju{
    private String merk;
    private String bahan;

    public void setMerk(String newValue) {
        merk = newValue;
    }

    public void setBahan(String newValue) {
        bahan = newValue;
    }

    public void cetakStatus() {
        super.cetakStatus();
        System.out.println("Merek : "+ merk);
        System.out.println("Bahan : "+ bahan);
    }
}