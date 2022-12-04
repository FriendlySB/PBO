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
public class DatabaseController implements DataInterface {
    static DatabaseController instance = new DatabaseController();
    
    @Override
    public List<String> getNames() {
        System.out.println("Get Names from Database");
        List<String> listName = new ArrayList<>();
        // database connection query getListName
        return listName;
    }
}
