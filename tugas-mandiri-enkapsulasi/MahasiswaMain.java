public class MahasiswaMain { //Class ini digunakan sebagai tempat untuk menjalankan program dan melakukan pengujian terhadap class Mahasiswa
    public static void main(String[] args) { //Baris ini merupakan method main(), yaitu bagian utama yang pertama kali dijalankan ketika program Java dieksekusi.

        Mahasiswa mahasiswa1 = new Mahasiswa( //Baris ini membuat objek pertama dari class Mahasiswa dan menyimpannya dalam variabel mahasiswa1.
        //Pada baris ini constructor Mahasiswa dipanggil sehingga program membutuhkan data NIM, nama, alamat, dan IPK sebagai parameter
            "2541720001", //Baris ini memberikan nilai NIM untuk objek mahasiswa1. Nilai tersebut dikirimkan sebagai parameter pertama kepada 
            //constructor Mahasiswa
            "Faradiza Lovy", //Baris ini memberikan nama mahasiswa pertama kepada constructor.
            "Malang", //memberikan alamat mahasiswa pertama.
            3.75 //Baris ini memberikan nilai IPK awal untuk mahasiswa pertama. Nilai 3.75 bertipe double dan akan diperiksa oleh validasi 
            // yang terdapat di constructor
        );

        Mahasiswa mahasiswa2 = new Mahasiswa( //Baris ini membuat objek kedua bernama mahasiswa2. Objek tersebut dibuat dari class Mahasiswa yang sama, 
        //tetapi memiliki data yang berbeda dari mahasiswa1.
            "2541720002", //Baris ini memberikan NIM untuk objek mahasiswa2.
            "Nabila Azzahra", //Baris ini memberikan nama untuk objek mahasiswa2.
            "Sidoarjo", //Baris ini memberikan alamat untuk objek mahasiswa2
            3.50 //Baris ini memberikan nilai IPK awal sebesar 3.50 untuk mahasiswa kedua.Nilai tersebut berada dalam rentang 0.00–4.00, sehingga 
            //akan diterima oleh validasi pada constructor.
        );

        System.out.println("=== DATA MAHASISWA ===");

        System.out.println("Mahasiswa 1");
        System.out.println("NIM    : " + mahasiswa1.getNim()); //Baris ini menampilkan NIM dari objek mahasiswa1. Program menggunakan getNim() untuk mengambil 
        //nilai NIM. Ini merupakan penerapan enkapsulasi karena atribut nim bersifat private
        System.out.println("Nama   : " + mahasiswa1.getNama()); //Baris ini menampilkan nama mahasiswa pertama menggunakan method getNama(). Getter digunakan 
        //karena atribut nama bersifat private
        System.out.println("Alamat : " + mahasiswa1.getAlamat()); //Getter digunakan karena atribut nama bersifat private
        System.out.println("IPK    : " + mahasiswa1.getIpk()); //Baris ini menampilkan IPK mahasiswa pertama menggunakan getter getIpk()

        System.out.println();

        System.out.println("Mahasiswa 2");
        System.out.println("NIM    : " + mahasiswa2.getNim()); //Baris ini mengambil NIM mahasiswa kedua menggunakan getNim() kemudian menampilkannya ke console.
        System.out.println("Nama   : " + mahasiswa2.getNama()); //mengambil nama mahasiswa kedua melalui getNama() dan menampilkannya.
        System.out.println("Alamat : " + mahasiswa2.getAlamat());//mengambil alamat mahasiswa kedua melalui getAlamat() dan menampilkannya
        System.out.println("IPK    : " + mahasiswa2.getIpk()); //mengambil nilai IPK mahasiswa kedua menggunakan getIpk() dan menampilkannya

        mahasiswa1.setNama("Faradiza Lovy Shelsamevira"); //Baris ini mengubah nama mahasiswa pertama menggunakan setter setNama()
        //Nilai nama sebelumnya adalah "Faradiza Lovy", kemudian diubah menjadi "Faradiza Lovy Shelsamevira". Perubahan tersebut dilakukan melalui setter karena 
        //atribut nama bersifat private
        mahasiswa1.setAlamat("Lawang, Malang");//Baris ini mengubah alamat mahasiswa pertama menggunakan setter setAlamat()
        //Alamat yang sebelumnya "Malang" diubah menjadi "Lawang, Malang"
        mahasiswa1.setIpk(3.90); //Baris ini mengubah IPK mahasiswa pertama menjadi 3.90 menggunakan setter setIpk().
        //Sebelum nilai tersebut disimpan, method setIpk() akan melakukan validasi terlebih dahulu.

        System.out.println();
        System.out.println("=== DATA SETELAH DIUBAH ===");

        System.out.println("NIM    : " + mahasiswa1.getNim()); //Baris ini menampilkan NIM mahasiswa pertama setelah proses perubahan data
        //NIM tetap menggunakan getNim() karena NIM merupakan atribut read-only.
        System.out.println("Nama   : " + mahasiswa1.getNama()); //Baris ini menampilkan nama mahasiswa pertama setelah diubah menggunakan setNama()
        System.out.println("Alamat : " + mahasiswa1.getAlamat()); //Baris ini menampilkan alamat mahasiswa pertama setelah diubah menggunakan setAlamat()
        System.out.println("IPK    : " + mahasiswa1.getIpk()); //menampilkan nilai IPK mahasiswa pertama setelah diubah menggunakan setIpk()

        System.out.println();
        System.out.println("=== UJI VALIDASI IPK ===");

        mahasiswa1.setIpk(4.50); //Baris ini mencoba mengubah IPK mahasiswa pertama menjadi 4.50.Nilai 4.50 sengaja digunakan untuk pengujian karena melebihi 
        //batas maksimal IPK, yaitu 4.00 Ketika method setIpk() dipanggil, program akan memeriksa apakah nilai tersebut berada pada rentang 0.00–4.00. Karena 4.50 tidak 
        //memenuhi kondisi tersebut, nilai IPK tidak akan diubah.

        System.out.println("IPK setelah memasukkan nilai 4.50 : " //merupakan bagian pertama dari perintah System.out.println() yang digunakan untuk menampilkan keterangan 
        //mengenai nilai IPK setelah dilakukan percobaan memasukkan 4.50
        + mahasiswa1.getIpk()); //melanjutkan perintah pada baris sebelumnya. Program mengambil kembali nilai IPK menggunakan getter. Karena 4.50 ditolak oleh validasi, 
        //nilai IPK tetap 3.90

        // System.out.println(mahasiswa1.nama); 
        //Baris tersebut merupakan kode pengujian untuk mencoba mengakses atribut nama secara langsung. jika tanda // dihapus, kode akan menghasilkan error karena nama 
        //merupakan atribut private pada class Mahasiswa
    }
}