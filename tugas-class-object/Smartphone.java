public class Smartphone {
    public String merk;
    public String warna;
    public int ram;
    public int kapasitasPenyimpanan;
    public int baterai;

    // Constructor tanpa parameter
    public Smartphone() {
        merk = "NovaTech";
        warna = "Hitam";
        ram = 8;
        kapasitasPenyimpanan = 256;
        baterai = 5000;
    }
    // Constructor berparameter
    public Smartphone(String merk, String warna, int ram, int kapasitasPenyimpanan, int baterai) {
        this.merk = merk;
        this.warna = warna;
        this.ram = ram;
        this.kapasitasPenyimpanan = kapasitasPenyimpanan;
        this.baterai = baterai;
    }
    public void nyalakan() {
        System.out.println("Smartphone dinyalakan");
    }
    public void matikan() {
        System.out.println("Smartphone dimatikan");
    }
    public void bukaAplikasi() {
        System.out.println("Smartphone membuka aplikasi");
    }
    public void isiDaya() {
        System.out.println("Smartphone sedang diisi daya");
    }
}