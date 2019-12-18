package JavaFx.Theory;

import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;

//column ......
/*row .
      .
      .
*/

public class JavaFxGridPane extends Application{
    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage primaryStage) throws Exception {
        GridPane root = new GridPane();
        Scene scene = new Scene(root, 500, 500);

        root.setPadding(new Insets(20));
        root.setHgap(10);
        root.setVgap(10);

        Label title = new Label("Chat registration form");
        title.setFont(Font.font(32));
        root.add(title, 1, 0, 2,1);

        Label labelName = new Label("Name: ");
        labelName.setFont(Font.font(16));
        TextField fieldName = new TextField();
        GridPane.setHalignment(labelName, HPos.RIGHT);
        root.add(labelName, 0, 1);
        root.add(fieldName, 1, 1);

        Label labelPassword = new Label("Password: ");
        labelPassword.setFont(Font.font(16));
        TextField fieldPassword = new TextField();
        //GridPane.setHalignment(labelPassword, HPos.RIGHT);
        root.add(labelPassword, 0, 2);
        root.add(fieldPassword, 1, 2);

        Button loginButton = new Button("Login");
        loginButton.setFont(Font.font(12));
        TextField fieldLogin = new TextField();
        root.add(loginButton, 1, 3);
        GridPane.setHalignment(loginButton, HPos.RIGHT);

        primaryStage.setTitle("Grid Panel");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
