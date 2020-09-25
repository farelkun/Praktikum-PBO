public class MainPengirimanBarang {
    public static void main(String[] args) {
        Kurir kurir = new Kurir("12345", "Budi Doremi");
        Klien klien = new Klien("12344", "John Cena", "Samarinda");
        Barang barang = new Barang("BRG-001", "Buku");
        barang.setKlien(klien);
        Kendaraan motor = new Kendaraan("MTR-001", 10);
        motor.setKurir(kurir);
        motor.setBarang(barang, 1);
        System.out.println(motor.info());
        
    }
}
