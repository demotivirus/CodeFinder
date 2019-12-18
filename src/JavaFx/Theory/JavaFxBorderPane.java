package JavaFx.Theory;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class JavaFxBorderPane extends Application{
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        BorderPane root = new BorderPane();
        Scene scene = new Scene(root, 500, 300);

        root.setPadding(new Insets(10,10,10,10));

        Button btnTop = new Button("Top");
        root.setPadding(new Insets(10, 200, 10, 10));
        BorderPane.setMargin(btnTop, new Insets(10,10,10,10));
        root.setTop(btnTop);

        Button btnLeft = new Button("Left");
        btnLeft.setPadding(new Insets(5, 5, 5, 5));
        root.setLeft(btnLeft);
        BorderPane.setMargin(btnLeft, new Insets(10, 10, 10, 10));

        Button btnCenter = new Button("Center");
        root.setPadding(new Insets(0));
        BorderPane.setAlignment(btnCenter, Pos.BOTTOM_CENTER);
        root.setCenter(btnCenter);

        Button btnDown = new Button("Down");
        root.setBottom(btnDown);
        root.setPadding(new Insets(5,5,5,5));

        BorderPane.setMargin(btnDown, new Insets(10, 10, 10, 10));

        primaryStage.setTitle("Border Pane");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
