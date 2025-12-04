/*Ad: Abdulkadir
Soyad: Demir
No: 240541007
Tarih: 4.12.2025
*/
import java.util.Scanner;

public class Exercise4_6_Multadd {

    static void multadd(){//sin(π/4) + cos(π/4)/2
        // log10 +log20

        int a = 5, b = 3, c = 7;
        System.out.println("Sonuç: " + (a * b + c));

        double sonuc1 = Math.log10(10) + Math.log10(20);

        double sonuc2 = Math.sin(Math.PI / 4) + Math.cos(Math.PI / 4) / 2;


        System.out.println("Sonuc 1 = " + sonuc1);

        System.out.println("Sonuc 2 = " + sonuc2);






    }

    static double expSum(double x){
        double exp = Math.exp(-x); //e^-x hesaplıyorum

        double part1 = x * exp;

        double part2 = Math.sqrt(1 - exp);

        return part1 + part2;



    }

    static void main() {
        multadd();


        Scanner input = new Scanner(System.in);
        System.out.println("Bir sayı giriniz");
        double n = input.nextDouble();
        double sonuc = expSum(n);
        System.out.println("Sonuc = " + sonuc);

        input.close();

    }



}

