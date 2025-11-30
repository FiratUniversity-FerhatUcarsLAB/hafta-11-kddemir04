import java.util.Scanner;

public class Exercise4_1 {

    static void main() {
        Scanner  sc = new Scanner(System.in);
        System.out.println("Day: ");
        String gun = sc.nextLine();

        System.out.println("Date: ");
        int tarih = sc.nextInt();

        sc.nextLine();

        System.out.println("Month: ");
        String ay = sc.nextLine();

        System.out.println("Year: ");
        int yil = sc.nextInt();

        printAmerican(gun, tarih,ay,yil);
        printEuropean(tarih, ay, yil, gun);

        sc.close();


    }

    public static void printAmerican(String day, int date,
                                     String month, int year) {
        System.out.println(day + ", " + month + " " + date + ", " + year);


    }

    public static void printEuropean(int date, String month,
                                     int year, String day) {
        System.out.println(date + " " + month + " " + year + ", " + day);



    }
}




