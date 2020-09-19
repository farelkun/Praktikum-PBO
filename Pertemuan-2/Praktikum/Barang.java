public class Barang {
    private String kode = "KD-001";
    private String namaBarang = "Buku";
    private int hargaDasar = 2000;
    private float diskon = (float) 0.2;

    public int hitungHargaJual() {
        int hargaJual = (int) (hargaDasar - (diskon * hargaDasar));
        return hargaJual;
    }

    public void tampilData() {
        System.out.println("Kode : "+kode);
        System.out.println("Nama Barang : "+namaBarang);
        System.out.println("Harga Dasar : Rp."+ hargaDasar);
        System.out.println("Diskon : "+diskon+"%");
        System.out.println("Harga Jual : "+hitungHargaJual());
    }
}
