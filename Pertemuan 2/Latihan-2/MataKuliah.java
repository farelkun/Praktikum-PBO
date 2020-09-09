public class MataKuliah{
    public String kdMatkul;
    public String namaMatkul;

    public void setKdMatkul(String newValue) {
        kdMatkul = newValue;
    }

    public void setNamaMatkul(String newValue) {
        namaMatkul = newValue;
    }

    public void cetakStatus() {
        System.out.println("Kode Mata Kuliah : "+ kdMatkul);
        System.out.println("Nama Mata Kuliah : "+ namaMatkul);
    }
}