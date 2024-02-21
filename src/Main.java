import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    int a , b, c,sonuc;

    Scanner input = new Scanner(System.in);
        System.out.print("(a+b)*(c-b) işlemi için a sayısını girin : ");
        a = input.nextInt();

       System.out.print("(a+b)*(c-b) işlemi için b sayısını girin: ");
       b = input.nextInt();

        System.out.print("(a+b)*(c-b) işlemi için c sayısını girin: ");
        c = input.nextInt();

       sonuc=(a+b)*(c-b);
        System.out.println("İşlemin Sonucu : " + sonuc);
    }
}       // Ali Eren KÖSE 21/02/2024 14:08