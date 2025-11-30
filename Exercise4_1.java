import java.util.Scanner;

public class Exercise4_1 {

    static void main() {
        Scanner  sc = new Scanner(System.in);
        System.out.println("Day: ");
        String day = sc.nextLine();

        System.out.println("Date: ");
        int date = sc.nextInt();

        sc.nextLine();

        System.out.println("Month: ");
        String month = sc.nextLine();

        System.out.println("Year: ");
        int year = sc.nextInt();

        printAmerican(day, date,month,year);
        printEuropean(date, month, year, day);

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




