package Model;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Responsibilities extends CRCcardField {
    public Responsibilities(Color color, double width, double height, String text) {
        super(color, width, height, text);
    }

    @Override
    public String toString() {
        return super.text;
    }

    public void draw(GraphicsContext gc) {
        gc.clearRect(100, 30, width, height);
        gc.setLineWidth(1.0);
        gc.setFill(color);
        gc.fillRoundRect(100, 30, width, height, 0, 0);
        gc.strokeRoundRect(100, 30, width, height, 0, 0);
        gc.strokeText(text, 110, 50);
    }
}

