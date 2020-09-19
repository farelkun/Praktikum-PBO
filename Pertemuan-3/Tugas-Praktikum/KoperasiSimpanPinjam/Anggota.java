public class Anggota {
    private String ktp;
    private String nama;
    private int limitPinjaman;
    private int jumlahPinjaman;

    Anggota(String ktp, String nama, int limitPinjaman){
        this.ktp = ktp;
        this.nama = nama;
        this.limitPinjaman = limitPinjaman;
    }

    public void setKd(String ktp) {
        this.ktp = ktp;
    }

    public void setLimitPinjaman(int limitPinjaman) {
        this.limitPinjaman = limitPinjaman;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getKtp() {
        return ktp;
    }

    public String getNama() {
        return nama;
    }
    
    public int getLimitPeminjaman() {
        return limitPinjaman;
    }

    public void pinjam(int uang) {
        if(uang > limitPinjaman){
            System.out.println("Maaf, Jumlah pinjaman melebihi limit.");
        }
        else{
            jumlahPinjaman += uang;
        }
    }

    public void angsur(int uang) {
        double angsuran = jumlahPinjaman*10/100;
        if(uang < angsuran){
            System.out.println("Maaf, angsuran harus 10% dari jumlah pinjaman");
        }else{
            jumlahPinjaman -= uang;
        }
    }

    public int getJumlahPeminjaman() {
        return jumlahPinjaman;
    }
}
