import java.util.Scanner;

public class NilaiMahasiswa14 {

    static int[] nilai(Scanner sc, int n){
        int[] Nilai = new int[n];

        for(int i = 0; i < n; i++){
            System.out.print("Masukan nilai mahasiswa ke-" + (i + 1) + " : ");
            Nilai[i] = sc.nextInt();
        }
        return Nilai;
    }

     static void nilMaha(int[] Nilai){
       
        for(int i = 0; i < Nilai.length; i++){
            System.out.println("Nilai mahasiswa ke-" + (i + 1) + ": " + Nilai[i]);
        }
    }

    static int hitTot (int [] Nilai){
        int total =0; 

       for(int i = 0; i < Nilai.length; i++){
        total += Nilai[i];
        } 
        return total;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukan banyaknya mahasiswa: ");
        int n = sc.nextInt();

        int[] Nilai = nilai(sc, n);

        nilMaha(Nilai);

        int total = hitTot(Nilai);

        System.out.println("Total Nilai Mahasiswa adalah "+total);
        sc.close();
    }
}
