import java.util.Scanner;

public class Atm {

    public static void main(String[] args) {

        String userName, password;
        int counter = 3;
        int balance = 1500;
        int choice;
        Scanner input = new Scanner(System.in);


        while(counter>0){
            System.out.print("Kullanıcı adınızı giriniz: ");
            userName = input.nextLine();
            System.out.print("Şifrenizi giriniz: ");
            password = input.nextLine();
            if (userName.equals("dilarakaygisiz") && (password.equals("1234"))){
                System.out.println("Sisteme başarılı bir şekilde giriş yaptınız.");
                System.out.println("DK Bankasına Hoşgeldiniz!");
                do {
                    System.out.println("İşlemler:\n1- Para Yatırma\n2- Para Çekme\n3- Bakiye Sorgulama\n4- Çıkış Yap");
                    System.out.print("Lütfen yapmak istediğiniz işlemi seçiniz: ");
                    choice = input.nextInt();
                    if (choice == 1){
                        System.out.println("Yatırılıcak para miktarı :");
                        int price = input.nextInt();
                        balance += price;
                    }else if (choice == 2){
                        System.out.println("Çekilecek para miktarı :");
                        int price = input.nextInt();
                        if (price>balance) {
                            System.out.println("Yetersiz bakiye!");
                        }else{
                        balance -= price;
                        }
                    }else if (choice == 3){
                        System.out.println("Kalan bakiyeniz: " + balance);
                    }else{

                    }
                }while (choice != 4);
                System.out.println("Tekrar görüşmek üzere!");
                break;
            }
            else{
                System.out.println("Hatalı giriş yaptınız! Tekrar deneyin.");
                counter--;
                System.out.println("Tekrar giriş yapabilmek için kalan hakkınız: " + counter);
                if (counter == 0){
                    System.out.println("Hesabınız bloke olmuştur. İlgili bankayla görüşüp hesabınızı tekarar aktif hale getirebilirsiniz.");
                }
            }
        }

    }
}
