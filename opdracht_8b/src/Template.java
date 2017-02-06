//Importeren van gebruikte classes
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.*;
import javafx.animation.*;
import javafx.util.Duration;

public class Template extends Application{  //zorg dat de class overerft van Application

  public void start(Stage stage) {   //geef de stage mee als argument
    //creeer de "root node" Group
    Group rootNode = new Group();
    //Maak een nieuwe Scene met daarin de "root node" Group (verzameling nodes)
    Scene scene = new Scene(rootNode, 800, 600);
    //plaats de Scene op de Stage
    stage.setScene(scene);

    //inladen van een Image in een ImageView
    Image image = new Image("http://www.zombieplace.com/zombiecats/your-child-watched-too-many-zombie-movies.jpg", true);
    ImageView iv = new ImageView();
    iv.setImage(image);

    //De ImageView toevoegen aan de rootNode Group
    rootNode.getChildren().add(iv);

    //een extra group is optioneel als je meer groepen wilt hebben
    Group group1 = new Group();
    //plaats de extra groep in de root node
    rootNode.getChildren().add(group1);

    Circle circle = new Circle();
    circle.setCenterX(200.0f);
    circle.setCenterY(100.0f);
    circle.setRadius(100.0f);
    group1.getChildren().add(circle);

    //maak een button aan en plaats deze in de extra group
    Button button = new Button("ik ben een Butoooooooooooooooooooooooooooooooooon");
    button.relocate(50,50);
    group1.getChildren().add(button);

    TextField textField = new TextField();
    textField.relocate(50,80);
    group1.getChildren().add(textField);

    Slider slider = new Slider(0, 1, 0.5);
    slider.relocate(50,110);
    group1.getChildren().add(slider);

    TranslateTransition translate =
    new TranslateTransition(Duration.millis(750));
    translate.setToX(200);
    translate.setToY(400);

    FillTransition fill = new FillTransition(Duration.millis(750));
    fill.setToValue(Color.MAROON);

    ParallelTransition transition = new ParallelTransition(circle, translate, fill);
    transition.setCycleCount(Timeline.INDEFINITE);
    transition.setAutoReverse(true);
    transition.play();

    //laat de stage en inhoud renderen met de show() method
    stage.show();
  }
}
