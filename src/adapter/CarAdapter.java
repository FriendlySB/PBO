package adapter;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hanschristian
 */
public class CarAdapter implements LuxuryCarInterface {
    
    LCGCInterface lcgcCar;
    
    public CarAdapter(LCGCInterface lcgcCar) {
        this.lcgcCar = lcgcCar;
    }

    @Override
    public void move() {
        lcgcCar.jalan();
    }
    
    @Override
    public String getType() {
        return lcgcCar.tipe;
    }
}
