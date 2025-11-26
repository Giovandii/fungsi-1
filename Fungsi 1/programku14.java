public class programku14 {

    public static void Tampilhinggakei(int i){
        for(int j=0; j<i;j++){
            System.out.print(j);
        }
    }
    public static int Jumlah(int bil1, int bil2){
        return (bil1+bil2);
    }
    public static void Tampiljumlah (int bil1, int bil2){
        Tampilhinggakei(Jumlah(bil1, bil2));
    }
    public static void main(String[]args){
        int temp = Jumlah(1,1);
        Tampiljumlah(temp, 5 );
    }
}