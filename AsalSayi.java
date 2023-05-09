import java.util.Scanner;

public class AsalSayi {

    public static void main(String[] args) {


        for(int i=2; i<=100; i++){
            int counterBolen = 0;
            for (int m=1;m<=i; m++ ){
                if( i%m==0){
                    counterBolen++;
                }
            }
            if(counterBolen<=2){
                System.out.println(i);
            }

        }




    }



}

