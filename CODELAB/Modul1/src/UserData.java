import java.util.Scanner;
import java.time.LocalDate;

public class UserData {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Meminta input nama
        System.out.print("Masukkan Nama: ");
        String nama = scanner.nextLine();

        // Meminta input jenis kelamin
        char jenisKelamin;
        while (true) {
            System.out.print("Masukkan Jenis Kelamin (L/P): ");
            jenisKelamin = scanner.next().charAt(0);
            if (jenisKelamin == 'L' || jenisKelamin == 'l' || jenisKelamin == 'P' || jenisKelamin == 'p') {
                break;
            } else {
                System.out.println("Input tidak valid. Harap masukkan 'L' untuk Laki-laki atau 'P' untuk Perempuan.");
            }
        }

        // Meminta input tahun lahir
        System.out.print("Masukkan Tahun Lahir: ");
        int tahunLahir = scanner.nextInt();

        // Menutup scanner
        scanner.close();

        // Menghitung umur
        int tahunSekarang = LocalDate.now().getYear();
        int umur = tahunSekarang - tahunLahir;

        // Menentukan jenis kelamin dalam teks
        String jenisKelaminText = (jenisKelamin == 'L' || jenisKelamin == 'l') ? "Laki-laki" : "Perempuan";

        // Menampilkan output
        System.out.println("\n=== Data Diri ===");
        System.out.println("Nama: " + nama);
        System.out.println("Jenis Kelamin: " + jenisKelaminText);
        System.out.println("Umur: " + umur + " tahun");
    }
}
