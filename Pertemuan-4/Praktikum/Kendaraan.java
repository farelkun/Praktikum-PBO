public class Kendaraan {
    private String kode;
    private Kurir kurir;
    private Kapasitas arrayKapasitas[];

    private void initKapasitas() {
        for (int i = 0; i < arrayKapasitas.length; i++) {
            this.arrayKapasitas[i] = new Kapasitas(String.valueOf(i + 1));
        }
    }

    public Kendaraan(String kode, int jumlah) {
        this.kode = kode;
        this.arrayKapasitas = new Kapasitas[jumlah];
        this.initKapasitas();
    }

    public void setKode(String kode) {
        this.kode = kode;
    }

    public void setKurir(Kurir kurir) {
        this.kurir = kurir;
    }

    public Kurir getKurir(){
        return kurir;
    }
    
    public String info() {
        String info = "";
        info += "Kode: " + kode + "\n";
        info += "Kurir: " + kurir.info() + "\n";
        for (Kapasitas kapasitas : arrayKapasitas) {
            info += kapasitas.info();
        }
        return info;
    }

    public void setBarang(Barang barang, int nomor) {
        for (int i = 0; i < arrayKapasitas.length; i++) {
            if (arrayKapasitas[i].getBarang() == null) {
                this.arrayKapasitas[i].setBarang(barang);
                break;
            }
        }
    }


}
