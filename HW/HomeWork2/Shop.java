package HW1;

public class Shop {
    protected String name;
    protected String address;
    protected int numberGuitarsOrder;
    protected Guitar[] guitarsArray;
    protected int number;

    public Shop() {
        this.guitarsArray = new Guitar[100];
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

    public int getNumberGuitarsOrder() {
        return number;
    }

    public void setNumberGuitarsOrder(int numberGuitarsOrder) {
        this.numberGuitarsOrder = numberGuitarsOrder;
    }

    public void addGuitar(Guitar guitar) {
        this.guitarsArray[this.number] = guitar;
        this.number++;
    }

    public String toString() {
        String result = "You need to order " + this.numberGuitarsOrder + " guitars for shop " + this.name + " on address " + this.address + ":\n--------\n";
        for(int i = 0; i < this.number; i++) {
            result += this.guitarsArray[i].toString() + "\n--------\n";
        }
        return result;
    }
}

