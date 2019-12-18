package JavaFx.Practice.Timer;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javafx.util.Duration;

//timer by github.com/demotivirus
public class TimerJavaFx_2 extends Application{

    Label hourse = new Label();
    Label minutes = new Label();
    Label seconds = new Label();

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        FlowPane root = new FlowPane();
        Scene scene = new Scene(root, 200,150);

        Label label = new Label("Work time: ");
        label.setFont(Font.font(32));

        NestedTimer nestedTimer = new NestedTimer();

        hourse.setFont(Font.font(32));

        minutes.setFont(Font.font(32));

        seconds.setFont(Font.font(32));

        root.getChildren().addAll(label, nestedTimer);
        root.setPadding(new Insets(10,10,10,10));
        root.setHgap(10);
        root.setVgap(10);

        primaryStage.setScene(scene);
        primaryStage.setTitle("Timer v.1.01 :)");
        primaryStage.show();
    }

    private class NestedTimer extends FlowPane{
        private int intSeconds = 0;
        private int intMinutes = 0;
        private int intHourse = 0;
        private String str = "";

        NestedTimer(){
            getChildren().addAll(seconds);
            Timeline animation = new Timeline(new KeyFrame(Duration.seconds(1), lambda -> timer()));
            animation.setCycleCount(Timeline.INDEFINITE);
            animation.play();
        }

        private void timer(){
            if (intHourse == 24)
                intHourse = 0;
            else if (intMinutes == 60){
                intMinutes = 0;
                intHourse++;
            }
            else if(intSeconds == 59){
                intSeconds = 0;
                intMinutes++;
            }
            else if (intSeconds >= 0){
                intSeconds++;
            }

            str = intHourse + "h " + intMinutes + "m " + intSeconds + "s";
            seconds.setText(str);
        }
    }
}
