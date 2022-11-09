import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //valuables
        String UserName="Abs53",Password="1234Asdw",EnteredUserName,EnteredPassword;
        int right=3;
        Scanner scanner=new Scanner(System.in);

        //main code
        System.out.println("Hosgeldiniz!!");
        while(right>0)
        {
            System.out.println("Lutfen kullanici adini giriniz.");
            EnteredUserName =scanner.nextLine();
            if (EnteredUserName.equals(UserName))
            {
                //if entered username is correct
                System.out.println("Merhaba "+EnteredUserName+" Giris yapmak icin lutfen sifreni gir.");
                EnteredPassword =scanner.nextLine();
                if (EnteredPassword.equals(Password))
                {
                    //if entered password is correct user login
                    System.out.println("sifre dogru. Giris yapildi");
                    break;
                }
                else
                {
                    //if entered password is wrong user can try again
                    right--;
                    System.out.println("Sifre yanlis girildi. Kalan hakkınız :"+ right);
                    continue;
                }
            }
            else
            {
                //if entered username is wrong user can try again
                right--;
                System.out.println("Kullanıcı adı yanlış girildi. Kalan hakkınız :"+ right);
                continue;
            }
        }

        if (right==0) //if user's right waste.
            System.out.println("deneme hakkınız bitmişdir. oturumunuz sonladirildi.");

        System.out.println("gorusmek uzere...");
        System.exit(0);
    }
}