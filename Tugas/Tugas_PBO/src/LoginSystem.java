// Import library yang dibutuhkan
import java.util.Scanner;

// Kelas Admin
class Admin {
    // Atribut Admin
    private String username = "admin531";
    private String password = "admin@531";

    // Metode untuk memverifikasi login Admin
    public boolean login(String usernameInput, String passwordInput) {
        return username.equals(usernameInput) && password.equals(passwordInput);
    }

    // Menampilkan informasi Admin setelah login berhasil
    public void displayInfo() {
        System.out.println("Login Admin berhasil!");
        System.out.println("Selamat datang, Admin!");
    }
}

// Kelas Mahasiswa
class Mahasiswa {
    // Atribut Mahasiswa
    private String nama = "Muhammad Aditya Erpraja";
    private String nim = "202410370110531";

    // Metode untuk memverifikasi login Mahasiswa
    public boolean login(String namaInput, String nimInput) {
        return nama.equals(namaInput) && nim.equals(nimInput);
    }

    // Menampilkan informasi Mahasiswa setelah login berhasil
    public void displayInfo() {
        System.out.println("Login Mahasiswa berhasil!");
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
    }
}

// Kelas utama: LoginSystem
public class LoginSystem {
    public static void main(String[] args) {
        // Inisialisasi Scanner untuk input pengguna
        Scanner scanner = new Scanner(System.in);

        // Membuat objek Admin dan Mahasiswa
        Admin admin = new Admin();
        Mahasiswa mahasiswa = new Mahasiswa();

        // Menampilkan menu login
        System.out.println("Selamat datang di Sistem Login!");
        System.out.println("1. Login sebagai Admin");
        System.out.println("2. Login sebagai Mahasiswa");
        System.out.print("Pilih opsi (1/2): ");

        // Memastikan input berupa angka
        while (!scanner.hasNextInt()) {
            System.out.println("Input tidak valid. Silakan pilih 1 atau 2.");
            scanner.next(); // Membuang input yang salah
            System.out.print("Pilih opsi (1/2): ");
        }
        int pilihan = scanner.nextInt();
        scanner.nextLine(); // Membersihkan buffer

        // Memproses pilihan login
        switch (pilihan) {
            case 1:
                // Login sebagai Admin
                System.out.print("Masukkan username: ");
                String usernameInput = scanner.nextLine();
                System.out.print("Masukkan password: ");
                String passwordInput = scanner.nextLine();

                if (admin.login(usernameInput, passwordInput)) {
                    admin.displayInfo();
                } else {
                    System.out.println("Username atau password salah.");
                }
                break;

            case 2:
                // Login sebagai Mahasiswa
                System.out.print("Masukkan nama: ");
                String namaInput = scanner.nextLine();
                System.out.print("Masukkan NIM: ");
                String nimInput = scanner.nextLine();

                if (mahasiswa.login(namaInput, nimInput)) {
                    mahasiswa.displayInfo();
                } else {
                    System.out.println("Nama atau NIM salah.");
                }
                break;

            default:
                // Jika input tidak valid
                System.out.println("Pilihan tidak valid. Silakan pilih 1 atau 2.");
                break;
        }

        // Menutup scanner
        scanner.close();
    }
}
