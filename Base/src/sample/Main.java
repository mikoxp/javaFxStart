package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author moles
 */
public class Main extends Application {
    /**
     *
     * @param primaryStage primary stage is main scene(grafic_
     * @throws Exception wrong configuration
     */
    @Override
    public void start(Stage primaryStage) throws Exception{
        FXMLLoader loader=new FXMLLoader();
        loader.setLocation(this.getClass().getResource("window.fxml"));
        Controller controller=new Controller();
        loader.setController(controller);
        Parent root = loader.load();
        Scene scene=new Scene(root);
        scene.getStylesheets().add("styles/style.css");
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(scene);
        primaryStage.setResizable(false);
        primaryStage.show();
    }

    /**
     * runner
     * @param args args
     */
    public static void main(String[] args) {
        launch(args);
    }
}
