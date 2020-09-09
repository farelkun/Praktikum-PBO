public class Mahasiswa extends MataKuliah{
    public String kdMhs;
    public int nim;
    public String nama;
    public String kelas;
    public String jurusan;


    public void setKdMhs(String newValue) {
        kdMhs = newValue;
    }

    public void setNim(String newValue) {
        nim = newValue;
    }
    
    public void setNama(String newValue) {
        nama = newValue;
    }

    public void setKelas(String newValue) {
        kelas = newValue;
    }

    public void setJurusan(String newValue) {
        jurusan = newValue;
    }

    public void cetakStatus() {
        super.cetakStatus();
        System.out.println("Kode Mahasiswa : "+ kdMhs);
        System.out.println("Nim : "+ nim);
        System.out.println("Nama : "+ nama);
        System.out.println("Kelas : "+ kelas);
        System.out.println("Jurusan : "+ jurusan);
    }
}

