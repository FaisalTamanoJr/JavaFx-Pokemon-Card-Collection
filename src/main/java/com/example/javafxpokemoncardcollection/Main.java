/*
 * Classname: EQ3
 *
 * Author: Tamano
 *
 * Date: 7/13/2023
 *
 * Description: The main menu
 */

package com.example.javafxpokemoncardcollection;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.Parent;

import java.io.IOException;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Main.fxml"));
        Scene mainMenu = new Scene(root,600,400); // Initialize the Menu

        /* Main Menu Scene */
        primaryStage.setTitle("Pokemon Card Collection App");
        primaryStage.setScene(mainMenu);
        primaryStage.setResizable(false);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}