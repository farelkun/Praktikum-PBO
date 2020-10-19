public class Topeng extends Kerajinan{
    public Ornamen ornamen;

    Topeng(String asal, String namaKerajinan, Ornamen ornamen){
        super.asal = asal;
        super.nama = namaKerajinan;
        this.ornamen = ornamen;
    }

    public void buatKerajinan(){
        super.harga = 1500000;
    }
}
