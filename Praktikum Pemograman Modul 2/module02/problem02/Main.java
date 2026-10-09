package module02.problem02;

public class Main {
    public static void main(String[] args) {
        PRAK202_2510817120014_NailaAtresiaRahma coffee = new PRAK202_2510817120014_NailaAtresiaRahma();
        coffee.setName("Espresso");
        coffee.setSize("Medium");
        coffee.setPrice(25000);

        coffee.printInfo();
        coffee.setCustomer("Alice");
        System.out.println("Pembeli Kopi: " + coffee.getCustomer());
        System.out.println("Pajak Kopi: Rp. " + coffee.getTax());
    }
}