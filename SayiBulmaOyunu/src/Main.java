import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        sayiBulmaOyunu();

    }
    public static void sayiBulmaOyunu() throws InterruptedException {
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Sayı bulma oyunununa hoşgeldiniz.");
        Thread.sleep(1000);
        System.out.println("3 deneme hakkınız vardır.");
        Thread.sleep(1000);
        System.out.println("Kaç el oynamak istersiniz ?");
        int oyunTurSayisi = input.nextInt();
        Thread.sleep(1000);


        while(oyunTurSayisi>0){
            System.out.println("Kalan tur sayısı =  " + oyunTurSayisi);

            if(oyunTurSayisi==0){
                System.out.println("Son tur.");
                break;
            }

            if(oyunTurSayisi<0){
                System.out.println("Lütfen artı değer giriniz.");
                input.nextInt();
            }

            System.out.println("Lütfen 1-100 Arasında bir sayı giriniz.");
            int randomNum = random.nextInt(101);
            int userInput = input.nextInt();
            int life = 2;

            while (userInput != randomNum) {
                if (userInput < 0 || userInput > 100) {

                    System.out.println("1-100 Arasında bir değer giriniz.");
                    userInput = input.nextInt();

                } else if (userInput < randomNum) {
                    System.out.println("Yukarı");
                    userInput = input.nextInt();
                    life -= 1;
                } else {
                    System.out.println("Aşşağı");
                    userInput = input.nextInt();
                    life -= 1;
                }
                if (life == 0) {
                    System.out.println("Malesef deneme hakkınız kalmadı. Doğru sayı = " + randomNum);
                    oyunTurSayisi-= 1;
                    break;
                }
                if (userInput == randomNum) {
                    System.out.println("Tebrikler doğru cevabı buldunuz!");
                    oyunTurSayisi-= 1;
                }
            }
        }
    }
}
