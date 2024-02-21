import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    int a , b, c,sonuc;         // işlemdeki a,b,c, sonuc değerlerini tanımla

    Scanner input = new Scanner(System.in);
        System.out.print("a+b*c-b işlemi için a sayısını girin : ");    // a sayısın sor ve kaydet
        a = input.nextInt();

       System.out.print("(a+b*c-b işlemi için b sayısını girin: ");        //b sayısını sor ve kaydet
       b = input.nextInt();

        System.out.print("a+b*c-b işlemi için c sayısını girin: ");         // c sor ve tanımla
        c = input.nextInt();

       sonuc=a+b*c-b;           //alınan değerlerle işlemi yaptır ve yazıdır
        System.out.println("İşlemin Sonucu : " + sonuc);
    }
}       // Ali Eren KÖSE 21/02/2024 14:08