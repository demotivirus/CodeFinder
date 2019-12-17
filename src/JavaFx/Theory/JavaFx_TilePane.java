package JavaFx.Theory;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.TilePane;
import javafx.stage.Stage;

public class JavaFx_TilePane extends Application{
    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage primaryStage) throws Exception {
        TilePane root = new TilePane();
        Scene scene = new Scene(root, 400, 300);

        Button button = new Button("Java");
        Button button_2 = new Button("C++");
        Button button_3 = new Button("Python");
        Button button_4 = new Button("Go");
        Button button_5 = new Button("Assembler");

        button_2.setPrefSize(70, 50);

        root.setPadding(new Insets(10,10,10,10));
        root.setVgap(20);
        root.setHgap(20);
        root.getChildren().addAll(button, button_2, button_3, button_4, button_5);

        primaryStage.setTitle("Test program");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
