import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a, b, c, sonuc;

        Scanner input = new Scanner(System.in);
        System.out.print("ilk sayıyı giriniz: ");
        a = input.nextInt();

        System.out.print("ikinci sayıyı giriniz: ");
        b = input.nextInt();

        System.out.print("üçüncü sayıyı giriniz: ");
        c = input.nextInt();

        sonuc = a+b*c-b;
        System.out.println(sonuc);

    }
}