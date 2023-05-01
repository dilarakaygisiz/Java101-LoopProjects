import java.util.Scanner;

public class FaktoriyelKombinasyon {

    public static void main(String[] args) {

        //PRATİK
        /*int n, faktoriyel =1;
        Scanner input = new Scanner(System.in);
        System.out.println("Faktöriyelini bulmak istediğiniz sayıyı giriniz:");
        n = input.nextInt();

        for (int i = 1; i<n; i++){
            faktoriyel += faktoriyel*i;

        }
        System.out.println(faktoriyel);*/


        //ÖDEV
        //Kombinasyon Formülü : C(n,r) = n! / (r! * (n-r)!)

        int n, r;
        int faktoriyelN=1;
        int faktoriyelR=1;
        int faktoriyelFark=1;
        Scanner input = new Scanner(System.in);
        System.out.print("Küme eleman sayısı: ");
        n = input.nextInt();
        System.out.print("Oluşturmak istediğiniz listenin eleman sayısı: ");
        r = input.nextInt();

        for (int i = 1; i<n; i++){
            faktoriyelN += faktoriyelN*i;

        }
        for (int j = 1; j<r; j++){
            faktoriyelR += faktoriyelR*j;
        }
        for (int k =1; k<(n-r); k++){
            faktoriyelFark += faktoriyelFark*k;
        }
        System.out.println(faktoriyelN);
        System.out.println(faktoriyelR);
        System.out.println(faktoriyelFark);
        System.out.println(faktoriyelN/(faktoriyelR*faktoriyelFark));
    }
}
