public class Barang {
    private String kode;
    private String namaBarang;
    private Klien klien;

    public Barang(String kode, String namaBarang){
        this.kode = kode;
        this.namaBarang = namaBarang;
    }

    public void setKode(String kode) {
        this.kode = kode;
    }

    public void setNamaBarang(String namaBarang) {
        this.namaBarang = namaBarang;
    }

    public void setKlien(Klien klien) {
        this.klien = klien;
    }

    public String getKode() {
        return kode;
    }

    public String getNamaBarang() {
        return namaBarang;
    }

    public Klien getKlien() {
        return klien;
    }

    public String info() {
        String info = "";
        info += "\nKode: " + kode + "\n";
        info += "Nama Barang: " + namaBarang + "\n";
        info += "Klien: " + klien.info() + "\n";
        return info;
    }
}
