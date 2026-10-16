package module03.problem02;

import java.util.HashMap;

public class country {
    // TODO: Deklarasikan 6 attribute Country sesuai lembar kerja:
    //  nama, jenis kepemimpinan, nama pemimpin,
    //  tanggal kemerdekaan, bulan kemerdekaan, tahun kemerdekaan
    //  Hint: Jangan lupa dibuat private
    private String countryName;
    private String leadershipType;
    private String leaderName;
    private int independenceDate;
    private int independenceMonth;
    private int independenceYear;

    // TODO: Tulis constructor dengan parameter yang lengkap sesuai jumlah attribute
    public country(String countryName, String leadershipType, String leaderName, int independenceDate, int independenceMonth, int independenceYear) {
        this.countryName = countryName;
        this.leadershipType = leadershipType;
        this.leaderName = leaderName;
        this.independenceDate = independenceDate;
        this.independenceMonth = independenceMonth;
        this.independenceYear = independenceYear;

    }

    // TODO: Tulis constructor hanya dengan 3 parameter yang diminta:
    //  nama, jenis kepemimpinan, nama pemimpin
    public country(String countryName, String leadershipType, String leaderName) {
        this.countryName = countryName;
        this.leadershipType = leadershipType;
        this.leaderName = leaderName;
    }

    public void printInfo() {
        // TODO: Buat HashMap untuk nama bulan dengan type parameter Integer (nomor bulan) dan String (nama bulan)
        //  Hint: HashMap<Type, Parameter> monthNames = new HashMap<>();
        HashMap<Integer, String> monthNames = new HashMap<>();

        // TODO: Masukkan nilai ke HashMap dengan method .put()
        //  Hint: monthNames.put(1, "Januari");
        monthNames.put(1, "Januari");
        monthNames.put(2, "Februari");
        monthNames.put(3, "Maret");
        monthNames.put(4, "April");
        monthNames.put(5, "Mei");
        monthNames.put(6, "Juni");
        monthNames.put(7, "Juli");
        monthNames.put(8, "Agustus");
        monthNames.put(9, "September");
        monthNames.put(10, "Oktober");
        monthNames.put(11, "November");
        monthNames.put(12, "Desember");

        // TODO: Gunakan switch-case (atau if-else) untuk menentukan gelar pemimpin
        //  "monarki" -> "Raja"
        //  "presiden" -> "Presiden"
        //  "perdana menteri" -> "Perdana Menteri"
        //  Hint: bisa gunakan .toLowerCase() pada leadershipType (jenis kepemimpinan) jika mau lebih aman
        //        Misal "PREsiden" atau "presiDeN" dsb. bakal jadi "presiden"
        String leaderTitle = switch (this.leadershipType.toLowerCase()) {
            case "monarki" -> "Raja";
            case "presiden" -> "Presiden";
            case "perdana menteri" -> "Perdana Menteri";
            default -> this.leadershipType;
        };

        // TODO: Print informasi tentang negara
        //  Baris 1: Negara Indonesia mempunyai Presiden bernama Joko Widodo (biarin tetap Jokowi)
        //  Baris 2: Deklarasi Kemerdekaan pada Tanggal 17 Agustus 1945
        System.out.println("Negara " + this.countryName
                + " mempunyai " + leaderTitle
                + " bernama " + this.leaderName
        );

        // TODO: Gunakan if agar baris 2 hanya di-print untuk negara dengan jenis kepemimpinan selain monarki
        if (!this.leadershipType.equalsIgnoreCase("monarki")) {
            System.out.println("Deklarasi Kemerdekaan pada Tanggal "
                    + this.independenceDate + " "
                    + monthNames.get(this.independenceMonth) + " "
                    + this.independenceYear
            );
        }
        System.out.println();
    }
}