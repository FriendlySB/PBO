/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adapter;

import java.util.*;

/**
 *
 * @author hanschristian
 */
public class MainAdapter {
    static List<LuxuryCarInterface> listMobil = new ArrayList<>();
    
    public static void main(String[] args) {
        Lamborghini lambo = new Lamborghini();
        listMobil.add(lambo);
        
        Agya agya = new Agya();
        listMobil.add(new CarAdapter(agya));
        
        for (int i = 0; i < listMobil.size(); i++) {
            listMobil.get(i).move();
            System.out.println(listMobil.get(i).getType());
        }
    }
}
