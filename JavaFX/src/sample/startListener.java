package sample;

import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;
import javafx.util.Duration;

public class startListener implements EventHandler<MouseEvent> {

    public Fibonacci suite;
    private Text text;
    private Button button;
    private Timeline timeline;

    public startListener(Text t, Button b) {
        this.suite = new Fibonacci();
        this.text = t;
        this.button = b;
    }

    @Override
    public void handle(MouseEvent mouseEvent) {

        if (button.getText() == "Start") {
            text.setText(String.valueOf(suite.getNumber()));
            this.button.setText("Stop");
            this.timeline = new Timeline(new KeyFrame(Duration.millis(1000), e -> updateVisual()));
            this.timeline.setCycleCount(Animation.INDEFINITE); // loop forever
            this.timeline.play();
        }else if (button.getText() == "Stop") {
            text.setText("Fibonacci suite");
            this.timeline.stop();
            this.button.setText("Start");
            this.suite.reset();
        }

    }

    private void updateVisual() {
        this.suite.update();
        text.setText(String.valueOf(suite.getNumber()));
    }
}
