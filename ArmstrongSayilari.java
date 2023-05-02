import java.util.Scanner;

public class ArmstrongSayilari {

    public static void main(String[] args) {

    /*
       int a = 2451;
       int basamakSayisi = 0;
       int numberCount = 0;
       int temp;
       int basDegeri=1;

        //2451 / 10 = 245
        //245 / 10 = 24
        //24 / 10 = 2
        //2 / 10 = 0
        //0 / 10 = 0

        System.out.println(a);
        while (a != 0){
            a /= 10;
            System.out.println(a);
            numberCount ++;


        }
        System.out.println("Sayımız: " + numberCount + " basamaktan oluşur.");
        System.out.println(basDegeri);

     */
        int basamakSayisi = 0;
        int basamakDegeri;
        int result = 0 ;
        int basPow ; //üs alma


        Scanner input = new Scanner(System.in);
        System.out.print("Sayı giriniz: ");
        int n = input.nextInt();
        int temp = n;
        System.out.println("Sayınız: " + n);

        while(temp != 0){
            temp = temp/10;
            System.out.println("Sonraki sayı: " + temp);
            basamakSayisi++;

        }
        System.out.println("Girdiğiniz sayının basamak sayısı: " + basamakSayisi);

        temp = n;
        while (temp != 0){
                basamakDegeri = temp%10;
                basPow = 1;
                for (int i = 1; i<=basamakSayisi; i++){
                    basPow *= basamakDegeri;
                }
                result += basPow;
                System.out.println("Basamak değeri: " + basamakDegeri);
                temp /= 10;
                }
        System.out.println(result);
            }

        }


