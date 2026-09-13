public class DemoPerpustakaan {
    public static void main(String[] args) {

        Buku buku1 = new Buku();
        buku1.judul = "Jejak di Balik Layar";
        buku1.penulis = "Raka Pratama";
        buku1.tahunTerbit = 2024;
        buku1.kategori = "Teknologi";

        Buku buku2 = new Buku();
        buku2.judul = "Langkah Kecil Menuju Sukses";
        buku2.penulis = "Nadia Permata";
        buku2.tahunTerbit = 2023;
        buku2.kategori = "Motivasi";

        Anggota anggota1 = new Anggota();
        anggota1.nama = "Faradiza";
        anggota1.nim = "254107060109";
        anggota1.jurusan = "Sistem Informasi Bisnis";

        System.out.println("=================================");
        System.out.println("      SISTEM PERPUSTAKAAN");
        System.out.println("=================================");

        System.out.println();
        System.out.println("=== DATA BUKU 1 ===");
        buku1.tampilkanInfo();

        System.out.println();
        System.out.println("=== DATA BUKU 2 ===");
        buku2.tampilkanInfo();
        System.out.println("=================================");

        System.out.println();
        System.out.println("=== DATA ANGGOTA ===");
        anggota1.tampilkanInfo();
        System.out.println("=================================");
        System.out.println();
        System.out.println("=== PROSES PEMINJAMAN ===");
        anggota1.pinjamBuku();
        buku1.pinjamBuku();
        System.out.println("=================================");

        System.out.println();
        System.out.println("=== PROSES PENGEMBALIAN ===");
        anggota1.kembalikanBuku();
        buku1.kembalikanBuku();
        System.out.println("=================================");
    }
}