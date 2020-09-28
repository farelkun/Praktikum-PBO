public class Pria extends Manusia{
    private Wanita istri;

    Pria(){
        
    }

    Pria(int umur, String nama, boolean dewasa, Wanita istri){
        super(umur, nama, dewasa);
        this.istri = istri;
    }

    public void setIstri() {
        if(this.getUmur() > 22){
            istri.info();
        }else{
            System.out.println("Pria ini masih kuliah");
        }
    }

    public void info() {
        System.out.println("Profil Pria");
        super.info();
        if(this.getUmur() > 22){
            istri.info();
        }else{
            System.out.println("Pria ini masih kuliah");
        }
    } 
}
