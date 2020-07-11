package JavaFx.Animation;

import javafx.animation.RotateTransition;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.PerspectiveCamera;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.paint.PhongMaterial;
import javafx.scene.shape.Box;
import javafx.scene.shape.Rectangle;
import javafx.scene.transform.Rotate;
import javafx.stage.Stage;
import javafx.util.Duration;

public class Cube3D extends Application{
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Box box = createCube();
        Group root = new Group();

        Rectangle background = new Rectangle(1000,1000);
        background.setFill(Color.web("#000000"));

        root.getChildren().addAll(background, box);

        PerspectiveCamera perspectiveCamera = new PerspectiveCamera();

        Scene scene = new Scene(root, 1000,1000);
        scene.setCamera(perspectiveCamera);

        primaryStage.setTitle("3D - C U B E");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private Box createCube(){
        Box box = new Box();
        box.setWidth(250);
        box.setHeight(250);
        box.setDepth(250);

        box.setTranslateX(500);
        box.setTranslateY(500);
        box.setTranslateZ(0);

        PhongMaterial material = new PhongMaterial();
        material.setSpecularColor(Color.RED);
        material.setDiffuseColor(Color.BLUE);

        box.setMaterial(material);

        Rotate xRotation = new Rotate(50, Rotate.X_AXIS);
        Rotate yRotation = new Rotate(50, Rotate.Y_AXIS);
        box.getTransforms().addAll(xRotation,yRotation);

        RotateTransition rt = new RotateTransition(Duration.millis(5000), box);
        //rt.setAxis(Rotate.X_AXIS);
        rt.setAxis(Rotate.Y_AXIS);
        rt.setByAngle(360);
        rt.setCycleCount(250);
        rt.play();

        return box;
    }
}