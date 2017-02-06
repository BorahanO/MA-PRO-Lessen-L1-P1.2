import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by e.henraat on 11-1-2017. Modified by Timo Heijne on 30-1-2017
 */
public class Main extends Application {

    public List<Integer> selectedSquare ;
    public Color[] randomColors = {Color.RED, Color.BLUE, Color.GREEN, Color.ALICEBLUE, Color.AQUA, Color.BLANCHEDALMOND, Color.KHAKI};

    public void start(Stage stage)
    {
        selectedSquare = new ArrayList<Integer>();

        Group root = new Group();
        stage.setScene(new Scene(root, 800, 600 ));
        stage.setTitle("Testing event handlers");

        Group rectGroup = new Group();
        Rectangle[] r = new Rectangle[5];
        for(int masteri = 0; masteri < r.length; masteri++) {
            final int thisSquare = masteri;
            r[masteri] = new Rectangle();
            r[masteri].setX(110 * masteri);
            r[masteri].setY(50);
            r[masteri].setWidth(100);
            r[masteri].setHeight(100);
            r[masteri].setArcWidth(20);
            r[masteri].setArcHeight(20);
            r[masteri].setFill(randomColors[new Random().nextInt(randomColors.length)]);
            r[masteri].addEventHandler(MouseEvent.MOUSE_CLICKED, (MouseEvent event) -> {
                if(event.isControlDown()) {
                    if(selectedSquare.contains(thisSquare)) {
                        for (int i = 0; i < selectedSquare.size(); i++) {
                            if(selectedSquare.get(i) == thisSquare) {
                                selectedSquare.remove(i);
                            }
                        }
                    } else {
                        selectedSquare.add(thisSquare);
                    }
                } else {
                    selectedSquare.clear();
                    selectedSquare.add(thisSquare);
                }

                for (int i = 0; i < r.length; i++) {
                    if(selectedSquare.contains(i)) {
                        r[i].setStroke(Color.BLACK);
                    } else {
                        r[i].setStroke(Color.TRANSPARENT);
                    }
                }
            });

            rectGroup.getChildren().add(r[masteri]);
        }

        r[0].setStroke(Color.BLACK);
        selectedSquare.add(0);
        root.getChildren().add(rectGroup);

        Button[] buttons = new Button[4];

        buttons[0] = new Button("Turn Left");
        buttons[0].relocate(0,300);
        buttons[0].addEventHandler(MouseEvent.MOUSE_CLICKED, (MouseEvent event) ->{
            for (Integer aSelectedSquare : selectedSquare) {
                r[aSelectedSquare].setRotate(r[aSelectedSquare].getRotate() - 15);
            }
        });

        buttons[1] = new Button("Turn Right");
        buttons[1].relocate(70,300);
        buttons[1].addEventHandler(MouseEvent.MOUSE_CLICKED, (MouseEvent event) ->{
            for(int i = 0; i < selectedSquare.size(); i++) {
                r[selectedSquare.get(i)].setRotate(r[selectedSquare.get(i)].getRotate() + 15);
            }
        });

        buttons[2] = new Button("Scale up");
        buttons[2].relocate(150,300);
        buttons[2].addEventHandler(MouseEvent.MOUSE_CLICKED, (MouseEvent event) ->{
            for(int i = 0; i < selectedSquare.size(); i++) {
                r[selectedSquare.get(i)].setScaleX(r[selectedSquare.get(i)].getScaleX() + 0.1);
                r[selectedSquare.get(i)].setScaleY(r[selectedSquare.get(i)].getScaleY() + 0.1);
            }
        });

        buttons[3] = new Button("Scale Down");
        buttons[3].relocate(220,300);
        buttons[3].addEventHandler(MouseEvent.MOUSE_CLICKED, (MouseEvent event) ->{
            for(int i = 0; i < selectedSquare.size(); i++) {
                r[selectedSquare.get(i)].setScaleX(r[selectedSquare.get(i)].getScaleX() - 0.1);
                r[selectedSquare.get(i)].setScaleY(r[selectedSquare.get(i)].getScaleY() - 0.1);
            }
        });

        //Add all buttons to a group
        Group buttonGroup = new Group();
        for(int i=0;i<buttons.length;i++){
            buttonGroup.getChildren().add(buttons[i]);
        }

        root.getChildren().add(buttonGroup);

        stage.show();
    }
}
