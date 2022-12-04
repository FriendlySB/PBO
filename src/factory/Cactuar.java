/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factory;

/**
 *
 * @author hanschristian
 */
public abstract class Cactuar {
    String name;
    int type = 0;
    int latitude = 0;
    int longitude = 0;
//    CactusEnum type = CactusEnum.CATAPULT;
    
    protected Cactuar() {
        
    }
    
    public CactusEnum getType() {
        return CactusEnum.values()[type];
    }
}
