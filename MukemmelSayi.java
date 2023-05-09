import java.util.Scanner;

public class MukemmelSayi {

    public static void main(String[] args) {

        int num;
        int total = 0;
        Scanner scan = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        num = scan.nextInt();

        for (int i = 1; i <num; i++){
            if (num % i == 0){
                total += i;
            }
            }
        if (total == num){
            System.out.println(num + " Mükemmel sayıdır.");
        }else if (total != num){
            System.out.println(num + " Mükemmel sayı değildir");
        }

    }
}
