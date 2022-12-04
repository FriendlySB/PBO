/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observer;

/**
 *
 * @author hanschristian
 */
public class MainObserver {

    public static void main(String[] args) {
        Subject controlTower = new Subject();

        new BoeingObserver(controlTower);
        new AirbusObserver(controlTower);

        System.out.println("First message broadcast from Control Tower");
        controlTower.setMessage("There is a storm ahead!");
        
        System.out.println("");
        
        System.out.println("Second message broadcast from Control Tower");
        controlTower.setMessage("The storm is already cleared.");
    }
}
