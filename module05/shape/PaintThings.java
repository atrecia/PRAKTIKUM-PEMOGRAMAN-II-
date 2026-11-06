package module05.shape;

import java.text.DecimalFormat;

public class PaintThings {
    public static void main(String[] args) {
        paint paintJob = new paint(350);
        paintJob.setCoverage(paintJob.getCoverage());

        rectangle deck = new rectangle(0, 0);
        deck.setLength(20);
        deck.setWidth(30);
        deck.setLength(deck.getLength());
        deck.setWidth(deck.getWidth());

        sphere bigBall = new sphere(0);
        bigBall.setRadius(15);
        bigBall.setRadius(bigBall.getRadius());

        cylinder tank = new cylinder(0, 0);
        tank.setRadius(10);
        tank.setHeight(30);
        tank.setRadius(tank.getRadius());
        tank.setHeight(tank.getHeight());

        double deckAmt = paintJob.amount(deck);
        double ballAmt = paintJob.amount(bigBall);
        double tankAmt = paintJob.amount(tank);

        DecimalFormat fmt = new DecimalFormat("0.#");

        System.out.println();
        System.out.println("Number of gallons of paint needed...");
        System.out.println("Deck " + fmt.format(deckAmt));
        System.out.println("Big Ball " + fmt.format(ballAmt));
        System.out.println("Tank " + fmt.format(tankAmt));
    }
}
