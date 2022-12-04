/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factory;

import static factory.CactusEnum.BOMB;
import static factory.CactusEnum.CATAPULT;

/**
 *
 * @author hanschristian
 */
public class MainFactory {

    public static void main(String[] args) {
        // Conventional Pattern
        BombCactuar bomb1 = new BombCactuar();
        BombCactuar bomb2 = new BombCactuar();
        BombCactuar bomb3 = new BombCactuar();

        CatapultCactuar catapult1 = new CatapultCactuar();
        CatapultCactuar catapult2 = new CatapultCactuar();

        // Factory Pattern
        Cactuar cactuar1 = CactuarFactory.createCactus(BOMB);
        Cactuar cactuar2 = CactuarFactory.createCactus(BOMB);
        Cactuar cactuar3 = CactuarFactory.createCactus(CATAPULT);
    }
}
