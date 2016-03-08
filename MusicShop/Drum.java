public class Drum {
    protected String type;
    protected String brand;
    protected String manufacturer;
    protected String model;
    protected int numberOfdrum;
    protected int price;


    public String getType() {

        return type;
    }

    public void setType(String type) {

        this.type = type;
    }

    public String getBrand() {

        return brand;
    }

    public void setBrand(String brand) {

        this.brand = brand;
    }

    public String getManufacturer() {

        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {

        this.manufacturer = manufacturer;
    }

    public int getNumberOfDrum() {

        return numberOfdrum;
    }

    public void setNumberOfDrum(int numberOfstring) {

        this.numberOfdrum = numberOfdrum;
    }

    public String getModel() {

        return model;
    }

    public void setModel(String model) {

        this.model = model;
    }
    public int getPrice() {

        return price;
    }

    public void setPrice(int numberOfString) {

        this.price = price;
    }

    public Drum(String type, String brand, String manufacturer, int numberOfString, String model, int price) {
        this.type = type;
        this.brand = brand;
        this.manufacturer = manufacturer;
        this.numberOfdrum = numberOfdrum;
        this.price = price;
    }

    public String toString() {
        return  "Type: " + this.type + "\nBrand: " + this.brand + "\nManufacturer: " + this.manufacturer + "\nNumber of String: " + this.numberOfdrum + "\nModel: " + this.model + "\nPrice in hrivnia : " + this.price ;
    }
}
