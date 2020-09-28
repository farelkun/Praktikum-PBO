public class Wanita extends Manusia{
    private Pria suami;
    private Manusia anak;

    Wanita(){
    }

    Wanita(int umur, String nama, boolean dewasa, Pria suami, Manusia anak){
        super(umur, nama, dewasa);
        this.suami = suami;
        this.anak = anak;
    }

    public void setSuami() {
        if(this.getUmur() > 20){
            System.out.println("Suami: ");
            suami.info();
            System.out.println("Anak: ");
            anak.info();
        }else{
            System.out.println("Wanita ini masih kuliah");
        }
    }

    public void info() {
        System.out.println("Profil Wanita");
        super.info();
        if(this.getUmur() > 20){
            System.out.println("Suami: ");
            suami.info();
            System.out.println("Anak: ");
            anak.info();
        }else{
            System.out.println("Wanita ini masih kuliah");
        }
    }
}
