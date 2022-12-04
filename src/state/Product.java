/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package state;

/**
 *
 * @author hanschristian
 */
public class Product {
//    public enum ProductStatus {
//        PAID, SHIPMENT, RECEIVED;
//    }
    
    String name;
    int harga;
//    String penerima = "";
//    String kurir = "";
//    ProductStatus status = ProductStatus.PAID;
    ProductInterface state = new PaidState();
    
    public void updateState() {
        state.update(this);
    }
}
