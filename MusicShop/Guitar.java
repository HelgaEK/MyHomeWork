public class Guitar{
protected String manufacturer;
protected int numberOfstring;
protected String type;
protected String model;
protected int price;
protected String brand;

 public void setManufacturer(String manufacturer) {

        this.manufacturer = manufacturer;
    }

    public int getNumberOfString() {

        return numberOfstring;
    }

    public void setNumberOfString(int numberOfstring) {

        this.numberOfstring = numberOfstring;
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

    public void setPrice(int price) {

        this.price = price;
    }

    public Guitar(String type, String brand, String manufacturer, int numberOfstring, String model, int price) {
        this.type = type;
        this.brand = brand;
        this.manufacturer = manufacturer;
        this.numberOfstring = numberOfstring;
        this.model = model;
        this.price = price;
    }

    public String toString() {
        return  "Type: " + this.type + "\nBrand: " + this.brand + "\nManufacturer: " + this.manufacturer + "\nNumber of String: " + this.numberOfstring + "\nModel: " + this.model + "\nPrice in hrivnia : " + this.price ;
    }
}
