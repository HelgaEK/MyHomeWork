package HW1;


public class Guitar {

        protected String type;
        protected String brand;
        protected String manufacturer;
        protected String model;
        protected int numberOfstring;
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

        public String toString() {
            String result = "Type: " + this.type + "\nBrand: " + this.brand + "\nManufacturer: " + this.manufacturer + "\nNumber of String: " + this.numberOfstring + "\nModel: " + this.model + "\nPrice in hrivnia : " + this.price;
            return result;
        }
}
