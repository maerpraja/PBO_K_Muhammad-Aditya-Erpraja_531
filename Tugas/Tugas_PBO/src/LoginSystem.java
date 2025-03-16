// Import library yang dibutuhkan
import java.util.Scanner;

// Superclass User
class User {
    // Atribut yang dienkapsulasi
    private String nama;
    private String nim;

    // Constructor
    public User(String nama, String nim) {
        this.nama = nama;
        this.nim = nim;
    }

    // Getter dan Setter
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    // Method login (akan dioverride oleh subclass)
    public boolean login(String input1, String input2) {
        return false;
    }

    // Method displayInfo (akan dioverride oleh subclass)
    public void displayInfo() {
        System.out.println("Informasi Pengguna");
    }
}

// Subclass Admin
class Admin extends User {
    private String username;
    private String password;

    // Constructor menggunakan super
    public Admin(String nama, String nim, String username, String password) {
        super(nama, nim);
        this.username = username;
        this.password = password;
    }

    // Override method login
    @Override
    public boolean login(String usernameInput, String passwordInput) {
        return this.username.equals(usernameInput) && this.password.equals(passwordInput);
    }

    // Override method displayInfo
    @Override
    public void displayInfo() {
        System.out.println("Login Admin berhasil!");
        System.out.println("Selamat datang, Admin " + getNama() + "!");
    }
}

// Subclass Mahasiswa
class Mahasiswa extends User {
    // Constructor menggunakan super
    public Mahasiswa(String nama, String nim) {
        super(nama, nim);
    }

    // Override method login
    @Override
    public boolean login(String namaInput, String nimInput) {
        return getNama().equals(namaInput) && getNim().equals(nimInput);
    }

    // Override method displayInfo
    @Override
    public void displayInfo() {
        System.out.println("Login Mahasiswa berhasil!");
        System.out.println("Nama: " + getNama());
        System.out.println("NIM: " + getNim());
    }
}

// Kelas utama: LoginSystem
public class LoginSystem {
    public static void main(String[] args) {
        // Inisialisasi Scanner untuk input pengguna
        Scanner scanner = new Scanner(System.in);

        // Membuat objek Admin dan Mahasiswa
        Admin admin = new Admin("Admin Utama", "000000", "admin531", "admin@531");
        Mahasiswa mahasiswa = new Mahasiswa("Muhammad Aditya Erpraja", "202410370110531");

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
