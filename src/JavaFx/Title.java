package JavaFx;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Title extends Application{
    public static void main(String[] args){
        Application.launch();
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Group group = new Group();
        Scene scene = new Scene(group, 400, 400);

        primaryStage.setTitle("Test program");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
