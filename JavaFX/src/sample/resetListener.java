package sample;

import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;


public class resetListener implements EventHandler<MouseEvent> {

    private Text text;
    private startListener startlistener;

    public resetListener(Text t, startListener sl) {
        this.text = t;
        this.startlistener = sl;
    }

    @Override
    public void handle(MouseEvent event) {
        this.startlistener.suite.reset();
        text.setText("0");
    }
}
