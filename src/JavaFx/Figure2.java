package JavaFx;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.shape.ArcType;
import javafx.stage.Stage;

public class Figure2 extends Application{
    public static void main(String[] args) {
        Application.launch();
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Canvas canvas = new Canvas(300,500);
        GraphicsContext context = canvas.getGraphicsContext2D();
        drawShapes(context);

        Group group = new Group();
        group.getChildren().add(canvas);
        Scene scene = new Scene(group,300,500);

        primaryStage.setScene(scene);
        primaryStage.setTitle("Canvas test program");
        primaryStage.show();
    }

    private void drawShapes(GraphicsContext gc){
        gc.setFill(Color.BLUEVIOLET);
        gc.setStroke(Color.GRAY);
        gc.setLineWidth(1);

        gc.strokeLine(40,10,10,10);

        gc.fillOval(60, 30,30,30);
        gc.strokeOval(60,30,30,30);

        gc.fillArc(100,100,50,50,50,200, ArcType.OPEN);
        gc.fillArc(150,150,50,50,50,200, ArcType.ROUND);
        gc.fillArc(200,200,50,50,33,200, ArcType.CHORD);
    }
}
