package JavaFx.Theory;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class JavaFXLabel2 extends Application{
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        String fileName = "D:\\IdeaProjectGit\\CodeFinder\\src\\JavaFx\\Images\\java-coffee-cup-logo.png";
        Image image = new Image(new FileInputStream(fileName));
        ImageView imageView = new ImageView(image);

        Label label = new Label("Text & icon");
        label.setGraphic(imageView);

        Label label_2 = new Label("Font & color");
        label_2.setFont(Font.font("Comic Sans MS", 32));
        label_2.setTextFill(Color.web("#CC00FF"));

        Label label_3 = new Label("Long text in program.......................................................");
        label_3.setMaxWidth(100);
        label_3.setWrapText(true);

        Label label_4 = new Label("Rotate 45 degrees text");
        label_4.setRotate(45);
        label_4.setFont(Font.font(16));
        label_4.setTranslateY(50);

        Label label_5 = new Label("ZOOM");

        label_5.setOnMouseEntered(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                label_5.setScaleX(2);
                label_5.setScaleY(2);
            }
        });

        label_5.setOnMouseExited(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                label_5.setScaleX(1);
                label_5.setScaleY(1);
            }
        });

        Button button = new Button("Click");
        newWindow(button, primaryStage);

        FlowPane root = new FlowPane();
        root.setPadding(new Insets(10));
        root.setHgap(25);
        root.setVgap(25);
        root.getChildren().addAll(label, label_2, label_3, label_4, label_5, button);

        Scene scene = new Scene(root, 500, 500);

        primaryStage.setTitle("Demo program");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public void newWindow(Button button, Stage primaryStage){
        button.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Stage newWindow = new Stage();

                String fileName = "D:\\IdeaProjectGit\\CodeFinder\\src\\JavaFx\\Images\\bumaga-myataya-fon.jpg";
                Image image = null;
                try {
                    image = new Image(new FileInputStream(fileName));
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                }
                ImageView imageView = new ImageView(image);

                Label secondLabel = new Label("This is new window");
                secondLabel.setFont(Font.font(32));
                //secondLabel.setTextFill(Color.web("#FF6633"));

                secondLabel.setOnMouseEntered(new EventHandler<MouseEvent>() {
                    @Override
                    public void handle(MouseEvent event) {
                        secondLabel.setScaleX(1.5);
                        secondLabel.setScaleY(1.5);
                    }
                });

                secondLabel.setOnMouseExited(new EventHandler<MouseEvent>() {
                    @Override
                    public void handle(MouseEvent event) {
                        secondLabel.setScaleX(1);
                        secondLabel.setScaleY(1);
                    }
                });

                StackPane secondWindow = new StackPane();
                Scene secondScene = new Scene(secondWindow, 500, 250);

                secondWindow.getChildren().addAll(imageView, secondLabel);

                newWindow.initModality(Modality.WINDOW_MODAL);
                newWindow.initOwner(primaryStage);

                newWindow.setX(primaryStage.getX() + 100);
                newWindow.setY(primaryStage.getY() + 100);

                newWindow.setTitle("Second window");
                newWindow.setScene(secondScene);
                newWindow.show();
            }
        });
    }
}
