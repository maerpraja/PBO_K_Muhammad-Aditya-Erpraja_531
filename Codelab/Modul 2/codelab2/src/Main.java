// Kelas RekeningBank
class RekeningBank {
    // Atribut kelas RekeningBank
    String nomorRekening;
    String namaPemilik;
    double saldo;

    // Konstruktor untuk menginisialisasi atribut
    public RekeningBank(String nomorRekening, String namaPemilik, double saldo) {
        this.nomorRekening = nomorRekening;
        this.namaPemilik = namaPemilik;
        this.saldo = saldo;
    }

    // Metode untuk menampilkan informasi rekening
    public void tampilkanInfo() {
        System.out.println("Nomor Rekening: " + nomorRekening);
        System.out.println("Nama Pemilik: " + namaPemilik);
        System.out.println("Saldo: Rp " + saldo);
        System.out.println(); // Agar output lebih rapi
    }

    // Metode untuk setor uang (menambahkan saldo)
    public void setorUang(double jumlah) {
        saldo += jumlah;
        System.out.println("Setor Uang: Rp " + jumlah);
        System.out.println("Saldo setelah setor: Rp " + saldo);
        System.out.println(); // Agar output lebih rapi
    }

    // Metode untuk tarik uang (mengurangi saldo)
    public void tarikUang(double jumlah) {
        if (saldo >= jumlah) {
            saldo -= jumlah;
            System.out.println("Tarik Uang: Rp " + jumlah);
            System.out.println("Saldo setelah tarik: Rp " + saldo);
        } else {
            System.out.println("Saldo tidak mencukupi untuk tarik uang sebesar Rp " + jumlah);
        }
        System.out.println(); // Agar output lebih rapi
    }
}

// Kelas Main
public class Main {
    public static void main(String[] args) {
        // Membuat dua objek RekeningBank
        RekeningBank rekening1 = new RekeningBank("123456789", "Andi", 500000);
        RekeningBank rekening2 = new RekeningBank("987654321", "Budi", 300000);

        // Menampilkan informasi rekening
        System.out.println("Informasi Rekening 1:");
        rekening1.tampilkanInfo();

        System.out.println("Informasi Rekening 2:");
        rekening2.tampilkanInfo();

        // Melakukan transaksi pada rekening1
        System.out.println("Transaksi Rekening 1:");
        rekening1.setorUang(200000); // Menyetor uang ke rekening1
        rekening1.tarikUang(150000); // Menarik uang dari rekening1

        // Melakukan transaksi pada rekening2
        System.out.println("Transaksi Rekening 2:");
        rekening2.setorUang(100000); // Menyetor uang ke rekening2
        rekening2.tarikUang(500000); // Mencoba menarik uang lebih banyak dari saldo
    }
}
