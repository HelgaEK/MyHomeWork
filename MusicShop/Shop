
public class Shop {
    protected String name;
    protected String address;
    protected int numberInstrumentOrder;
    protected Instrument[] instrumentArray;
    protected int number;

    public Shop() {
        this.instrumentArray = new Instrument[100];
        this.number = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getNumberInstrumentOrder() {
        return number;
    }

    public void setNumberInstrumentOrder(int numberInstrumentOrder) {
        this.numberInstrumentOrder = numberInstrumentOrder;
    }

    public void addInstrument(Instrument instrument) {
        this.instrumentArray[this.number] = instrument;
        this.number++;
    }

    public String toString() {
        String result = "You need to order " + this.numberInstrumentOrder + " instrument for shop " + this.name + " on address " + this.address + ":\n--------\n";
        for(int i = 0; i < this.number; i++) {
            result += this.instrumentArray[i].toString() + "\n--------\n";
        }
        return result;
    }
}
