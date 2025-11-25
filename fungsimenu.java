import java.util.Scanner;
import java.util.jar.Attributes.Name;

public class fungsimenu {

    static int [][]Menu(Scanner sc, String[] Name){
        int [][] arrayy = new int[6][8];
        
        for(int i=1; i<6; i++){
            System.out.print("Masukan Nama Menu : ");
            Name[i] = sc.nextLine();

            for(int j=1; j<8; j++){
                System.out.print("Masukan Jumlah Penjualan hari ke-"+j+" : " );
                arrayy[i][j] = sc.nextInt();
            }
            sc.nextLine();
            System.out.println("");
        }
        return arrayy;
    }

    static void penjutinggi(int [][] data, String []Name){
        int tot =-1;
        int meterting =-1;

        for(int i =1; i<6; i++){
            int total =0;
            for(int j =1; j<8; j++){
                total+=data[i][j];
            }
            if(total>tot){
                tot = total;
                meterting =i;
            }
        }
        System.out.println("menu tertinggi adalah "+Name[meterting]+" dengan penjualan sebanyak : "+tot);
    }

    static void rata(int [][] data, String []Name){
        double ratarata =0;

        for(int i=1; i<6; i++){
            double total =0;
            for(int j =1; j<8; j++){
                total += data[i][j];
            }
            ratarata = total/7;
            System.out.println("Rata-rata penjualan menu "+Name[i]+" adalah %.2f"+ratarata);
        }
        System.out.println("");
    }
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       String Name[] = new String[6];
       int [][] data = Menu(sc, Name);

        System.out.println("=== DATA PENJUALAN ===");
        for(int i = 1; i < 6; i++){
            System.out.println("Menu "+Name[i]);
            for(int j = 1; j < 8; j++){
                System.out.println("Hari ke-"+j+" : "+ data[i][j]);
                
            }
            System.out.println();
        }
        penjutinggi(data, Name);
        System.out.println("");

        rata(data, Name);
        System.out.println("");
    }
}