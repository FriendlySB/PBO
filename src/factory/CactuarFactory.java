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
public class CactuarFactory {
    static int totalEnemy = 0;
    
    public static Cactuar createCactus(CactusEnum type) {
        Cactuar cactuar;
        switch(type) {
            case BOMB: {
                if (totalEnemy < 10) {
                    cactuar = new BombCactuar();
                    totalEnemy++;
                } else {
                    // clear some enemy that already passed
                    // then create new object
                    cactuar = new BombCactuar();
                }
                break;
            }
            case CATAPULT: cactuar = new CatapultCactuar();
                break;
            case CANNON: {
                
            }
            default: cactuar = null;
                break;
        }
        return cactuar;
    }
}
