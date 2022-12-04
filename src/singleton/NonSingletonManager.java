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
public class NonSingletonManager {
    private static User loggedInUser;
    private static ArrayList<String> transactions;

    public static User getLoggedInUser() {
        return loggedInUser;
    }

    public static void setLoggedInUser(User loggedInUser) {
        NonSingletonManager.loggedInUser = loggedInUser;
    }

    public static ArrayList<String> getTransactions() {
        return transactions;
    }

    public static void setTransactions(ArrayList<String> transactions) {
        NonSingletonManager.transactions = transactions;
    }
}
