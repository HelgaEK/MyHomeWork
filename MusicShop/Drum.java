public class Drum extends Guitar {
    
    protected int numberOfdrum;
   


    public int getNumberOfDrum() {

        return numberOfdrum;
    }

    public void setNumberOfDrum(int numberOfstring) {

        this.numberOfdrum = numberOfdrum;
    }

    public Drum(String type, String brand, String manufacturer, int numberOfdrum, String model, int price) {
        super(type, brand, manufacturer,model, price)
        this.numberOfdrum = numberOfdrum;
        
    }

    public String toString() {
        return  "Type: " + this.type + "\nBrand: " + this.brand + "\nManufacturer: " + this.manufacturer + "\nNumber of String: " + this.numberOfdrum + "\nModel: " + this.model + "\nPrice in hrivnia : " + this.price ;
    }
}
