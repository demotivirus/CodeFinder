package JavaFx.Theory;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class JavaFxAnchorPane extends Application{
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        AnchorPane root = new AnchorPane();
        Scene scene = new Scene(root, 500, 300);

        Button btnTop = new Button("Top button");
        Button btnLeft = new Button("Left button");
        Button btnRight = new Button("Right button");
        Button btnBottom = new Button("Bottom");

        AnchorPane.setTopAnchor(btnTop, 20.0);
        AnchorPane.setLeftAnchor(btnTop, 200.0);
        AnchorPane.setRightAnchor(btnTop, 200.0);

        AnchorPane.setTopAnchor(btnLeft, 80.0);
        AnchorPane.setLeftAnchor(btnLeft, 50.0);

        AnchorPane.setTopAnchor(btnRight, 80.0);
        AnchorPane.setRightAnchor(btnRight, 50.0);

        AnchorPane.setTopAnchor(btnBottom, 200.0);
        AnchorPane.setRightAnchor(btnBottom, 50.0);
        AnchorPane.setLeftAnchor(btnBottom, 50.0);
        AnchorPane.setBottomAnchor(btnBottom, 50.0);

        root.getChildren().addAll(btnTop, btnLeft, btnRight, btnBottom);

        primaryStage.setTitle("AnchorPane");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
