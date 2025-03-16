import java.util.Scanner;

public class SistemLogin {
    public static void main(String[] args) {
        // Membuat objek scanner
        Scanner scanner = new Scanner(System.in);

        // Menampilkan pilihan login
        System.out.println("Pilih Jenis Login:");
        System.out.println("1. Admin");
        System.out.println("2. Mahasiswa");
        System.out.print("Masukkan pilihan (1 atau 2): ");

        // Membaca input pilihan
        int pilihan = scanner.nextInt();
        scanner.nextLine();  // Membersihkan newline

        // Memilih berdasarkan input pengguna
        if (pilihan == 1) {
            // Login sebagai Admin
            System.out.print("Masukkan Username: ");
            String username = scanner.nextLine();
            System.out.print("Masukkan Password: ");
            String password = scanner.nextLine();

            // Mengecek validitas username dan password
            if (username.equals("Admin531") && password.equals("Password531")) {
                System.out.println("Login Admin berhasil!");
            } else {
                System.out.println("Login gagal! Username atau password salah.");
            }

        } else if (pilihan == 2) {
            // Login sebagai Mahasiswa
            System.out.print("Masukkan Nama: ");
            String nama = scanner.nextLine();
            System.out.print("Masukkan NIM: ");
            String nim = scanner.nextLine();

            // Mengecek validitas nama dan NIM
            if (nama.equals("Muhammad Aditya Erpraja") && nim.equals("202410370110531")) {
                System.out.println("Login Mahasiswa berhasil!");
                System.out.println("Nama: " + nama);
                System.out.println("NIM: " + nim);
            } else {
                System.out.println("Login gagal! Nama atau NIM salah.");
            }

        } else {
            // Jika pilihan tidak valid
            System.out.println("Pilihan tidak valid.");
        }

        // Menutup scanner
        scanner.close();
    }
}
