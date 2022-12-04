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
public class ShipmentState implements ProductInterface {

    String kurir;
    String agen;
    
    @Override
    public void update(Product product) {
        System.out.println("State sekarang Shipment, dirubah menjadi Received");
        product.state = new ReceivedState();
    }
}
