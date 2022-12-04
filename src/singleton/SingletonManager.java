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
public class SingletonManager {
    
    // lazy instantiation
    private static SingletonManager instance;
    private User user;
    private ArrayList<String> transactions;
    
    private SingletonManager() {
    }

    public static SingletonManager getInstance() {
        if (instance == null) {
            instance = new SingletonManager();
        }
        return instance;
    }
    
    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
    
    public String cekUser() {
        if (user.getAlamat().equals("Bandung")) {
            return "kota";
        } else {
            return "kampung";
        }
    }
}
