package module03.problem02;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // TODO: Terima input untuk jumlah negara
        //  Hint: Gunakan .parseInt(input.nextLine()) dari class Integer
        //        Karena kalau .nextInt() biasa, waktu klik Enter, kan itu sebenarnya "\n" (String, bukan int),
        //        jadi \n itu masuk ke input berikutnya (nama negara)
        int numberOfCountries = Integer.parseInt(input.nextLine());

        // TODO: Inisiasi LinkedList berikut dengan new
        LinkedList<country> countries = new LinkedList<>();

        for (int i = 0; i < numberOfCountries; i++) {
            // TODO: Gunakan .nextLine() untuk menerima input untuk nama negara, jenis kepemimpinan, dan nama pemimpin
            String countryName = input.nextLine();
            String leadershipType = input.nextLine();
            String leaderName = input.nextLine();

            if (leadershipType.equals("monarki")) {
                // TODO: Gunakan .add() untuk memasukkan instansiasi Country dengan constructor yang parameternya cuma 3
                //       ke dalam LinkedList countries
                countries.add(new country(countryName, leadershipType, leaderName));
                continue; // Tahu aja kan gunanya continue?
            }

            // TODO: Gunakan cara yang sama seperti numberOfCountries untuk menerima
            //       input tanggal kemerdekaan, bulan kemerdekaan, dan tahun kemerdekaan
            int independenceDate = Integer.parseInt(input.nextLine());
            int independenceMonth = Integer.parseInt(input.nextLine());
            int independenceYear = Integer.parseInt(input.nextLine());

            // TODO: Masukkan instansiasi Country dengan constructor yang parameternya lengkap ke dalam countries
            countries.add(new country(countryName, leadershipType, leaderName, independenceDate, independenceMonth, independenceYear));
        }

        // Q: Loh Bang kok beda sintaks for loop-nya?
        // A: Ini versi Java dari "for country in countries" (Python)
        for (country country : countries) {
            country.printInfo();
            // TODO: Panggil method .printInfo() dari object country
        }
        input.close();
    }
}