import java.util.Scanner;

public class EbobEkok {

    public static void main(String[] args) {

        int num1, num2;
        int ebob = 1;
        int ekok;


        Scanner input = new Scanner(System.in);
        System.out.print("İlk sayıyı giriniz: ");
        num1 = input.nextInt();
        System.out.print("İkinci sayıyı giriniz: ");
        num2 = input.nextInt();

        if (num1 < num2) {
            for (int i = 1; i < num1; i++) {
                if ((num1 % i == 0) && (num2 % i == 0)) {
                    ebob = i;
                }
            }

        } else if (num2 < num1) {
            for (int i = 1; i < num2; i++) {
                if ((num1 % i == 0) && (num2 % i == 0)) {
                    ebob = i;
                }
            }
        }
        System.out.println("Girilen iki sayının ebobu: " + ebob);

        ekok = (num1 * num2) / ebob;

        System.out.println("Girilen iki sayının ekoku: " + ekok);

        System.out.println("---------------------------");
        System.out.println("---------WHILE-------------");
        while (num1 < num2) {
            for (int i = 1; i < num1; i++) {
                if ((num1 % i == 0) && (num2 % i == 0)) {
                    ebob = i;
                }
            }
            System.out.println("Girilen iki sayının ebobu: " + ebob);
            break;
        }
        while (num2 < num1) {
            for (int i = 1; i < num2; i++) {
                if ((num1 % i == 0) && (num2 % i == 0)) {
                    ebob = i;
                }

            }
            System.out.println("Girilen iki sayının ebobu: " + ebob);
            break;
        }
        ekok = (num1 * num2) / ebob;

        System.out.println("Girilen iki sayının ekoku: " + ekok);

    }
}






