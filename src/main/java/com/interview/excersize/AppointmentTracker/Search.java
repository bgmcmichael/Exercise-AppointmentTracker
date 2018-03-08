package com.interview.excersize.AppointmentTracker;

import javax.persistence.Entity;

/**
 * Created by fenji on 3/7/2018.
 */
public class Search {
    String searchText= "";

    public String getSearchText() {
        return searchText;
    }

    public void setSearchText(String searchText) {
        this.searchText = searchText;
    }

    public Search(){

    }
}
