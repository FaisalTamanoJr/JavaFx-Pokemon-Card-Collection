package com.example.javafxpokemoncardcollection;

import javafx.beans.property.SimpleObjectProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.IOException;

public class SceneController {
    private Stage stage;
    private Scene scene;
    private Parent root;

    @FXML
    private TableView<Pokemon> pokemonsTable;
    @FXML
    private TableColumn<Pokemon,String> pokemonNames;

    public void switchToMainMenu(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("Main.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void switchToRemovePokemon(ActionEvent event) throws IOException{
        pokemonNames.setCellValueFactory(new PropertyValueFactory<Pokemon, String>("name"));
        pokemonsTable.setItems(Main.decksData);

        root = FXMLLoader.load(getClass().getResource("Remove.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);

        stage.setScene(scene);
        stage.show();
    }

    public void switchToViewPokemon(ActionEvent event) throws IOException{
        root = FXMLLoader.load(getClass().getResource("StudyTimer.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void switchToSlideshow(ActionEvent event) throws IOException{
        root = FXMLLoader.load(getClass().getResource("StudyTimer.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void SwitchToSearchPokemon(ActionEvent event) throws IOException{
        root = FXMLLoader.load(getClass().getResource("StudyTimer.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void Quit(ActionEvent event) throws IOException{
        root = FXMLLoader.load(getClass().getResource("StudyTimer.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}