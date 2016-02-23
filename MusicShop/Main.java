
public class Main {
    public static void main(String[] args) {

        Shop musShop = new Shop();
        musShop.setName("City Music");
        musShop.setAddress("Shevchenko Boulevard,352");
        musShop.setNumberInstrumentOrder(2);

        Instrument instrument = new Instrument();
        instrument.setType("bass guitar");
        instrument.setBrand("Ibanez");
        instrument.setManufacturer("Japan");
        instrument.setNumberOfString (4);
        instrument.setModel("GSR180 BK");
        musShop.addInstrument(instrument);

        Instrument instrument1 = new Instrument();
        instrument1.setType("electro guitar");
        instrument1.setBrand("Gibson");
        instrument1.setManufacturer("USA");
        instrument1.setNumberOfString (6);
        instrument1.setModel("ES0335 TDC");
        musShop.addInstrument(instrument);

        System.out.println(musShop.toString());
    }
}
