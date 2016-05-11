
public class Piano extends Guitar  {

    protected int numberOfkeys;
 



    public String getBrand() {

        return brand;
    }

    public void setBrand(String brand) {

        this.brand = brand;
    }
    public String getType(){
        return type;
    }

    public void set Type(String type){
        this.type = type;
    }
    
    public String getManufacturer() {

        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {

        this.manufacturer = manufacturer;
    }

    public int getNumberOfKeys() {

        return numberOfkeys;
    }

    public void setNumberOfKeys(int numberOfString) {

        this.numberOfkeys = numberOfkeys;
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

    public Piano(String brand, String manufacturer, int numberOfkeys, String model, int price) {

       
        this.numberOfkeys = numberOfkeys;
       
    }

    public String toString() {
        return  "Brand: " + this.brand + "\nManufacturer: " + this.manufacturer + "\nNumber of Keys: " + this.numberOfkeys + "\nModel: " + this.model + "\nPrice in hrivnia : " + this.price ;
    }
}
