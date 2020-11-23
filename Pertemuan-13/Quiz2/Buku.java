public class Buku extends MediaInformasi{
    public void setJMLHalaman(int jml) {
        System.out.println("\nBuku ini memiliki: "+jml+" Halaman");
        System.out.println("Jika dihitung dengan covernya, maka jumlah halaman dari buku tersebut: "+ (jml + 4) +" halaman, lebih tebal dari pada halaman karena terdapat cover dalam dan cover luar\n");
    }

    public void reputasi() {
        System.out.println("Penerbit Majalah ini bereputasi");
    }
}
