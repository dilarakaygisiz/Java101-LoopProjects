import java.util.Scanner;

public class IkininKuvvetleri {

    public static void main(String[] args) {

        int n;

        Scanner input = new Scanner(System.in);
        System.out.print("Sayı giriniz: ");
        n = input.nextInt();

        //PRATİK : Java döngüler ile girilen sayıya kadar olan 2'nin kuvvetlerini ekrana yazdıran programı yazıyoruz.
        /*
        for (int i = 1; i<n; i = i*2){
            System.out.println(i);

            }
        }*/

        //ÖDEV : Java döngüler ile girilen sayıya kadar olan 4 ve 5'in kuvvetlerini ekrana yazdıran programı yazıyoruz.
        for (int i =1; i<=n; i*=20){
            System.out.println(i);
        }
    }
    }

