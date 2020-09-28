public class Manusia{
    private int umur;
    private String nama;
    private boolean dewasa;

    Manusia(){
    }

    Manusia(int umur, String nama, boolean dewasa){
        this.umur = umur;
        this.nama = nama;
        this.dewasa = dewasa;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setDewasa(boolean dewasa) {
        this.dewasa = dewasa;
    }

    public int getUmur() {
        return umur;
    }

    public String getNama() {
        return nama;
    }

    public boolean getDewasa() {
        return dewasa;
    }

    public void info() {
        System.out.println("Umur :"+ umur);
        System.out.println("Nama :"+ nama);
        System.out.println("Dewasa :"+ dewasa);
    }  
}