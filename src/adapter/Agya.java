/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adapter;

/**
 *
 * @author hanschristian
 */
public class Agya implements LCGCInterface {

    String nama;
    
    @Override
    public void jalan() {
        System.out.println("Agya Jalan");
    }
}
