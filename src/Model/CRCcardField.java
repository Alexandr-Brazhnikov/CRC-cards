package Model;

import javafx.scene.paint.Color;

abstract class CRCcardField {
    Color color;
    double width;
    double height;
    String text;
    public abstract String toString();

    public CRCcardField(Color color, double width, double height, String text) {
        this.color = color;
        this.width = width;
        this.height = height;
        this.text = text;
    }
}
