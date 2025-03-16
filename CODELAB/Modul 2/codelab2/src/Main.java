// Kelas RekeningBank
class RekeningBank {
    private String nomorRekening;
    private String namaPemilik;
    private double saldo;

    // Constructor
    public RekeningBank(String nomorRekening, String namaPemilik, double saldo) {
        this.nomorRekening = nomorRekening;
        this.namaPemilik = namaPemilik;
        this.saldo = saldo;
    }

    // Method untuk menampilkan informasi rekening
    public void tampilkanInfo() {
        System.out.println("Nomor Rekening: " + nomorRekening);
        System.out.println("Nama Pemilik: " + namaPemilik);
        System.out.println("Saldo: Rp " + saldo);
    }

    // Method untuk setor uang
    public void setorUang(double jumlah) {
        if (jumlah > 0) {
            saldo += jumlah;
            System.out.println("Berhasil menyetor Rp " + jumlah);
        } else {
            System.out.println("Jumlah setor harus lebih dari 0");
        }
        tampilkanInfo();
    }

    // Method untuk tarik uang
    public void tarikUang(double jumlah) {
        if (jumlah > 0 && saldo >= jumlah) {
            saldo -= jumlah;
            System.out.println("Berhasil menarik Rp " + jumlah);
        } else {
            System.out.println("Transaksi gagal. Saldo tidak mencukupi atau jumlah tidak valid.");
        }
        tampilkanInfo();
    }
}

// Kelas Main
public class Main {
    public static void main(String[] args) {
        // Membuat dua objek RekeningBank
        RekeningBank rekening1 = new RekeningBank("202410370110531", "Muhammad Aditya Erpraja", 500000);
        RekeningBank rekening2 = new RekeningBank("202410370110520", "Belly Saputra", 300000);

        // Menampilkan informasi awal
        System.out.println("Informasi Rekening 1:");
        rekening1.tampilkanInfo();
        System.out.println();

        System.out.println("Informasi Rekening 2:");
        rekening2.tampilkanInfo();
        System.out.println();

        // Melakukan transaksi
        rekening1.setorUang(200000);
        rekening1.tarikUang(100000);

        rekening2.setorUang(150000);
        rekening2.tarikUang(50000);
    }
}
