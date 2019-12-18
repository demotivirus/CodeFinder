package JavaFx.Theory;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TitledPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class JavaFxTitledPane extends Application{
    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage primaryStage) throws Exception {
        TitledPane titledPane = new TitledPane();
        titledPane.setText("Java");

        VBox content = new VBox();

        content.getChildren().add(new Label("JavaFx tutorial"));
        content.getChildren().add(new Label("Java swing tutorial"));
        content.getChildren().add(new Label("Java IO tutorial"));

        titledPane.setContent(content);
        titledPane.setExpanded(true);

        VBox root = new VBox();
        root.setPadding(new Insets(5));
        root.getChildren().add(titledPane);

        Scene scene = new Scene(root, 500, 300);

        primaryStage.setScene(scene);
        primaryStage.setTitle("TitledPane");
        primaryStage.show();
    }
}
