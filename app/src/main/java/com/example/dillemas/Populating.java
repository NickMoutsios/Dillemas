package com.example.dillemas;

/**
 * Created by Bill on 18/11/2016.
 */

public class Populating {
    private final String[] categories= new String[5];

    //Our categories.
    private void populateCategories() {

        categories[0] = "ΑΣΤΕΙΑ";
        categories[1] = "ΔΙΑΦΟΡΑ";
        categories[2] = "ΠΕΡΙΕΡΓΑ";
        categories[3] = "ΘΑΝΑΤΟΥ";
        categories[4] = "ΑΒΟΛΑ";
    }

    public Populating() {
        populateCategories();
    }

    public String[] getCategories() {return categories;}
}
