package JavaFx;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Layout extends Application{
    public static void main(String[] args) {
        Application.launch();
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Group group = new Group();
        Scene scene = new Scene(group, 300, 500);
        BorderPane borderPane = new BorderPane();

        borderPane.setCenter(new Button("Click"));
        borderPane.setMinWidth(300);
        borderPane.setMinHeight(500);

        group.getChildren().addAll(borderPane);

        HBox hBox = new HBox();
        hBox.getChildren().addAll(new Button("One"), new Button("Two"));
        hBox.setSpacing(5);
        hBox.setPadding(new Insets(5));

        group.getChildren().addAll(hBox);

        primaryStage.setScene(scene);
        primaryStage.setTitle("Demo program");
        primaryStage.show();
    }
}
