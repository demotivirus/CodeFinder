package JavaFx.Theory;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

import java.io.FileInputStream;

public class JavaFxLabel extends Application{
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        String fileName = "D:\\IdeaProjectGit\\CodeFinder\\src\\JavaFx\\Images\\java-icon-16.jpg";
        Image image = new Image(new FileInputStream(fileName));
        ImageView imageView = new ImageView(image);

        Label label = new Label("Text & icon");
        label.setGraphic(imageView);

        FlowPane root = new FlowPane();
        root.getChildren().addAll(label);

        Scene scene = new Scene(root, 500, 300);

        primaryStage.setTitle("Demo program");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
