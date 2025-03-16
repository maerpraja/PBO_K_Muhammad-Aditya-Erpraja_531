// Superclass KarakterGame
class KarakterGame {
    private String nama;
    private int kesehatan;

    public KarakterGame(String nama, int kesehatan) {
        this.nama = nama;
        this.kesehatan = kesehatan;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getKesehatan() {
        return kesehatan;
    }

    public void setKesehatan(int kesehatan) {
        this.kesehatan = kesehatan;
    }

    public void serang(KarakterGame target) {
        // Akan di-override oleh subclass
    }
}

// Subclass Pahlawan
class Pahlawan extends KarakterGame {
    public Pahlawan(String nama, int kesehatan) {
        super(nama, kesehatan);
    }

    @Override
    public void serang(KarakterGame target) {
        System.out.println(getNama() + " menyerang " + target.getNama() + " menggunakan pedang!");
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
        System.out.println(getNama() + " menyerang " + target.getNama() + " menggunakan sihir!");
        target.setKesehatan(target.getKesehatan() - 15);
        System.out.println("Kesehatan " + target.getNama() + " sekarang: " + target.getKesehatan());
    }
}

// Kelas Utama
public class Main {
    public static void main(String[] args) {
        KarakterGame umum = new KarakterGame("Karakter Umum", 100);
        Pahlawan bayu = new Pahlawan("Bayu", 300);
        Musuh raehan = new Musuh("Raehan", 250);

        // Menampilkan status awal
        System.out.println("Kesehatan Awal:");
        System.out.println(bayu.getNama() + ": " + bayu.getKesehatan());
        System.out.println(raehan.getNama() + ": " + raehan.getKesehatan());
        System.out.println();

        // Simulasi pertarungan
        bayu.serang(raehan);
        raehan.serang(bayu);
    }
}
