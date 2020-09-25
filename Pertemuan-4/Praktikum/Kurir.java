public class Kurir {
    private String ktp;
    private String nama;

    public Kurir(String ktp, String nama){
        this.ktp = ktp;
        this.nama = nama;
    }

    public void setKtp(String ktp) {
        this.ktp = ktp;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getKtp() {
        return nama;
    }

    public String getNama() {
        return nama;
    }

    public String info() {
        String info = "";
        info += "\nKtp: " + ktp + "\n";
        info += "Nama: " + nama + "\n";
        return info;
    }
}
