public class KerajinanDemo {
    public static void main(String[] args) {
        Topeng topeng = new Topeng("Malang = ", "Topeng Malangan", new Ornamen(200000));
        topeng.buatKerajinan();
        System.out.println("Nama Kerajinan = "+ topeng.nama);
        System.out.println("Asal = "+ topeng.asal);
        System.out.println("Harga Untuk Membuat = "+ topeng.harga);
        topeng.perbaikiKerajinan();
        System.out.println("Harga Untuk Memperbaiki = "+ topeng.harga);
        System.out.println("Harga Ornamen = "+ topeng.ornamen.harga);
        
    }
}
