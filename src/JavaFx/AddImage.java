package JavaFx;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.io.FileInputStream;

public class AddImage extends Application{
    public static void main(String[] args) {
        Application.launch();
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        String fileName = "D:\\IdeaProjectGit\\CodeFinder\\src\\JavaFx\\Images\\JavaFX-Tutorial.jpg";
        Image image = new Image(new FileInputStream(fileName));
        ImageView imageView = new ImageView(image);

        imageView.setFitHeight(300);
        imageView.setFitWidth(500);

        Group group = new Group();
        Scene scene = new Scene(group, 500, 300);

        group.getChildren().addAll(imageView);

        primaryStage.setScene(scene);
        primaryStage.setTitle("Demo program");
        primaryStage.show();
    }
}
