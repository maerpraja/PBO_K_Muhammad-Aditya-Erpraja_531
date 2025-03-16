// Kelas Hewan
class Hewan {
    // Atribut
    String nama;
    String jenis;
    String suara;

    // Konstruktor untuk menginisialisasi atribut
    Hewan(String nama, String jenis, String suara) {
        this.nama = nama;
        this.jenis = jenis;
        this.suara = suara;
    }

    // Metode untuk menampilkan informasi hewan
    void tampilkanInfo() {
        System.out.println("Nama Hewan: " + nama);
        System.out.println("Jenis Hewan: " + jenis);
        System.out.println("Suara Hewan: " + suara);
        System.out.println();
    }
}

// Kelas Main
public class Main {
    public static void main(String[] args) {
        // Membuat objek Hewan
        Hewan hewan1 = new Hewan("Kucing", "Mamalia", "Nyann~~");
        Hewan hewan2 = new Hewan("Anjing", "Mamalia", "Woof-Woof!!");

        // Memanggil metode tampilkanInfo() untuk kedua objek
        hewan1.tampilkanInfo();
        hewan2.tampilkanInfo();
    }
}
