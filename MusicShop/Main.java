public class Main {
    public static void main(String[] args) {

        Shop musShop = new Shop();
        musShop.setName("City Music");
        musShop.setAddress("Shevchenko Boulevard,352");
        musShop.setNumberInstrumentOrder(2);

        Guitar guitar1 = new Guitar("Bass guitar", "Ibanez", "Japan", 4, "GSR180 BK", 6264 );
        Guitar guitar2 = new Guitar("Electro guitar", "Gibson", "USA", 6, "LPMM142MSC1", 20331);
        Guitar guitar3 = new Guitar("Acoustic guitar", "Fender", "USA", 6, "CD-60 ", 5211 );
        Guitar guitar4 = new Guitar("Ukulele", "Ibanez", "Japan", 4, "UEW15E", 6264 );


        Piano piano1 = new Piano("Yamaha", "Japan", 76, "DGX-230", 16050);
        Piano piano2 = new Piano("Orla", "Italy", 88 , "Grand 310", 130828 );
        Piano piano3 = new Piano("Casio", "Japan", 88, "PX-780BK", 26990);

        Drum drum1 = new Drum("Acoustic Drums","Sonor", "Germany",   5, "SMF 11 Studio Set ", 17174);
        Drum drum2 = new Drum("Djembe", "Maxtone", "China",  1, "ADJ08B ",  2664);
        Drum drum3 = new Drum("Electro drums", "Roland", "Japan",  9, "TD-1KV", 18928);



        /* Shop.addGuitar(guitar1);
        Shop.addGuitar(guitar2);
        Shop.addGuitar(guitar3);
        Shop.addGuitar(guitar4);
        System.out.println(Shop.toString());
        */


        System.out.println(musShop.toString());


    }
}
