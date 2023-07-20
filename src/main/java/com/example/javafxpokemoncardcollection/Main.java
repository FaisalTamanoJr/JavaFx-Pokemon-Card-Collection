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
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.Parent;

import java.io.IOException;
import java.util.ArrayList;

public class Main extends Application {
    public static final String pokemonData = "Pokemon.txt";
    protected PokemonCards pokemonDeck; // Card collection object
    protected static ObservableList<Pokemon> decksData;

    @Override
    public void start(Stage primaryStage) throws IOException {
        pokemonDeck = new PokemonCards();
        decksData = FXCollections.observableArrayList(pokemonDeck.stats);

        Parent root = FXMLLoader.load(getClass().getResource("Main.fxml"));
        Scene mainMenu = new Scene(root); // Initialize the Menu

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