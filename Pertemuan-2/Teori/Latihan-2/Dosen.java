public class Dosen extends MataKuliah{
    public String kdDosen;
    public String nama;

    public void setKdDosen(String newValue) {
        kdDosen = newValue;
    }

    public void setNama(String newValue) {
        nama = newValue;
    }

    public void cetakStatus() {
        super.cetakStatus();
        System.out.println("Kode Dosen : "+ kdDosen);
        System.out.println("Nama Dosen : "+ nama);
    }
}
