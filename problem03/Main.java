package module02.problem03;

public class Main {
    public static void main(String[] args) {
        PRAK203_2510817120014_NailaAtresiaRahma p1 = new PRAK203_2510817120014_NailaAtresiaRahma();

        //pada bariss ini erorr karna kurangnya titik koma (;) diakhir
        //p1.name = "Roi"
        p1.name = "Roi";
        p1.origin = "Kingdom of Orvel";
        p1.setRole("Assasin");

        // yang atribut umur itu belum diinisialisasi sehingga outputnya nti akan menjadi 0
        // di tambahkan inisialisasi umur biar sesuai sama output yang diminta
        p1.age = 17;

        System.out.println("Nama: " + p1.getName());
        System.out.println("Asal: " + p1.getOrigin());
        System.out.println("Jabatan: " + p1.role);

        // output yang diminta itu "17 tahun", maka ditambahkan string " tahun"
        // System.out.println("Umur: " + pl.age);
        System.out.println("Umur: " + p1.age + " tahun");
    }
}