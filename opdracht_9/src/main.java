import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class main extends Application {

    public void start(Stage stage){
        Group rootNode = new Group();
        Scene scene = new Scene(rootNode, 300, 100);
        stage.setScene(scene);

        Label label = new Label("Hello World!");
        label.relocate(118,45);

        rootNode.getChildren().add(label);

        stage.show();
    }
}
