import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import java.io.File;


public class Main extends Application {

    private Clip clip;
    private Boolean DoesClipExist = false;

    public void start(Stage stage){

//        JsonData jd = new JsonData();
//
//        jd.writeJson();

        String[] demSounds = {"We are #1", "A Keemstar Duet", "Keemstar Wedding", "Black Knight", "Classical Keemstar", "Keemstar Bells", "The Legend27", "Bright Side", "Witch Village", "Hugh Mungus"};

        double xRow = 6;
        double yRow = 9;

        int actualX = 0;
        int actualY = 0;

        VBox vBox = new VBox();
        vBox.setPrefWidth(150);
        vBox.setPrefHeight(100);

        Group rootNode = new Group();
        Scene scene = new Scene(rootNode, xRow * vBox.getPrefWidth()+ 30, Math.ceil(demSounds.length / xRow) * 105 + 115 + 50);

        scene.getStylesheets().add("master.css");
        stage.setScene(scene);
        stage.getIcons().add(new Image("file:C:\\Bewijzenmap\\p1.2\\pro\\opdracht_9E\\images.png"));

        Button[] buttons = new Button[demSounds.length];

        Label nowPlaying = new Label("Now playing: Nufin...");
        nowPlaying.relocate(10, scene.getHeight() - 130);
        rootNode.getChildren().add(nowPlaying);

        for(int i = 0; i < demSounds.length; i++) {
            if (actualX == xRow) {
                actualY++;
                actualX = 0;
            }
            buttons[i] = new Button(demSounds[i]);
            buttons[i].setMinWidth(vBox.getPrefWidth());
            buttons[i].setMinHeight(vBox.getPrefHeight());
            buttons[i].getStyleClass().add("custom-button");
            buttons[i].relocate((10 + (actualX * vBox.getPrefWidth())) + actualX * 2, (10 + (actualY * vBox.getPrefHeight())) + actualY * 2);
            rootNode.getChildren().add(buttons[i]);
            actualX++;

            final int soundNumber = i;

            buttons[i].setOnAction((event) -> {
                // Button was clicked, do something...
                if (DoesClipExist && clip.isActive()) {
                    clip.stop();
                }
                nowPlaying.setText("Now playing: " + demSounds[soundNumber]);
                playSound(demSounds[soundNumber]);
            });
        }

        Button STAWPH = new Button("STAWPHHHHHH DA SAUNDS :-|");
        STAWPH.setMinWidth(xRow * vBox.getPrefWidth() + 10);
        STAWPH.setMinHeight(100);
        STAWPH.getStyleClass().add("stawph-button");
        STAWPH.relocate(10, scene.getHeight() - 110);

        rootNode.getChildren().add(STAWPH);

        STAWPH.setOnAction(new EventHandler<ActionEvent>() {
            @Override public void handle(ActionEvent e) {
                clip.stop();
                nowPlaying.setText("Now playing: Nufin...");
            }
        });

        stage.show();
    }

    public void playSound(String url) {
        try {
            File file = new File("C:\\Bewijzenmap\\p1.2\\pro\\opdracht_9E\\AudioResources\\" + url + ".wav"); // src is the location of the file
            AudioInputStream stream = AudioSystem.getAudioInputStream(file);
            clip = AudioSystem.getClip();
            clip.open(stream);
            clip.start();
            DoesClipExist = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
