public class Mahasiswa {
    //Keempat atribut menggunakan private. Artinya, atribut tersebut hanya dapat diakses secara langsung dari dalam class Mahasiswa
    private String nim; //Baris ini membuat atribut bernama nim dengan tipe data String. Atribut tersebut digunakan untuk menyimpan 
    //Nomor Induk Mahasiswa. Modifier private digunakan untuk membatasi akses langsung terhadap atribut nim. Artinya, atribut ini tidak
    // dapat diakses secara langsung dari class lain seperti MahasiswaMain
    private String nama;//Baris ini membuat atribut alamat dengan tipe data String
    private String alamat;//Baris ini membuat atribut nama dengan tipe data String 
    private double ipk; //Baris ini membuat atribut alamat dengan tipe data String.

    //merupakan constructor dari class Mahasiswa. Nama constructor harus sama dengan nama class, sehingga constructor ini bernama Mahasiswa. 
    //Constructor memiliki empat parameter, yaitu nim, nama, alamat, dan ipk. Constructor akan dijalankan ketika objek Mahasiswa dibuat menggunakan keyword new  
    public Mahasiswa(String nim, String nama, String alamat, double ipk) {
        this.nim = nim; //Baris ini digunakan untuk memasukkan nilai parameter nim ke dalam atribut nim milik objek. this.nim menunjukkan atribut nim yang dimiliki 
        //oleh objek yang sedang dibuat. Sementara itu, nim di sebelah kanan tanda = merupakan parameter constructor.
        this.nama = nama; //Baris ini digunakan untuk memasukkan nilai parameter nama ke atribut nama milik objek. this.nama merupakan atribut nama yang terdapat 
        //pada objek, sedangkan nama di sebelah kanan merupakan parameter constructor.
        this.alamat = alamat;//Baris ini digunakan untuk menyimpan nilai parameter alamat ke atribut alamat milik objek. Dengan adanya baris ini, setiap objek 
        //mahasiswa dapat menyimpan alamat sesuai dengan data yang diberikan ketika objek dibuat.

        if (ipk >= 0.00 && ipk <= 4.00) { //aris ini digunakan untuk melakukan validasi terhadap nilai IPK. Kondisi ipk >= 0.00 memastikan bahwa IPK tidak boleh 
        //kurang dari 0.00. Kondisi ipk <= 4.00 memastikan bahwa IPK tidak boleh lebih dari 4.00. Operator && berarti kedua kondisi tersebut harus terpenuhi. 
        //Jadi, nilai IPK dinyatakan valid apabila berada di antara 0.00 sampai 4.00
            this.ipk = ipk; //Baris ini digunakan untuk menyimpan nilai IPK ke atribut ipk milik objek. Perintah ini hanya dijalankan apabila nilai IPK memenuhi 
            //kondisi pada baris if, yaitu berada pada rentang 0.00–4.00
        } else {
            this.ipk = 0.00; //Baris ini memberikan nilai 0.00 kepada atribut ipk apabila IPK yang diberikan tidak valid. Artinya, ketika pengguna memberikan IPK 
            //di luar rentang 0.00–4.00, nilai tersebut tidak langsung disimpan. Program menggantinya dengan nilai 0.00
            System.out.println("IPK tidak valid. IPK diatur menjadi 0.00."); //memberitahukan bahwa IPK yang diberikan tidak memenuhi batas yang ditentukan
        }
    }
    public String getNim() { //Method tersebut menggunakan public sehingga dapat dipanggil dari class lain. Tipe pengembaliannya adalah String karena NIM disimpan 
    //menggunakan tipe data String. Method getNim() berfungsi untuk membaca nilai atribut nim yang bersifat private
        return nim; //Baris ini mengembalikan nilai atribut nim. Ketika getNim() dipanggil dari class lain, nilai NIM yang tersimpan pada objek akan dikembalikan melalui baris ini.
    }
    public String getNama() { //Baris ini membuat method getter bernama getNama()
        return nama; //Baris ini mengembalikan nilai atribut nama
    }
    public String getAlamat() { //Baris ini membuat getter getAlamat()
        return alamat; //Baris ini membuat getter getAlamat()
    }
    public double getIpk() { //Baris ini membuat getter getIpk() untuk membaca nilai atribut ipk.
        return ipk; //Baris ini mengembalikan nilai IPK yang tersimpan di dalam objek.
    }
    public void setNama(String nama) { //Baris ini membuat method setter setNama(). Method ini digunakan untuk mengubah nilai atribut nama.
    //Keyword public membuat method dapat dipanggil dari luar class. Keyword void menunjukkan bahwa method tidak mengembalikan nilai.
    // Parameter String nama digunakan untuk menerima nama baru yang akan dimasukkan ke atribut.
        this.nama = nama; //Baris ini menyimpan nama baru ke atribut nama milik objek. this.nama menunjukkan atribut milik objek, sedangkan 
        //nama merupakan parameter yang berisi nilai baru.
    }
    public void setAlamat(String alamat) { //Baris ini membuat setter setAlamat().
    //Method ini digunakan untuk mengubah nilai atribut alamat.
    //Parameter alamat digunakan untuk menerima nilai alamat baru yang akan disimpan ke objek.
        this.alamat = alamat; //Baris ini memasukkan nilai alamat baru ke atribut alamat milik objek.
    //this.alamat menunjukkan atribut objek, sedangkan alamat merupakan parameter yang berisi data baru.
    }

    //Baris ini membuat setter setIpk() yang digunakan untuk mengubah nilai IPK.
    //Parameter ipk menggunakan tipe data double karena IPK dapat memiliki nilai desimal.
    //Setter IPK dibuat berbeda dengan setter nama dan alamat karena di dalamnya terdapat proses validasi. Sebelum nilai IPK diubah, 
    //program akan memeriksa apakah nilai tersebut berada dalam rentang 0.00–4.00.
    public void setIpk(double ipk) {
        if (ipk >= 0.00 && ipk <= 4.00) { //Baris ini memeriksa apakah nilai IPK baru valid.
    //Nilai harus memenuhi dua kondisi, yaitu tidak kurang dari 0.00 dan tidak lebih dari 4.00
            this.ipk = ipk; //Baris ini menyimpan nilai IPK baru ke atribut ipk
            System.out.println("IPK berhasil diubah.");
        } else {
            System.out.println("IPK tidak valid. Masukkan IPK antara 0.00 sampai 4.00.");
        }
    }
}