import java.util.Scanner;

public class fungsinilaimahasiswa251125 {

    static int [][]nilai (Scanner sc, String []Nama){
        int [][] data = new int[5][3];

        for(int i=0; i<5; i++){
            System.out.print("Masukan Nama Mahasiswa ke-"+(i+1)+" : ");
            Nama[i] = sc.nextLine();

            for(int j =0; j<3; j++){
                System.out.print("MAsukan nilai Mata kuliah ke-"+(j+1)+" : ");
                data[i][j] = sc.nextInt();
            }
            sc.nextLine();
            System.out.println("");
        }
        return data;
    }
    static void status(int data[][], String Nama[]){
        double ratarata; 
        
        for(int i=0; i<5;i++){
            int total=0;

            for(int j=0; j<3; j++){
                total+= data[i][j];
            }
            ratarata = total/3;

            System.out.println("Nama\t\t: "+Nama[i]);
            System.out.println("Rata-rata\t: "+ratarata);

            if(ratarata>=60){
                System.out.println("Status\t\t: LULUS");
            }else{
                System.out.println("Status\t\t: TIDAK LULUS");
            }
            System.out.println("");
        }
    }
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    String[] Nama = new String[5];      // Array nama mahasiswa

    int[][] data = nilai(sc, Nama);     // Panggil fungsi nilai

    sc.nextLine(); // FIX bug newline dari nextInt()

    status(data, Nama);                 // Panggil status dengan array Nama

    sc.close();
}
}