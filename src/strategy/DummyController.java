/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategy;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author hanschristian
 */
public class DummyController implements DataInterface {
    static DummyController instance = new DummyController();
    
    @Override
    public List<String> getNames() {
        System.out.println("Get Names from Dummy");
        List<String> listName = new ArrayList<>();
        listName.add("Budi");
        listName.add("Danu");
        return listName;
    }
    
    public String getAddress() {
        return "";
    }
}
