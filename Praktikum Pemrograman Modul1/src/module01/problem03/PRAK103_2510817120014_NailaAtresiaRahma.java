package module01.problem03;

import java.util.Scanner;

public class PRAK103_2510817120014_NailaAtresiaRahma {
    public static void main(String[] args) {
        int i = 1, totalRows, input;
        Scanner keyboard = new Scanner(System.in);

        totalRows = keyboard.nextInt();
        input = keyboard.nextInt();

        do {
            if (input % 2 != 0) {
                if (i == totalRows) {
                    System.out.print(input);
                } else {
                    System.out.print(input + ", ");
                }
                i++;
            }
            input++;
        } while (i <= totalRows);

        keyboard.close();
    }
}
