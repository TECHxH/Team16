package com.example.teammain;

import javafx.beans.property.SimpleStringProperty;

public class Player {
    private final SimpleStringProperty id;
    private SimpleStringProperty firstName;
    private SimpleStringProperty lastName;
    private SimpleStringProperty codeName;

    public Player(String id, String firstname, String lastname, String codename) {
        this.id = new SimpleStringProperty(id);
        this.firstName = new SimpleStringProperty(firstname);
        this.lastName = new SimpleStringProperty(lastname);
        this.codeName = new SimpleStringProperty(codename);
    }

    public Player(String id) {
        this.id = new SimpleStringProperty(id);
        this.firstName = new SimpleStringProperty("");
        this.lastName = new SimpleStringProperty("");
        this.codeName = new SimpleStringProperty("");
    }

    public SimpleStringProperty idProperty() {
        return id;
    }

    public SimpleStringProperty firstNameProperty() {
        return firstName;
    }

    public SimpleStringProperty lastNameProperty() {
        return lastName;
    }

    public SimpleStringProperty codeNameProperty() {
        return codeName;
    }

    public void setFirstName(String firstname) {
        this.firstName = new SimpleStringProperty(firstname);
    }

    public void setLastName(String lastname) {

        this.lastName = new SimpleStringProperty(lastname);
    }

    public void setCodeName(String codename) {

        this.codeName = new SimpleStringProperty(codename);
    }



}