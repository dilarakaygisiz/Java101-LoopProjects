import java.util.Scanner;

public class TekSayi {

    public static void main(String[] args) {

        /*PRATİK
        int n;
        int sum = 0;

        Scanner input = new Scanner(System.in);
        System.out.print("Sayı giriniz: ");
        n = input.nextInt();

        do {
            System.out.print("Sayı giriniz: ");
            n = input.nextInt();
            if (n % 2 == 1){
                sum += n;
            }
        } while (n>0);
        System.out.println("Toplam: " + sum);
        */


        //ÖDEV
        Scanner input = new Scanner(System.in);
        int a;
        int sum=0;

        System.out.print("Sayı giriniz: ");
        a = input.nextInt();
        do {
            System.out.println("Sayı giriniz: ");
            a = input.nextInt();
            if (a%2 == 0 && a%4 == 0){
                sum += a;
            }
        }while(a%2 == 0);
        System.out.println("Toplam: " + sum);
        }
            }



