public class runPeminjaman {
    public static void main(String args[]) {
        Peminjaman pjm = new Peminjaman();

        pjm.setId("KD-001");
        pjm.setNamaMember("Farel");
        pjm.setNamaGame("Dota 2");
        pjm.setHarga(1000);
        pjm.setSewa(6);
        pjm.hitungBayarHarga();
        pjm.cetakStatus();
    }
}
