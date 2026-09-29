package module01.problem04;

import java.util.Scanner;

public class PRAK104_2510817120014_NailaAtresiaRahma {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Tangan Abu: ");
        String abu1 = keyboard.next();
        String abu2 = keyboard.next();
        String abu3 = keyboard.next();

        System.out.print("Tangan Bagas: ");
        String bagas1 = keyboard.next();
        String bagas2 = keyboard.next();
        String bagas3 = keyboard.next();

        int abuScore = 0;
        int bagasScore = 0;

        if (abu1.equals(bagas1)) {

        } else if ((abu1.equals("B") && bagas1.equals("G")) ||
                (abu1.equals("G") && bagas1.equals("K")) ||
                (abu1.equals("K") && bagas1.equals("B"))) {
            abuScore++;
        } else {
            bagasScore++;
        }

        if (abu2.equals(bagas2)) {

        } else if ((abu2.equals("B") && bagas2.equals("G")) ||
                (abu2.equals("G") && bagas2.equals("K")) ||
                (abu2.equals("K") && bagas2.equals("B"))) {
            abuScore++;
        } else {
            bagasScore++;
        }

        if (abu3.equals(bagas3)) {

        } else if ((abu3.equals("B") && bagas3.equals("G")) ||
                (abu3.equals("G") && bagas3.equals("K")) ||
                (abu3.equals("K") && bagas3.equals("B"))) {
            abuScore++;
        } else {
            bagasScore++;
        }

        if (abuScore > bagasScore) {
            System.out.println("Abu");
        } else if (bagasScore > abuScore) {
            System.out.println("Bagas");
        } else {
            System.out.println("Seri");
        }

        keyboard.close();
    }
}
