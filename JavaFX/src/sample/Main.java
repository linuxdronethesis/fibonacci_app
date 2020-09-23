package sample;

import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.TilePane;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.util.Duration;

public class Main extends Application {

    private Parent createContent() {
        BorderPane borderPane = new BorderPane();
        Text myText = new Text("Fibonacci suite");
        borderPane.setCenter(myText);

        borderPane.setBottom(createBoutonPane(myText));

        return borderPane;
    }

    private Parent createBoutonPane(Text t) {
        TilePane pane = new TilePane();
        Button reset = new Button("Reset");
        pane.getChildren().add(reset);
        Button start = new Button("Start");
        startListener sl = new startListener(t, start);
        start.setOnMouseClicked(sl);
        reset.setOnMouseClicked(new resetListener(t, sl));
        pane.getChildren().add(start);
        return pane;
    }

        @Override
        public void start(Stage stage) throws Exception {
            stage.setScene(new Scene(createContent()));
            stage.show();
        }


    public static void main(String[] args) {
            launch(args);
        }
}
