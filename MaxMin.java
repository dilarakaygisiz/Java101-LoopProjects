import java.util.Scanner;

public class MaxMin {

    public static void main(String[] args) {

        int num1, num2, num3, num4;
        Scanner input = new Scanner(System.in);
        System.out.println("4 tane sayı giriniz: ");
        System.out.print("Birinci sayı: ");
        num1 = input.nextInt();
        System.out.print("İkinci sayı: ");
        num2 = input.nextInt();
        System.out.print("Üçüncü sayı: ");
        num3 = input.nextInt();
        System.out.print("Dördüncü sayı: ");
        num4 = input.nextInt();

        if ((num1 < num2) && (num1 < num3) && (num1 < num4)) {
            System.out.println("En küçük sayı: " + num1);
        } else if ((num2 < num1) && (num2 < num3) && (num2 < num4)) {
            System.out.println("En küçük sayı: " + num2);
        } else if ((num3 < num1) && (num3 < num2) && (num3 < num4)) {
            System.out.println("En küçük sayı: " + num3);
        } else if ((num4 < num1) && (num4 < num2) && (num4 < num3)) {
            System.out.println("En küçük sayı: " + num4);
        }
        if ((num1 > num2) && (num1 > num3) && (num1 > num4)) {
            System.out.println("En büyük sayı: " + num1);
        } else if ((num2 > num1) && (num2 > num3) && (num2 > num4)) {
            System.out.println("En büyük sayı: " + num2);
        } else if ((num3 > num1) && (num3 > num2) && (num3 > num4)) {
            System.out.println("En büyük sayı: " + num3);
        } else if ((num4 > num1) && (num4 > num2) && (num4 > num3)) {
            System.out.println("En büyük sayı: " + num4);
        }

    }}

