package JavaFx.Animaion;

import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.TriangleMesh;
import javafx.stage.Stage;

public class RectangleAnimation extends Application{
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Rectangle rectangle = new Rectangle(200,200,200,200);
        rectangle.setFill(Color.web("#ff8000"));

        Rectangle background = new Rectangle(500,500);
        background.setFill(Color.web("#000000"));

        AnimationTimer timer = new AnimationTimer() {
            @Override
            public void handle(long now) {
                rectangle.setHeight(rectangle.getHeight() - 0.2);
                rectangle.setWidth(rectangle.getWidth() - 0.2);
                rectangle.setRotate(rectangle.getRotate() + 2);
                //rectangle.setX(rectangle.getWidth() - 1);
                //rectangle.setY(rectangle.getY() + 0.5);
            }
        };

        timer.start();

        Group root = new Group();

        root.getChildren().addAll(background, rectangle);

        primaryStage.setScene(new Scene(root, 500,500));
        primaryStage.show();
    }
}
