package module02.problem01;

import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        PRAK201_2510817120014_NailaAtresiaRahma apple = new PRAK201_2510817120014_NailaAtresiaRahma("Apel", 7000.0, 0.4, 40.0);
        PRAK201_2510817120014_NailaAtresiaRahma mango = new PRAK201_2510817120014_NailaAtresiaRahma("mangga", 3500.0, 0.2, 15.0);
        PRAK201_2510817120014_NailaAtresiaRahma avocado = new PRAK201_2510817120014_NailaAtresiaRahma("alpukat", 10000.0, 0.25, 12.0);

        apple.printInfo();
        mango.printInfo();
        avocado.printInfo();
    }
}