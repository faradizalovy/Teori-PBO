class Mahasiswa { // digunakan untuk membuat sebuah class bernama Mahasiswa. Class tersebut menjadi 
// rancangan untuk objek mahasiswa yang akan digunakan dalam program
    String nama; //merupakan atribut dari class Mahasiswa. nama digunakan untuk menyimpan nama mahasiswa, 
    String nim; // sedangkan nim digunakan untuk menyimpan nomor induk mahasiswa.


    void tampilkanData() { //mendefinisikan perilaku yang dapat dilakukan oleh objek mahasiswa
        System.out.println("Nama: " + nama); //Baris ini digunakan untuk menampilkan nilai dari atribut nama ke layar.
        // Jika nilai nama adalah "Faradiza", maka output yang ditampilkan adalah:
        System.out.println("NIM: " + nim); //Baris ini digunakan untuk menampilkan nilai dari atribut nim. 
        // Jika nilai nim adalah "254107060109", maka outputnya:

    }
}

// MAIN
public class Main { //Baris ini membuat class Main, yang digunakan sebagai tempat program mulai dijalankan.
    public static void main(String[] args) { //merupakan method utama (main) dalam Java. Program akan mulai dieksekusi dari method ini.

        Mahasiswa mhs = new Mahasiswa(); //merupakan bagian penting dalam PBO karena digunakan untuk membuat object. 
        // Mahasiswa merupakan class, sedangkan mahasiswa1 merupakan object yang dibuat dari class tersebut.
        // Kata new digunakan untuk membuat object baru berdasarkan class Mahasiswa.
        mhs.nama = "Faradiza"; // Baris ini memberikan nilai "Faradiza" pada atribut nama yang dimiliki oleh object mahasiswa1.
        mhs.nim = "254107060109"; //Baris ini memberikan nilai NIM pada atribut nim milik object mahasiswa1.
        mhs.tampilkanData(); //Baris ini memberikan nilai NIM pada atribut nim milik object mahasiswa1.

    }
}