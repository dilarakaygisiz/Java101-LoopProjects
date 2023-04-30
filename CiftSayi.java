import java.util.Scanner;

public class CiftSayi {

    public static void main(String[] args) {

        //PRATİK
        Scanner input = new Scanner(System.in);
        System.out.println("Bir sayı giriniz: ");
        int a = input.nextInt();

        for (int i = 0; i<a; i++){
            if (i%2 == 0){
                System.out.println(i);
            }

        }
        //ÖDEV
        double sum = 0;
        double ave;
        int n = 0;
        System.out.println("Bir sayı giriniz: ");
        int b = input.nextInt();

        for (int j = 0; j<b; j++){
            if (j%3 == 0 && j%4 == 0){
                System.out.println(j);
                n ++;
                System.out.println("3'e ve 4'e bölünen sayıların adedi: " + n);
                sum += j;
                System.out.println("3'e ve 4'e bölünen sayıların toplamı: " + sum);
                ave = sum/n;
                System.out.println("3'e ve 4'e bölünen sayıların ortalaması: " + ave);


            }
        }

    }
}
