
public class Demo {

    public static void main(String[] args) {
        Baju bju1 = new Baju();
        BajuTidur bju2 = new BajuTidur();
        BajuMain bju3 = new BajuMain();
        Kasur ksur = new Kasur();
        Pintu pntu = new Pintu();
        System.out.println("==================");
        bju1.setWarna("Putih");
        bju1.setSize("XL");
        bju1.cetakStatus();
        System.out.println("==================");
        bju2.setJenisKain("Denim");
        bju2.setMerek("3 Second");
        bju2.setWarna("Merah");
        bju2.setSize("L");
        bju2.cetakStatus();
        System.out.println("==================");
        bju3.setBahan("Katun");
        bju3.setMerk("Adidas");
        bju3.setSize("M");
        bju3.setWarna("Kuning");
        bju3.cetakStatus();
        System.out.println("==================");
        ksur.setBahan("Kayu Jati");
        ksur.setLebar(30);
        ksur.cetakStatus();
        System.out.println("==================");
        pntu.setBahan("Kayu Mahoni");
        pntu.setLebar(50);
        pntu.setWarna("Coklat");
        pntu.setjJumlahGagang(2);
        pntu.cetakStatus();
    }


    
}