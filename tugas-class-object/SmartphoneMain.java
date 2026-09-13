public class SmartphoneMain {
    public static void main(String[] args) {

        Smartphone smartphone1 = new Smartphone();
        Smartphone smartphone2 = new Smartphone();
        Smartphone smartphone3 = new Smartphone();

        smartphone1.merk = "NovaTech";
        smartphone1.warna = "Hitam";
        smartphone1.ram = 8;
        smartphone1.kapasitasPenyimpanan = 256;
        smartphone1.baterai = 5000;

        smartphone2.merk = "Pixelora";
        smartphone2.warna = "Biru";
        smartphone2.ram = 12;
        smartphone2.kapasitasPenyimpanan = 512;
        smartphone2.baterai = 5500;

        smartphone3.merk = "Zenova";
        smartphone3.warna = "Putih";
        smartphone3.ram = 6;
        smartphone3.kapasitasPenyimpanan = 128;
        smartphone3.baterai = 4500;

        System.out.println("=== DATA SMARTPHONE 1 ===");
        System.out.println("Merk: " + smartphone1.merk);
        System.out.println("Warna: " + smartphone1.warna);
        System.out.println("RAM: " + smartphone1.ram + " GB");
        System.out.println("Penyimpanan: " + smartphone1.kapasitasPenyimpanan + " GB");
        System.out.println("Baterai: " + smartphone1.baterai + " mAh");
        smartphone1.nyalakan();
        smartphone1.bukaAplikasi();
        smartphone1.isiDaya();
        smartphone1.matikan();

        System.out.println();

        System.out.println("=== DATA SMARTPHONE 2 ===");
        System.out.println("Merk: " + smartphone2.merk);
        System.out.println("Warna: " + smartphone2.warna);
        System.out.println("RAM: " + smartphone2.ram + " GB");
        System.out.println("Penyimpanan: " + smartphone2.kapasitasPenyimpanan + " GB");
        System.out.println("Baterai: " + smartphone2.baterai + " mAh");
        smartphone2.nyalakan();
        smartphone2.bukaAplikasi();

        System.out.println();

        System.out.println("=== DATA SMARTPHONE 3 ===");
        System.out.println("Merk: " + smartphone3.merk);
        System.out.println("Warna: " + smartphone3.warna);
        System.out.println("RAM: " + smartphone3.ram + " GB");
        System.out.println("Penyimpanan: " + smartphone3.kapasitasPenyimpanan + " GB");
        System.out.println("Baterai: " + smartphone3.baterai + " mAh");
        smartphone3.nyalakan();
        smartphone3.isiDaya();
    }
}