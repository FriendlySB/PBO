/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builder;

import java.util.Date;

/**
 *
 * @author hanschristian
 */
public class Car {
    private String brand = "";
    private Date buyDate = new Date();
    private String owner = "";
    private int price = 0;
    private boolean newCar = true;
    private Date sellDate;
    
    public Car() {
    }
    
    // bentrok karena overloading
//    public Car(String brand, Date sellDate) {
//    }
    
    public Car(String brand, Date buyDate) {
    }
    
    public Car(String brand, Date buyDate, String owner, int price, boolean newCar) {
        this.brand = brand;
        // dan seterusnya
    }
    
    public Car(Builder builder) {
        this.brand = builder.brand;
        this.buyDate = builder.buyDate;
        this.owner = builder.owner;
        this.price = builder.price;
        this.newCar = builder.newCar;
    }
    
    public static class Builder {
        private String brand = "";
        private Date buyDate = new Date();
        private String owner = "";
        private int price = 0;
        private boolean newCar = true;
    
        public Builder() {
        }

        public Builder setBrand(String brand) {
            this.brand = brand;
            return this;
        }

        public Builder setBuyDate(Date buyDate) {
            this.buyDate = buyDate;
            return this;
        }

        public Builder ownedBy(String owner) {
            this.owner = owner;
            return this;
        }

        public Builder withPrice(int price) {
            this.price = price;
            return this;
        }

        public Builder isNewCar(boolean newCar) {
            this.newCar = newCar;
            return this;
        }
        
        public Car build() {
            Car car = new Car(this);
            return car;
        }
    }
}
