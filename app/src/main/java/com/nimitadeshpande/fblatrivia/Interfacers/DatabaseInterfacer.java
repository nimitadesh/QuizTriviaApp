package com.nimitadeshpande.fblatrivia.Interfacers;

//import com.google.firebase.firestore.FirebaseFirestore;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.nimitadeshpande.fblatrivia.Model.User;

import java.util.HashMap;
import java.util.Map;

public class DatabaseInterfacer {

    private DatabaseReference mDatabase = FirebaseDatabase.getInstance().getReference();

    static Map<Integer, String> questions;
    //private DatabaseReference mDatabase;
    public void addInfoToDatabase() {

        questions = new HashMap<Integer, String>();
    }
    /**
     * Registration logic
     */

    public static void addUser(User user) {
        //add user logic
    }

    public static boolean checkPassword(String email, String password) {
        //search database for email and return true if password found
        return false;
    }



}
