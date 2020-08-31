
public class Demo {

    public static void main(String[] args) {
        Baju bju1 = new Baju();
        BajuTidur bju2 = new BajuTidur();
        Kasur ksur = new Kasur();
        Pintu pntu = new Pintu();

        bju1.setWarna("Putih");
        bju1.setSize("XL");
        bju1.cetakStatus();

        bju2.setJenisKain("Denim");
        bju2.setMerek("3 Second");
        bju2.setWarna("Merah");
        bju2.setSize("L");
        bju2.cetakStatus();

        ksur.setBahan("Kayu Jati");
        ksur.setLebar(30);
        ksur.cetakStatus();

        pntu.setBahan("Kayu Mahoni");
        pntu.setLebar(50);
        pntu.setWarna("Coklat");
        pntu.setjJumlahGagang(2);
        pntu.cetakStatus();
    }


    
}