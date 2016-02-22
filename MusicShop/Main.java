
public class Main {
    public static void main(String[] args) {

        Shop musShop = new Shop();
        musShop.setName("Bukvica");
        musShop.setAddress("Ostafiya Dashkevich, 19");
        musShop.setNumberBooksOrder(2);

        Guitar guitar = new Guitar();
        guitar.setName("Fahrenheit 451");
        guitar.setAuthor("Ray Bradbury");
        guitar.setCity("United States");
        guitar.setPages(159);
        guitar.setYearPublished(1953);
        musShop.addGuitar(guitar);

        guitar = new Guitar();
        guitar.setName("The Master and Margarita");
        guitar.setAuthor("Mikhail Bulgakov");
        guitar.setCity("Soviet Union");
        guitar.setPages(400);
        guitar.setYearPublished(1967);
        musShop.addGuitar(guitar);

        System.out.println(musShop.toString());
    }
}
