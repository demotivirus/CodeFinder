package JavaFx.Theory;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Figures extends Application{
    public static void main(String[] args) {
        Application.launch();
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Group group = new Group();
        Scene scene = new Scene(group, 300, 500);

        Line line = new Line(0, 0, 100, 100);
        line.setStroke(Color.RED);
        line.setStrokeWidth(10);
        group.getChildren().add(line);

        Ellipse ellipse = new Ellipse(300, 0, 100, 100);
        ellipse.setFill(Color.GRAY);
        ellipse.setStroke(Color.BLUEVIOLET);
        group.getChildren().add(ellipse);

        Rectangle rectangle = new Rectangle(0, 300, 100, 100);
        rectangle.setFill(Color.AQUA);
        group.getChildren().add(rectangle);

        Text text = new Text(24, 200, "Text in the program");
        text.setFont(Font.font(16));
        group.getChildren().add(text);

        primaryStage.setTitle("Figures");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
