public class Peminjaman {
    private String id;
    private String nama_member;
    private String nama_game;
    private int harga_game;
    private int sewa;
    private int harga;

    public void setId(String newValue){
        id = newValue;
    }

    public void setNamaMember(String newValue){
        nama_member = newValue;
    }

    public void setNamaGame(String newValue){
        nama_game = newValue;
    }

    public void setHarga(int newValue){
        harga_game = newValue;
    }

    public void setSewa(int newValue){
        sewa = newValue;
    }

    public int hitungBayarHarga(){
        harga = sewa * harga_game;
        return harga;
    }

    public void cetakStatus() {
        System.out.println("Id : "+id);
        System.out.println("Nama Member : "+nama_member);
        System.out.println("Nama Game : "+ nama_game);
        System.out.println("Harga : "+harga_game);
        System.out.println("Lama Sewa : "+sewa);
        System.out.println("Bayar : "+harga);
    }
}
