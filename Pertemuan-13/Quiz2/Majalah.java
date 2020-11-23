public class Majalah extends MediaInformasi{
    public void setJMLHalaman(int jml) {
        System.out.println("\nMajalah ini memiliki: "+jml+" Halaman");
        System.out.println("Jika dihitung dengan covernya, maka jumlah halaman dari buku tersebut: "+ (jml + 2) +" Halaman\n");
    }

    public void reputasi() {
        System.out.println("Penerbit Majalah ini bereputasi");
    }
}
