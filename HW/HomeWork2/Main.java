
package HW1;

public class Main {
    public static void main(String[] args) {

        Shop shop = new Shop();

        shop.setName("City Music");
        shop.setAddress("Shevchenko Boulevard,352");
        shop.setNumberGuitarsOrder(2);

        Guitar guitar = new Guitar();

        guitar.setType("Electro guitar");
        guitar.setBrand("Gibson");
        guitar.setModel("LPMM142MSC1");
        guitar.setManufacturer("USA");
        guitar.setNumberOfString(6);
        guitar.setPrice(20331);
        
        shop.addGuitar(guitar);
        
        guitar = new Guitar();

        guitar.setType("Bass guitar");
        guitar.setBrand("Ibanez");
        guitar.setModel("GSR180 BK");
        guitar.setManufacturer("Japan");
        guitar.setNumberOfString(4);
        guitar.setPrice(6264);
        
        shop.addGuitar(guitar);

        System.out.println(shop.toString());

    }
}
