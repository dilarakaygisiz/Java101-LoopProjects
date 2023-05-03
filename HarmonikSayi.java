import java.util.Scanner;

public class HarmonikSayi {

    public static void main(String[] args) {


        int n;
        double total = 0;
        int i;
        int donguSayisi =1;

        Scanner input = new Scanner(System.in);
        System.out.print("Sayı giriniz: ");
        n = input.nextInt();

        for (i = 1; i <= n; i++){
            total += (1.0/i);
            System.out.println(donguSayisi + ". döngüdeki toplam değer: " + total);
            donguSayisi++;
        }
        System.out.println();
        System.out.println("Toplam: " + total);
    }
}
