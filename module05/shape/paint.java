package module05.shape;

public class paint {
    private double coverage;

    public paint(double coverage) {
        setCoverage(coverage);
    }

    public double getCoverage() {
        return coverage;
    }

    public void setCoverage(double coverage) {
        this.coverage = coverage;
    }

    public double amount(shape s) {
        System.out.println("Computing amount for " + s);
        return s.area() / getCoverage();
    }
}