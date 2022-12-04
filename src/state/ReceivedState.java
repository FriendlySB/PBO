/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package state;

import java.util.Date;

/**
 *
 * @author hanschristian
 */
public class ReceivedState implements ProductInterface {
    
    String penerima;
    Date tanggalTerima;

    @Override
    public void update(Product product) {
        System.out.println("Barang sudah diterima");
    }
}
