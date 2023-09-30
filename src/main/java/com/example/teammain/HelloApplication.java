package com.example.teammain;

import com.example.teammain.DBUtils.DBMethods;
import javafx.animation.PauseTransition;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import javafx.util.Duration;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader gameStartLoader = new FXMLLoader(HelloApplication.class.getResource("/gamestart.fxml"));
        Scene gameStartScene = new Scene(gameStartLoader.load());
        stage.setScene(gameStartScene);
        stage.setTitle("Game Starting...");
        stage.show();

        PauseTransition pause = new PauseTransition(Duration.seconds(0.5));// set this to 3 when done testing
        pause.setOnFinished(event -> {
            // After 3 seconds, switch to PlayerEntry.fxml
            try {
                FXMLLoader playerEntryLoader = new FXMLLoader(HelloApplication.class.getResource("/PlayerEntry.fxml"));
                Scene playerEntryScene = new Scene(playerEntryLoader.load());
                stage.setTitle("Hello!");
                stage.setScene(playerEntryScene);
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
        pause.play();
    }

    public static void main(String[] args) {
        launch();
        //MainController.firstNameField.setVisible(false);
    }
}
