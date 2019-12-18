package JavaFx.Practice;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javafx.util.Duration;

public class TimerJavaFx extends Application{
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Pane root = new Pane();
        NestedTimer timer = new NestedTimer();

        root.getChildren().add(timer);

        Scene scene = new Scene(root, 500, 500);

        primaryStage.setTitle("Timer");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    static class NestedTimer extends Pane{
        private Timeline animation;
        private int tmp = 60;
        private String str = "";

        Label label = new Label("60");

        private NestedTimer(){
            label.setFont(Font.font(64));
            label.setTranslateX(200);
            label.setTranslateY(200);

            getChildren().addAll(label);
            animation = new Timeline(new KeyFrame(Duration.seconds(1), lambda -> timer()));
            animation.setCycleCount(Timeline.INDEFINITE);
            animation.play();
        }

        private void timer(){
            if(tmp > 0)
                tmp--;
            str = tmp + "";
            label.setText(str);
        }
    }
}
