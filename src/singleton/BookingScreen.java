/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singleton;

import java.util.ArrayList;

/**
 *
 * @author hanschristian
 */
public class BookingScreen {
    
    public BookingScreen() {
        System.out.println(SingletonManager.getInstance().getUser().getName());
    }
}
