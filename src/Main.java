import java.util.Scanner;

public class Main {

    // Verilen sorunun cozumu adina metot yardimiyla mantiksal islemler yapildi.
    static void recursive(int n){
        if (n > 0){
            System.out.print(n + " ");
            recursive(n - 5);
        }
        System.out.print(n + " ");
    }
    public static void main(String[] args) {

        // Kullanicidan deger alabilmek adina scanner class ini cagirdik.
        Scanner input = new Scanner(System.in);

        // Kullanicidan gelen degeri ilgili degiskene atadik.
        System.out.print("Lutfen bir deger gir: ");
        int n = input.nextInt();

        // Metot u cagirdik.
        System.out.print("Cikti : ");
        recursive(n);

    }
}