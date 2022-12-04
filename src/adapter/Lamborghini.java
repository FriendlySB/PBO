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
public class Lamborghini implements LuxuryCarInterface {
    
    @Override
    public void move() {
        System.out.println("Lambo jalan");
    }
    
    @Override
    public String getType() {
        return type;
    }
}
