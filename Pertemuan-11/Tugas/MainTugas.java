public class MainTugas {
        public static void main(String[] args) {        
            Singa hewan1 = new Singa("Joni Singa", 4, "Mauung", "Orange Hitam Belang-Belang");
            Keledai hewan2 = new Keledai("Si Keledai", 4, "Xixi", "Abu - Abu");
            Gorilla hewan3 = new Gorilla("Si Gorilla", 2, "Huaaa", "Hitam");
            
            hewan1.displayMakan();
            hewan1.displayBinatang();
            hewan1.displayData();
            System.out.println("===============================================");
            hewan2.displayMakan();
            hewan2.displayBinatang();
            hewan2.displayData();
            System.out.println("===============================================");
            hewan3.displayMakan();
            hewan3.displayBinatang();
            hewan3.displayData();
            System.out.println("===============================================");
    }    
}
