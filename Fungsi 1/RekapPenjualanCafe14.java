import java.util.Scanner;

public class RekapPenjualanCafe14 {

    static int [][]Menu(Scanner sc, String[] Name, int n, int h){
        int [][] arrayy = new int[n][h];
        
        for(int i=0; i<n; i++){
            System.out.print("Masukan Nama Menu : ");
            Name[i] = sc.nextLine();
           sc.nextLine();

            for(int j=0; j<h; j++){
                System.out.print("Masukan Jumlah Penjualan hari ke-"+(j+1)+" : " );
                arrayy[i][j] = sc.nextInt();
            }
            System.out.println("");
        }
        return arrayy;
    }

    static void penjutinggi(int [][] data, String []Name, int n, int h){
        int tot =-1;
        int meterting =-1;

        for(int i =0; i<n; i++){
            int total =0;
            for(int j =0; j<h; j++){
                total+=data[i][j];
            }
            if(total>tot){
                tot = total;
                meterting =i;
            }
        }
        System.out.println("menu tertinggi adalah "+Name[meterting]+" dengan penjualan sebanyak : "+tot);
    }

    static void rata(int [][] data, String []Name, int n, int h){
        double ratarata =0;

        for(int i=0; i<n; i++){
            double total =0;
            for(int j =0; j<h; j++){
                total += data[i][j];
            }
            ratarata =(int) total/h;
            System.out.println("Rata-rata penjualan menu "+Name[i]+" adalah "+ratarata);
        }
        System.out.println("");
    }
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukan banyak hari : ");
        int n = sc.nextInt();
        System.out.print("Masukan banyak menu : ");
        int h = sc.nextInt();

       String Name[] = new String[n];
       int [][] data = Menu(sc, Name, n, h);

        System.out.println("=== DATA PENJUALAN ===");
        for(int i = 0; i < n; i++){
            System.out.println("Menu "+Name[i]);
            for(int j = 0; j < h; j++){
                System.out.println("Hari ke-"+j+" : "+ data[i][j]);
                
            }
            System.out.println();
        }
        penjutinggi(data, Name, n,h);
        System.out.println("");

        rata(data, Name,n,h);
        System.out.println("");
    }
}
