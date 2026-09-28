package module01.problem05;

import java.text.DecimalFormat;
import java.util.Scanner;

public class PRAK105_2510817120014_NailaAtresiaRahma {
    public static void main(String[] args) {
        final double PHI = 3.14;
        double jari_jari, tinggi, hasil;

        Scanner keyboard = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.###");

        System.out.print("Masukkan jari-jari: ");
        jari_jari = keyboard.nextDouble();

        System.out.print("Masukkan tinggi: ");
        tinggi = keyboard.nextDouble();

        hasil = PHI * jari_jari * jari_jari * tinggi;

        System.out.println("Volume tabung dengan jari-jari " + jari_jari + " cm dan tinggi " + tinggi + " cm adalah " + df.format(hasil) + " m3");

        keyboard.close();
    }
}