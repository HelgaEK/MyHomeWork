package HW1;

public class Main {
    public static void main(String[] args) {
        Guitar guitar = new Guitar();

        guitar.setType("Electro guitar");
        guitar.setBrand("Gibson");
        guitar.setModel("LPMM142MSC1");
        guitar.setManufacturer("USA");
        guitar.setNumberOfString(6);
        guitar.setPrice(20331);

        System.out.println(guitar.toString());

    }
}
