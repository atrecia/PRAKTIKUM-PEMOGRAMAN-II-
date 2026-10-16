package module03.problem01;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // TODO: Buat agar variabel berikut menyimpan nilai dari input pengguna berupa integer
        int numberOfDice = input.nextInt();

        // TODO: Inisialisasi LinkedList berikut dengan sintaks new
        LinkedList<Dice> diceRolls = new LinkedList<>();

        int total = 0;
        for (int i = 0; i < numberOfDice; i++) {
            diceRolls.add(new Dice());
            // TODO: Instansiasi object Dice dengan new dan masukkan ke dalam LinkedList
            //  Hint 1: Pakai method .add()
            //  Hint 2: Bisa langsung tulis sintaks new di dalam parameter .add() tanpa harus membuat variabel


            // TODO: Print output yang diminta lembar kerja
            //  Hint: Untuk memanggil getter dari object Dice, cari dulu object-nya dari dalam diceRolls
            //        Method yang digunakan untuk itu adalah .get() dengan nilai indeks (i)
            System.out.println("Dadu ke-" + (i + 1) + " bernilai " + diceRolls.get(i).getNumber());

            // TODO: Ganti angka 0 berikut dengan getter number untuk menjumlahkan nilai number dari objek Dice
            total += diceRolls.get(i).getNumber();
        }

        System.out.println("Total nilai dadu keseluruhan " + total);
        input.close();
    }
}