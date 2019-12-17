package JavaFx.Theory;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class NewWindow extends Application{
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        StackPane root = new StackPane();
        Scene scene = new Scene(root, 300, 500);
        Button button = new Button();

        button.setText("Next");
        root.getChildren().add(button);

        button.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Stage newWindow = new Stage();
                Label label = new Label("This is new label text");
                StackPane secondWindow = new StackPane();
                Scene secondScene = new Scene(secondWindow, 186,115);

                secondWindow.getChildren().add(label);

                //Create "hard" window
                newWindow.initModality(Modality.WINDOW_MODAL);
                newWindow.initOwner(primaryStage);

                newWindow.setX(primaryStage.getX() + 200);
                newWindow.setY(primaryStage.getY() + 100);

                newWindow.setTitle("Second window");
                newWindow.setScene(secondScene);
                newWindow.show();
            }
        });

        primaryStage.setTitle("New window");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
