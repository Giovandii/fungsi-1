public class PengunjungKafe {

    static void daftarPengunjung(String... namaPengunjung) {
        System.out.println("=== Daftar Pengunjung Cafe ===");
        for (String nama : namaPengunjung) {
            System.out.println("- " + nama);
        }
    }
    public static void main(String[] args) {
        daftarPengunjung ();
        daftarPengunjung("Andi");
        daftarPengunjung("Doni", "Eti", "Galih", "Fahmi");
    }
}