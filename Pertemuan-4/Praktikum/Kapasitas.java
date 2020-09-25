public class Kapasitas {
    private String nomor;
    private Barang barang;

    public Kapasitas(String nomor){
        this.nomor = nomor;
    }

    public void setNomor(String nomor) {
        this.nomor = nomor;
    }

    public void setBarang(Barang barang) {
        this.barang = barang;
    }

    public String getnomor() {
        return nomor;
    }

    public Barang getBarang() {
        return barang;
    }

    public String info() {
        String info = "";
        info += "Nomor: " + nomor + "\n";
        if (this.barang != null) {
            info += "Barang: " + barang.info() + "\n";
        }
        return info;
    }
}
