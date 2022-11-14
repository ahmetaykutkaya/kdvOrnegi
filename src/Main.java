import java.util.Scanner;

public class Main {
    public static void main(String[] args) {




        Scanner veri = new Scanner(System.in);
        double a , Kdv_tutar = 0.18;

        System.out.print("Lutfen para degerini giriniz :");

        a = veri.nextDouble();

        double kdv = a * Kdv_tutar;
        double kdvli = kdv + a;

        System.out.println("Kdv siz Fiyat : " + a);
        System.out.println("Kdv tutari : " + kdv);
        System.out.println("Kdv li fiyat : "+ kdvli);





    }


}