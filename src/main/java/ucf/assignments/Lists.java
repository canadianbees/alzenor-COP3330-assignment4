/*
 *  UCF COP3330 Fall 2021 Assignment 4 Lists Class file
 *  Copyright 2021 Celina Alzenor
 */

package ucf.assignments;

import javafx.beans.property.SimpleStringProperty;

public class Lists {

    private SimpleStringProperty nameList;

    public String getNameList() {
        return nameList.get();
    }

    public SimpleStringProperty nameListProperty() {
        return nameList;
    }

    public void setNameList(String nameList) {
        this.nameList.set(nameList);
    }

    public Lists(String nameList) {
        this.nameList = new SimpleStringProperty(nameList);
    }

}
