package module01.problem02;
import java.util.Scanner;

public class PRAK102_2510817120014_NailaAtresiaRahma {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        int input = keyboard.nextInt();
        int i = 0;

        while (i < 11) {
            if (input % 5 == 0) {
                System.out.print(input / 5 - 1);
            } else {
                System.out.print(input);
            }

            if (i < 10) {
                System.out.print(",");
            }

            input++;
            i++;
        }
        keyboard.close();
    }
}
