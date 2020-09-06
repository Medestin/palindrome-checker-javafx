package com.medestin;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

import static java.lang.ClassLoader.getSystemResource;

public class Main extends Application {

    public static final String PALINDROME_CHECKER = "Palindrome checker";

    @Override
    public void start(Stage primaryStage) throws IOException {
        Parent root = FXMLLoader.load(getSystemResource("fxml/index.fxml"));

        primaryStage.setTitle(PALINDROME_CHECKER);
        primaryStage.setScene(new Scene(root, 400, 350));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
