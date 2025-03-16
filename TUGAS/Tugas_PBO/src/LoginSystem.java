import java.util.Scanner;

// Superclass User
class User {
    private String nama;
    private String nim;

    public User(String nama, String nim) {
        this.nama = nama;
        this.nim = nim;
    }

    public String getNama() {
        return nama;
    }

    public String getNim() {
        return nim;
    }

    public boolean login(String inputNama, String inputNim) {
        return inputNama.equals(nama) && inputNim.equals(nim);
    }

    public void displayInfo() {
        System.out.println("Login berhasil!");
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
    }
}

// Subclass Admin
class Admin extends User {
    private final String username = "admin531";
    private final String password = "password531";

    public Admin(String nama, String nim) {
        super(nama, nim);
    }

    @Override
    public boolean login(String inputUsername, String inputPassword) {
        return inputUsername.equals(username) && inputPassword.equals(password);
    }

    @Override
    public void displayInfo() {
        System.out.println("Login Admin berhasil!");
    }
}

// Subclass Mahasiswa
class Mahasiswa extends User {
    public Mahasiswa(String nama, String nim) {
        super(nama, nim);
    }

    @Override
    public boolean login(String inputNama, String inputNim) {
        return super.getNama().equals(inputNama) && super.getNim().equals(inputNim);
    }

    @Override
    public void displayInfo() {
        System.out.println("Login Mahasiswa berhasil!");
        System.out.println("Nama: " + getNama());
        System.out.println("NIM: " + getNim());
    }
}

// Kelas utama LoginSystem
public class LoginSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Admin admin = new Admin("Admin", "531");
        Mahasiswa mahasiswa = new Mahasiswa("Muhammad Aditya Erpraja", "202410370110531");

        System.out.println("Pilih Jenis Login:");
        System.out.println("1. Admin");
        System.out.println("2. Mahasiswa");
        System.out.print("Masukkan pilihan: ");
        int pilihan = scanner.nextInt();
        scanner.nextLine(); // Membersihkan buffer

        if (pilihan == 1) {
            // Login sebagai Admin
            System.out.print("Masukkan username: ");
            String username = scanner.nextLine();
            System.out.print("Masukkan password: ");
            String password = scanner.nextLine();

            if (admin.login(username, password)) {
                admin.displayInfo();
            } else {
                System.out.println("Login gagal! Username atau password salah.");
            }
        } else if (pilihan == 2) {
            // Login sebagai Mahasiswa
            System.out.print("Masukkan Nama: ");
            String nama = scanner.nextLine();
            System.out.print("Masukkan NIM: ");
            String nim = scanner.nextLine();

            if (mahasiswa.login(nama, nim)) {
                mahasiswa.displayInfo();
            } else {
                System.out.println("Login gagal! Nama atau NIM salah.");
            }
        } else {
            System.out.println("Pilihan tidak valid.");
        }

        scanner.close();
    }
}