public class Triangle {
    private int sideA;
    private int sideB;
    private int sideC;

    public Triangle(int sideA, int sideB, int sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
        printInfo();
    }

    public int getSideA() {
        return sideA;
    }

    public void setSideA(int sideA) {
        this.sideA = sideA;
    }

    public int getSideB() {
        return sideB;
    }

    public void setSideB(int sideB) {
        this.sideB = sideB;
    }

    public int getSideC() {
        return sideC;
    }

    public void setSideC(int sideC) {
        this.sideC = sideC;
    }

    public double geronArea() {
        double halfPerimeter = getPerimeter() / 2;
        double solv = Math.sqrt((halfPerimeter * (halfPerimeter - getSideA()) * (halfPerimeter - getSideB()) * (halfPerimeter - getSideC())));
        return Math.round(solv * 100.0) / 100.0;
    }

    public int getPerimeter() {
        return getSideA() + getSideB() + getSideC();
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "sideA=" + sideA +
                ", sideB=" + sideB +
                ", sideC=" + sideC +
                '}';
    }

    public void printInfo() {
        System.out.println("Triangle creat");
    }
}
