import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {

        int elemanSayisi;
        int num1 = 0, num2 = 1;
        int total = 0;
        int i = 1;

        Scanner scan = new Scanner(System.in);
        System.out.print("Fibonacci serisi eleman sayısı:");
        elemanSayisi = scan.nextInt();

        for (i = 1; i<=elemanSayisi; i++){
            System.out.print(num1 + "  ");
            total = num1 + num2;
            num1 = num2;
            num2 = total;


        }


       }
    }
