package sample;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Circle;
import java.net.URL;
import java.util.ResourceBundle;

/**
 *
 */
public class Controller {
    public Controller() {
        System.out.println("Controller start");
    }
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button button1;



    @FXML
    private Circle circle1;

    @FXML
    private Label label1;

    @FXML
    private ColorPicker colorpiker;

    /**
     * after construction turn on
     */
    @FXML
    void initialize() {
       System.out.println("Initializer start");
        label1.setText("Init action");
        EventHandler<ActionEvent> handler=new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Action button");
                label1.setText("Action Button");
            }
        };
        button1.addEventHandler(ActionEvent.ACTION,handler);
        EventHandler<ActionEvent> colorHandler=new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Paint paint=colorpiker.getValue();
                circle1.setFill(paint);
            }
        };
        colorpiker.addEventHandler(ActionEvent.ACTION,colorHandler);
    }



}
