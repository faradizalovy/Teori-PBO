public class Tas {
    public String merk;
    public String warna;
    public String bahan;
    public int kapasitas;
    public int jumlahKompartemen;

    public void buka() {
        System.out.println("Tas dibuka");
    }
    public void tutup() {
        System.out.println("Tas ditutup");
    }
    public void simpanBarang() {
        System.out.println("Barang disimpan ke dalam tas");
    }
    public void angkat() {
        System.out.println("Tas diangkat");
    }
}