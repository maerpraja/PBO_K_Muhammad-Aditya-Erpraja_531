import java.util.Scanner;
import java.time.LocalDate;

public class DataDiri {
    public static void main(String[] args) {
        // Membuat scanner untuk input pengguna
        Scanner scanner = new Scanner(System.in);

        // Meminta input Nama
        System.out.print("Masukkan Nama Anda: ");
        String nama = scanner.nextLine();

        // Meminta input Jenis Kelamin
        System.out.print("Masukkan Jenis Kelamin (P untuk Perempuan, L untuk Laki-laki): ");
        char jenisKelamin = scanner.next().charAt(0);

        // Meminta input Tahun Lahir
        System.out.print("Masukkan Tahun Lahir Anda: ");
        int tahunLahir = scanner.nextInt();

        // Mendapatkan tahun saat ini
        int tahunSekarang = LocalDate.now().getYear();

        // Menghitung umur
        int umur = tahunSekarang - tahunLahir;

        // Menentukan jenis kelamin berdasarkan input
        String jenisKelaminStr = (jenisKelamin == 'L' || jenisKelamin == 'l') ? "Laki-laki" : "Perempuan";

        // Menampilkan hasil
        System.out.println("\nData Diri Anda:");
        System.out.println("Nama: " + nama);
        System.out.println("Jenis Kelamin: " + jenisKelaminStr);
        System.out.println("Umur: " + umur + " tahun");

        // Menutup scanner setelah selesai
        scanner.close();
    }
}
