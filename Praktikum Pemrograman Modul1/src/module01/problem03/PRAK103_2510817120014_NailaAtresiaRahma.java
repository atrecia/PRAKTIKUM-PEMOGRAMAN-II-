package module01.problem03;

import java.util.Scanner;

public class PRAK103_2510817120014_NailaAtresiaRahma {
    public static void main(String[] args) {
        int i = 1, totalBaris, input;
        Scanner keyboard = new Scanner(System.in);

        totalBaris = keyboard.nextInt();
        input = keyboard.nextInt();

        do {
            if (input % 2 != 0) {
                if (i == totalBaris) {
                    System.out.print(input);
                } else {
                    System.out.print(input + ", ");
                }
                i++;
            }
            input++;
        } while (i <= totalBaris);

        keyboard.close();
    }
}