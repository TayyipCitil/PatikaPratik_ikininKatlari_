import java.util.Scanner;

public class IkininKatlari {
    public static void main(String[] args) {
        //girdiğimiz sayıdan küçük ikinin katlarını bulan program
        Scanner input = new Scanner(System.in);
        System.out.print("sayı gir: ");
        int sayi = input.nextInt();
        /*for (int i=0;Math.pow(2,i)<sayi;i++){
            System.out.println(Math.pow(2,i));
        }*/

        //Math.pow kulllanmadan yapılışı
        int i = 1;
        while (i <= sayi) {
            System.out.println(i);
            i *= 2;
        }
        /*Alternatif
        for (i=1;i<=sayi;i*=2){
            System.out.println(i);
        }*/
    }
}
