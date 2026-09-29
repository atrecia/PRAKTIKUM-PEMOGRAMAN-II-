package module01.problem05;

import java.text.DecimalFormat;
import java.util.Scanner;

public class PRAK105_2510817120014_NailaAtresiaRahma {
    public static void main(String[] args) {
        final double PHI = 3.14;
        double radius, height, result;

        Scanner keyboard = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.###");

        System.out.print("Masukkan jari-jari: ");
        radius = keyboard.nextDouble();

        System.out.print("Masukkan tinggi: ");
        height = keyboard.nextDouble();

        result = PHI * radius * radius * height;

        System.out.println("Volume tabung dengan jari-jari " + radius + " cm dan tinggi " + height + " cm adalah " + df.format(result) + " m3");

        keyboard.close();
    }
}
