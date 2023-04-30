import java.util.Scanner;

public class WhileDeneme {

    public static void main(String[] args) {

        int sifre;
        boolean isPasswordTrue = true;

        Scanner input = new Scanner(System.in);


        while(isPasswordTrue){
            System.out.println("Şifre giriniz:");
            sifre = input.nextInt();
            if (sifre == 12345 ){
                System.out.println("Giriş yaptınız.");
                isPasswordTrue = true;
                break;

            }else{
                System.out.println("Şifre yanlış. Tekrar deneyiniz.");
            }
        }

        //Deneme
        int i=1, j=1;
        while(i<3)
        {
            do
            {
                System.out.print(j + ",");
                j++;
            }while(j<4);
            i++;
        }
    }
}
