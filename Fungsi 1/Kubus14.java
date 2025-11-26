import java.util.Scanner;

public class Kubus14 {

    public static int luasPermukaan(int sisi){
        int Luas = sisi * sisi;
        return Luas;
    }

    public static int volume(int sisi){
        int Volume = luasPermukaan(sisi) * sisi;
        return Volume;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("Masukan panjang sisi : ");
        int sisi = sc.nextInt();

        int Luas = luasPermukaan(sisi);
        System.out.println("Luas Kubus adalah "+Luas);

        int Volume = volume(sisi);
        System.out.println("Volume dari kubus tersebut adalah "+Volume);

        sc.close();
    }
}
