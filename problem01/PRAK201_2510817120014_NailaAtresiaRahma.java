package module02.problem01;

public class PRAK201_2510817120014_NailaAtresiaRahma {
    private String fruitName;
    private double price;
    private double weight;
    private double purchaseTotal;

    private double pricePerKg;

    public PRAK201_2510817120014_NailaAtresiaRahma(String fruitName, double price, double weight, double purchaseTotal) {
        this.fruitName = fruitName;
        this.price = price;
        this.weight = weight;
        this.purchaseTotal = purchaseTotal;

        this.pricePerKg = this.price * this.weight;
    }

    public void printInfo() {
        System.out.println("Nama Buah: " + this.fruitName);
        System.out.println("Berat: " + this.weight);
        System.out.println("Harga: " + this.price);
        System.out.println("Jumlah Beli: " + this.purchaseTotal + "kg");
        System.out.printf("Harga Sebelum Diskon: Rp%.2f\n", getPreDiscountPrice());
        System.out.printf("Total Diskon: Rp%.2f\n", getDiscountTotal());
        System.out.printf("Harga Setelah Diskon: Rp%.2f\n\n", getPostDiscountPrice());
    }

    public double getPreDiscountPrice() {
        return this.pricePerKg * this.purchaseTotal;
    }

    public double getDiscountTotal() {
        int discountThresholdKg = 4;
        double discountPercentage = 0.02;

        int discountBatches = (int)(this.purchaseTotal / discountThresholdKg);
        return discountBatches * (this.pricePerKg * discountThresholdKg) * discountPercentage;
    }

    public double getPostDiscountPrice() {
        return getPreDiscountPrice() - getDiscountTotal();
    }
}