import javafx.application.Application;
import javafx.geometry.Orientation;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class TestJavaFx extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Test Java FX");

        FlowPane fp = new FlowPane(Orientation.VERTICAL);
        Scene scene = new Scene(fp, 300, 200);
        primaryStage.setScene(scene);

        Label l1 = new Label("Click button");
        Label l2 = new Label("Nothing");
        Button b1 = new Button("Click");
        b1.setOnAction(
                e -> { l2.setText("Clicked!"); }
        );
        fp.getChildren().addAll(l1, b1, l2);

        primaryStage.show();
    }
}
