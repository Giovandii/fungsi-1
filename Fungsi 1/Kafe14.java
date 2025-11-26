import java.util.Scanner;

public class Kafe14 {

    public static void Menu(String namaPelanggan, boolean isMember){
        System.out.println("Selamat Datang, "+namaPelanggan+"!");

        if(isMember){
            System.out.println("Anda adalah member, dapatkan diskon 10% dalam setiap perbelanjaan");
        }
       
        System.out.println("=====Menu Resto Kafe=====");
        System.out.println("1. Kopi Hitam - Rp 15.000");
        System.out.println("2. Cappuccino - Rp 20.000");
        System.out.println("3. Latte - Rp 22.000");
        System.out.println("4. Teh Tarik - Rp 12.000");
        System.out.println("5. Roti Bakar - Rp 10.000");
        System.out.println("6. Mie Goreng - Rp 18.000");
        System.out.println("==============================");
    }

    public static int hitungTotalHargaa14(int[] pilihanMenu, int[] banyakItem, String kodePromo){
        int[] hargaitems = {15000, 20000, 22000, 12000, 10000, 18000};
        
        int hargaTotal = 0;
        double diskon = 0;

        for (int i = 0; i < pilihanMenu.length; i++) {
            int menuIndex = pilihanMenu[i] - 1;

            // Validasi anti error
            if (menuIndex < 0 || menuIndex >= hargaitems.length) {
                System.out.println("Menu ke-" + pilihanMenu[i] + " tidak valid! → tidak dihitung.");
                continue;  
            }

            hargaTotal += hargaitems[menuIndex] * banyakItem[i];
        }
        
        if (kodePromo.equals("DISKON50")) {
            diskon = 0.5;
        } 
        else if (kodePromo.equals("DISKON30")) {
            diskon = 0.3;
        }
        int Hargadiskon =(int)(hargaTotal - (hargaTotal * diskon));

        return Hargadiskon;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Menu("Budi", true);

        System.out.print("\nBerapa menu berbeda yang ingin dipesan? : ");
        int jumlahPesanan = sc.nextInt();

        int[] pilihanMenu = new int[jumlahPesanan];
        int[] banyakItem = new int[jumlahPesanan];

        for(int i = 0; i < jumlahPesanan; i++){
            // Validasi input menu
            int inputMenu;
            do {
                System.out.print("Pilih menu ke-" + (i+1) + " (1-6) : ");
                inputMenu = sc.nextInt();

                if (inputMenu < 1 || inputMenu > 6) {
                    System.out.println("⚠ Menu tidak ada, silakan pilih 1–6!");
                }
            } while (inputMenu < 1 || inputMenu > 6);

            pilihanMenu[i] = inputMenu;

            System.out.print("Jumlah pesanan menu ke-" + (i+1) + " : ");
            banyakItem[i] = sc.nextInt();
        }

        int Hargadiskon = hitungTotalHargaa14(pilihanMenu, banyakItem, "DISKON30");

        System.out.println("\nTotal Harga untuk pesanan anda : Rp " + Hargadiskon);

        sc.close();
    }
}
