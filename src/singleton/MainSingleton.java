/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singleton;

/**
 *
 * @author hanschristian
 */
public class MainSingleton {
    
    public MainSingleton() {
        SingletonManager.getInstance().setUser(new User());
        System.out.println(SingletonManager.getInstance().getUser().getName());
        SingletonManager.getInstance().setUser(null);
    }
    
    public static void main(String[] args) {
        new MainSingleton();
    }
}
