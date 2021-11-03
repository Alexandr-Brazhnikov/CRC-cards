package Model;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Collaborators extends CRCcardField {
    public Collaborators(Color color, double width, double height, String text) {

        super(color, width, height, text);
    }

    @Override
    public String toString() {

        return super.text;
    }

    public void draw(GraphicsContext gc) {
        gc.clearRect(300, 30, width, height);
        gc.setLineWidth(1.0);
        gc.setFill(color);
        gc.fillRoundRect(300, 30, width, height, 0, 0);
        gc.strokeRoundRect(300, 30, width, height, 0, 0);
        gc.strokeText(text, 310, 50);
    }
}

