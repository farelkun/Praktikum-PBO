public class Klien {
    private String ktp;
    private String nama;
    private String alamat;

    public Klien(String ktp, String nama, String alamat){
        this.ktp = ktp;
        this.nama = nama;
        this.alamat = alamat;
    }

    public void setKtp(String ktp) {
        this.ktp = ktp;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getKtp() {
        return nama;
    }

    public String getNama() {
        return nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public String info() {
        String info = "";
        info += "\nKtp: " + ktp + "\n";
        info += "Nama: " + nama + "\n";
        info += "Alamat: " + alamat + "\n";
        return info;
    }
}
