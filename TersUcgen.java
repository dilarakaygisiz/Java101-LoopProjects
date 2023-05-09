import java.util.Scanner;

public class TersUcgen {

    public static void main(String[] args) {

        int basamakSayisi;
        Scanner scan = new Scanner(System.in);
        System.out.print("Basamak sayısını giriniz: ");
        basamakSayisi = scan.nextInt();

        for (int i = 0; i<basamakSayisi; i++){
            for (int j = 0; j<=i; j++){
                System.out.print(" ");
            }
            for (int k = (2*basamakSayisi) - 1; k>=(2*i)+1; k--){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
