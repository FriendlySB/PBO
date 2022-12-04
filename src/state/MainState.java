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
public class MainState {
    public static void main(String[] args) {
        Product p = new Product(); // state = Paid
//        p.state = new ShipmentState();
//        p.state = new ReceivedState();
        
        p.updateState(); // state dirubah jadi Shipment
        p.updateState(); // state dirubah jadi Received
        p.updateState(); // tidak ada perubahan lagi
    }
}
