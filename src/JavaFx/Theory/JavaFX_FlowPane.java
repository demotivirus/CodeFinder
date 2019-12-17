package JavaFx.Theory;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class JavaFX_FlowPane extends Application{
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        FlowPane root = new FlowPane();

        Button button = new Button("Лизни меня");

        Button button_2 = new Button("Press");
        button_2.setPrefSize(50,50);

        TextField textField = new TextField("Enter text: ");
        textField.setPrefWidth(100);

        CheckBox checkBox = new CheckBox("Check box");

        RadioButton radioButton = new RadioButton("Radio button");

        root.setPadding(new Insets(10,10,10,10));
        root.setHgap(10);
        root.setVgap(10);
        root.getChildren().addAll(button, button_2, textField, checkBox, radioButton);

        Scene scene = new Scene(root, 250, 300);

        primaryStage.setTitle("Demo program");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
