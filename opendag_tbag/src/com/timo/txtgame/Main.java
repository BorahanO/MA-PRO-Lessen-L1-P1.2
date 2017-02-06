package com.timo.txtgame;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.awt.*;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{

        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();


        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, screenSize.getWidth(), screenSize.getHeight(), Color.black));

        primaryStage.setMaximized(true);

        VBox panel = new VBox();
        panel.setAlignment(Pos.TOP_LEFT);
        panel.setStyle("-fx-background: #000000;");

        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
