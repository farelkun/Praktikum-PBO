public class MediaInformasi implements Penerbit{
    public int jmlHalaman;
    private int tahunSekarang;

    public int getTahunSekarang(int tahun) {
        tahunSekarang = tahun;
        return tahunSekarang;
    }

    public void setJMLHalaman(int jml) {
        this.jmlHalaman = jml;
    }

    @Override
    public void reputasi() {
        System.out.println("Penerbit Majalah ini bereputasi!");
    }

    @Override
    public void alamatPenerbit(String alamat) {
        System.out.println("Alamat Penerbit: "+ alamat);
    }

    @Override
    public void tahunBerdiri(int tahun) {
        System.out.println("Penerbit ini berdiri pada tahun:" + tahun + ",sehingga Penerbit ini sekarang berusia: "+ (tahunSekarang-tahun)+ " tahun");
    }

}
