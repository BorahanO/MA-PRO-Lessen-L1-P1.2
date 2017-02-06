//Importeren van gebruikte classes
import javafx.animation.FillTransition;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.control.Slider;
import javafx.scene.Group;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.image.Image;
import javafx.scene.shape.*;
import javafx.scene.paint.Color;
import javafx.scene.control.Label;
import javafx.animation.Timeline;
import javafx.animation.ParallelTransition;
import javafx.animation.RotateTransition;
import javafx.animation.ScaleTransition;
import javafx.animation.TranslateTransition;
import javafx.util.Duration;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

import java.util.Scanner;
import food.fruit.Apple;
import food.fruit.Banana;
import food.junkfood.Hamburger;
import food.candy.Kersje;
import food.Food;

public class Les8Extra extends Application{  //zorg dat de class overerft van Application

  public int current = 0;
  public Food[] food;

  public void start(Stage stage){   //geef de stage mee als argument

    createArray();
    String imageURL = changeImage(food[current].getType());

    Group rootNode = new Group();
    Scene scene = new Scene(rootNode, 600, 600);
    stage.setScene(scene);

    Image image = new Image(imageURL, true);
    ImageView iv = new ImageView();
    iv.setFitWidth(200);
    iv.setPreserveRatio(true);
    iv.relocate(0,50);
    iv.setImage(image);
    rootNode.getChildren().add(iv);

    Label label = new Label("Selected Food: #0");
    label.relocate(10,10);
    rootNode.getChildren().add(label);

    Label response = new Label("");
    response.relocate(250,300);
    rootNode.getChildren().add(response);

    // Time PNG http://www.pngall.com/wp-content/uploads/2016/07/Time-PNG-Images.png
    // Bites PNG http://www.dividendninja.com/wp_wordpress/wp-content/uploads/2012/04/red-apple-bite-239x270.jpg

    String[] res = food[current].printStatus();
    Label foodName = new Label("You have a " + res[4] + " " + res[0]);
    foodName.relocate(150,280);
    rootNode.getChildren().add(foodName);

    Image timeImage = new Image("http://www.pngall.com/wp-content/uploads/2016/07/Time-PNG-Images.png", true);
    ImageView timeIcon = new ImageView(timeImage);
    timeIcon.setFitWidth(20);
    timeIcon.setFitHeight(20);
    Label timeLabel = new Label("-- Days Old");
    timeLabel.setGraphic(timeIcon);

    timeLabel.relocate(150,300);
    rootNode.getChildren().add(timeLabel);

    Image biteImage = new Image("http://www.dividendninja.com/wp_wordpress/wp-content/uploads/2012/04/red-apple-bite-239x270.jpg", true);
    ImageView biteIcon = new ImageView(biteImage);
    biteIcon.setFitWidth(20);
    biteIcon.setFitHeight(20);
    Label biteLabel = new Label("-- Bites Left");
    biteLabel.setGraphic(biteIcon);

    biteLabel.relocate(150,320);
    rootNode.getChildren().add(biteLabel);

    //maak een button aan en plaats deze in de extra group
    Button button = new Button("Next Food >>");
    button.relocate(505, 570);
    rootNode.getChildren().add(button);

    Button button1 = new Button("<< Previous Food");
    button1.relocate(5, 570);
    rootNode.getChildren().add(button1);

    Button lookylook = new Button("Look");
    lookylook.relocate(250, 570);
    rootNode.getChildren().add(lookylook);

    Button eatyeat = new Button("Eat");
    eatyeat.relocate(300, 570);
    rootNode.getChildren().add(eatyeat);

    button.setOnAction(new EventHandler<ActionEvent>() {
        @Override public void handle(ActionEvent e) {
            current++;
            if (current > food.length - 1) {
              current = 0;
            }

            biteLabel.setText("-- Bites Left");
            timeLabel.setText("-- Days Old");

            label.setText("Selected Food: #" + current);
            String[] res = food[current].printStatus();
            String imageURL = changeImage(res[0]);
            iv.setImage(new Image(imageURL, true));

            foodName.setText("You have a " + res[4] + " " + res[0]);

            response.setText("");
        }
    });

    button1.setOnAction(new EventHandler<ActionEvent>() {
        @Override public void handle(ActionEvent e) {
            current--;

            if (current < 0) {
              current = food.length - 1;
            }

            biteLabel.setText("-- Bites Left");
            timeLabel.setText("-- Days Old");

            label.setText("Selected Food: #" + current);
            String[] res = food[current].printStatus();
            String imageURL = changeImage(res[0]);
            iv.setImage(new Image(imageURL, true));

            foodName.setText("You have a " + res[4] + " " + res[0]);

            response.setText("");
        }
    });

    eatyeat.setOnAction(new EventHandler<ActionEvent>() {
        @Override public void handle(ActionEvent e) {
            response.setText(food[current].takeBite());
        }
    });

    lookylook.setOnAction(new EventHandler<ActionEvent>() {
        @Override public void handle(ActionEvent e) {
            String[] res = food[current].printStatus();
            biteLabel.setText(res[1] + " Bites Left");
            timeLabel.setText(res[2] + " Days Old");
            foodName.setText("You have a " + res[4] + " " + res[0]);
        }
    });

    //laat de stage en inhoud renderen met de show() method
    stage.show();
  }

  public void createArray(){
    food = new Food[15];
    for(int i=0; i<5; i++){
      food[i] = new Banana();
      food[i + 5] = new Hamburger();
      food[i + 10] = new Kersje();
    }

    // food[current].takeBite();
    // food[current].printStatus();
  }

  public String changeImage(String type) {
    System.out.println(type);
    if(type.equals("Banana")) {
      return "http://saltmarshrunning.com/wp-content/uploads/2014/09/bananasf.jpg";
    } else if (type.equals("Hamburger")) {
      return "http://www.myw-cms.it/amm/immagini/0002/prodotti/4543_imgscheda_hamburger-png.PNG";
    } else if (type.equals("Kersje")) {
      return "http://zzuurstok.weebly.com/uploads/4/8/0/9/48092421/s944366532639209522_p3_i1_w500.jpeg";
    } else {
      return "https://media3.giphy.com/media/njl60xjwgrkWY/200_s.gif";
    }
  }

}
