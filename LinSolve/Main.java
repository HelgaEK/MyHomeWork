

public class Main {
    public static void main(String[] args) {
        LinSolv l = new LinSolv();
        l.setA(0);
        l.setB(0);

        double x = l.solve();

        if (Double.isNaN(x))
            System.out.println("The equation has any solution");
        else
            System.out.println("x=" + x);
    }
}
