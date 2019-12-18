package JavaFx.Theory;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

import java.util.Observable;

public class JavaFxStackPane extends Application{

    private StackPane stackPane;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        stackPane = new StackPane();

        VBox root = new VBox();
        Scene scene = new Scene(root, 500,300);

        root.getChildren().addAll(stackPane);

        Label label = new Label("This is text");
        label.setPadding(new Insets(5,5,5,5));
        label.setFont(Font.font(24));
        label.setStyle("-fx-background-color: bisque");
        label.setVisible(false);
        stackPane.getChildren().add(label);

        Button button = new Button("This is button");
        button.setPadding(new Insets(5,5,5,5));
        //button.setStyle("-fx-background-color: azure");
        button.setFont(Font.font(24));
        button.setVisible(false);
        stackPane.getChildren().add(button);

        CheckBox checkBox = new CheckBox("This is CheckBox");
        checkBox.setPadding(new Insets(5,5,5,5));
        //checkBox.setStyle("-fx-background-color: azure");
        checkBox.setFont(Font.font(24));
        checkBox.setVisible(false);
        stackPane.getChildren().add(checkBox);

        stackPane.setPrefSize(300,200);
        stackPane.setStyle("-fx-background-color: floralwhite");

        root.setStyle("-fx-background-color: bisque");

        Button controlButton = new Button("Switch");
        controlButton.setFont(Font.font(16));
        VBox.setMargin(stackPane, new Insets(10,20,10,20));
        VBox.setMargin(controlButton, new Insets(10,10,10,10));
        root.getChildren().add(controlButton);
        root.setAlignment(Pos.CENTER);

        controlButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                startSwitch();
            }
        });

        primaryStage.setTitle("Stack pane");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void startSwitch(){
        ObservableList<Node> childs = this.stackPane.getChildren();

        if (childs.size() > 1){
            Node topNode = childs.get(childs.size() - 1);
            Node newTopNode = childs.get(childs.size() - 2);

            topNode.setVisible(false);
            topNode.toBack();

            newTopNode.setVisible(true);
        }
    }
}
