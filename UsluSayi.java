import java.util.Scanner;

public class UsluSayi {

    public static void main(String[] args) {

        int a,b;
        int result=1;

        Scanner input = new Scanner(System.in);
        System.out.print("Üstü alınacak sayı: ");
        a = input.nextInt();
        System.out.print("Üs olacak sayı: ");
        b = input.nextInt();

        for (int i=1; i<=b; i++){
           result *= a;
            System.out.println(result);
        }
        System.out.println("Cevap: " + result);



    }
}
