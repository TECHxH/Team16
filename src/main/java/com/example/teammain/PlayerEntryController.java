package com.example.teammain;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;

public class PlayerEntryController {
    private ObservableList<Player> players = FXCollections.observableArrayList();
    //public

    @FXML
    public void initTable(TableView<Player> tableView) {
        TableColumn<Player, String> idColumn = new TableColumn<>("ID");
        idColumn.setCellValueFactory(cellData -> cellData.getValue().idProperty()); // Updated line
        TableColumn<Player, String> firstNameColumn = new TableColumn<>("FirstName");
        firstNameColumn.setCellValueFactory(cellData -> cellData.getValue().firstNameProperty()); // Updated line
        TableColumn<Player, String> lastNameColumn = new TableColumn<>("LastName");
        lastNameColumn.setCellValueFactory(cellData -> cellData.getValue().lastNameProperty()); // Updated line
        TableColumn<Player, String> codeNameColumn = new TableColumn<>("CodeName");
        codeNameColumn.setCellValueFactory(cellData -> cellData.getValue().codeNameProperty()); // Updated line
        idColumn.prefWidthProperty().bind(tableView.widthProperty().multiply(0.1));
        firstNameColumn.prefWidthProperty().bind(tableView.widthProperty().multiply(0.3));
        lastNameColumn.prefWidthProperty().bind(tableView.widthProperty().multiply(0.3));
        codeNameColumn.prefWidthProperty().bind(tableView.widthProperty().multiply(0.3));
        tableView.getColumns().setAll(idColumn, firstNameColumn, lastNameColumn, codeNameColumn);
        tableView.setItems(players);
    }

//    @FXML
//    public void handleAddPlayer(ActionEvent event) {
//        String playerName = playerNameField.getText().trim();
//        if (!playerName.isEmpty()) {
//            addPlayer(playerName);
//            playerNameField.clear();
////            playerTableView.refresh();
//        }
//    }

    public boolean addPlayer(String id) {

        //check the database
        if(false/*player is not in db, pop up box for fname, lname, codename*/)
        {
            players.add(new Player(id, "firstName", "lastName", "codename"));
            //
            return false;
        }
        else {
            players.add(new Player(id));
            return true;

        }
    }

    public void updateFirstName(String firstName)
    {
        Player temp = players.get(players.size() - 1);
        temp.setFirstName(firstName);
        players.set((players.size() - 1), temp);

    }

    public ObservableList<Player> getPlayers() {
        return players;
    }

    public void resetPlayers(){
        players = FXCollections.observableArrayList();
    }


}

