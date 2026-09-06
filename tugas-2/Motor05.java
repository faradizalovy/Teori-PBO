public class Motor05 { //Kode tersebut digunakan untuk mendeklarasikan sebuah class bernama Motor05
    // Atribut
    String merk; //merk bertipe String digunakan untuk menyimpan merek motor
    String warna; //warna bertipe String digunakan untuk menyimpan warna motor
    int kapasitasMesin; //kapasitasMesin bertipe int digunakan untuk menyimpan kapasitas mesin 
    //motor dalam satuan cc

    // Constructor tanpa parameter
    public Motor05() {
        merk = "Tidak diketahui"; //Mendeklarasikan constructor tanpa parameter bernama Motor05. 
        //Nama constructor harus sama dengan nama class dan constructor tidak memiliki tipe nilai kembalian (return type)
        warna = "Tidak diketahui"; //memberikan nilai awal "Tidak diketahui" pada atribut warna. Nilai tersebut digunakan 
        //karena warna motor belum ditentukan ketika objek dibuat tanpa parameter, sehingga program memberikan nilai default sebagai penanda bahwa data warna belum diketahui
        kapasitasMesin = 0; //memberikan nilai awal 0 pada atribut kapasitasMesin. Nilai 0 digunakan sebagai nilai default ketika kapasitas mesin belum diberikan, sehingga 
        //objek tetap mempunyai nilai awal meskipun data kapasitas mesin belum ditentukan
    }
    // Constructor berparameter
    public Motor05(String merk, String warna, int kapasitasMesin) { //mendeklarasikan constructor berparameter untuk class Motor05. Constructor menerima tiga parameter, 
    //yaitu merk untuk menerima merek motor, warna untuk menerima warna motor, dan kapasitasMesin untuk menerima kapasitas mesin motor
        this.merk = merk; //digunakan untuk memasukkan nilai parameter merk ke atribut merk milik objek Motor05. Keyword this digunakan untuk menunjukkan bahwa merk yang
        //berada di sebelah kiri merupakan atribut milik objek, sedangkan merk di sebelah kanan merupakan nilai parameter yang diterima constructor
        this.warna = warna; //digunakan untuk memasukkan nilai parameter warna ke atribut warna milik objek Motor05. Keyword this menunjukkan bahwa warna di sebelah kiri 
        //merupakan atribut objek, sedangkan warna di sebelah kanan merupakan parameter yang diterima dari saat objek dibuat
        this.kapasitasMesin = kapasitasMesin; //digunakan untuk memasukkan nilai parameter kapasitasMesin ke atribut kapasitasMesin milik objek Motor05. Dengan demikian, 
        //kapasitas mesin yang diberikan ketika objek dibuat akan tersimpan sebagai data dari objek tersebut
    }
    // Method
    public void nyalakan() { //mendeklarasikan method bernama nyalakan(). Method tersebut digunakan untuk menggambarkan perilaku motor ketika dinyalakan. Keyword void 
    //menunjukkan bahwa method ini tidak mengembalikan nila
        System.out.println("Motor dinyalakan."); //digunakan untuk menampilkan pesan "Motor dinyalakan." ke layar ketika method nyalakan() dijalankan. Pesan tersebut 
        //digunakan sebagai representasi sederhana bahwa motor telah dinyalakan
    }
    public void tampilkanData() { //mendeklarasikan method bernama tampilkanData(). Method tersebut digunakan untuk menampilkan seluruh data yang tersimpan pada objek Motor05, 
    //yaitu merek, warna, dan kapasitas mesin
        System.out.println("Merek           : " + merk);// menampilkan nilai atribut merk ke layar dengan label "Merek".
        System.out.println("Warna           : " + warna); // menampilkan nilai atribut warna ke layar dengan label "Warna".
        System.out.println("Kapasitas Mesin : " + kapasitasMesin + " cc");  // menampilkan nilai atribut kapasitasMesin ke layar dan menambahkan satuan "cc".
    }
}