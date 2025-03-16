// Superclass KarakterGame
class KarakterGame {
    private String nama;
    private int kesehatan;

    // Constructor
    public KarakterGame(String nama, int kesehatan) {
        this.nama = nama;
        this.kesehatan = kesehatan;
    }

    // Getter dan Setter
    public String getNama() {
        return nama;
    }

    public int getKesehatan() {
        return kesehatan;
    }

    public void setKesehatan(int kesehatan) {
        this.kesehatan = kesehatan;
    }

    // Method serang yang akan dioverride
    public void serang(KarakterGame target) {
        System.out.println(nama + " menyerang " + target.getNama() + "!");
    }
}

// Subclass Pahlawan
class Pahlawan extends KarakterGame {
    public Pahlawan(String nama, int kesehatan) {
        super(nama, kesehatan);
    }

    @Override
    public void serang(KarakterGame target) {
        System.out.println(getNama() + " menyerang " + target.getNama() + " menggunakan centong keplak!!!");
        target.setKesehatan(target.getKesehatan() - 20);
        System.out.println("Kesehatan " + target.getNama() + " sekarang: " + target.getKesehatan());
    }
}

// Subclass Musuh
class Musuh extends KarakterGame {
    public Musuh(String nama, int kesehatan) {
        super(nama, kesehatan);
    }

    @Override
    public void serang(KarakterGame target) {
        System.out.println(getNama() + " menyerang " + target.getNama() + " menggunakan panci smash!!!");
        target.setKesehatan(target.getKesehatan() - 15);
        System.out.println("Kesehatan " + target.getNama() + " sekarang: " + target.getKesehatan());
    }
}

// Kelas Utama
public class Main {
    public static void main(String[] args) {
        // Membuat objek karakter
        KarakterGame umum = new KarakterGame("Karakter Umum", 100);
        Pahlawan raehan = new Pahlawan("Raehan", 300);
        Musuh rehan = new Musuh("Rehan", 250);

        // Menampilkan status awal
        System.out.println("Status Awal:");
        System.out.println(raehan.getNama() + " memiliki kesehatan: " + raehan.getKesehatan());
        System.out.println(rehan.getNama() + " memiliki kesehatan: " + rehan.getKesehatan());
        System.out.println();

        // Simulasi pertarungan
        raehan.serang(rehan);
        System.out.println();
        rehan.serang(raehan);
    }
}