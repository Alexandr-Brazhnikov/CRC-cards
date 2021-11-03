package sample;

import Model.ClassName;
import Model.Collaborators;
import Model.Responsibilities;
import javafx.event.ActionEvent;
import javafx.scene.canvas.Canvas;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.TextArea;

public class Controller {
    public ColorPicker colorPicker;
    public Canvas canvas;
    public TextArea textArea;

    public void classNameClicked(ActionEvent actionEvent) {
        ClassName className = new ClassName(colorPicker.getValue(), 400, 30, textArea.getText().split("\\r?\\n")[0] );
        className.draw(canvas.getGraphicsContext2D());
    }

    public void responsibilitiesClicked(ActionEvent actionEvent) {
        Responsibilities responsibilities = new Responsibilities(colorPicker.getValue(), 200, 100, textArea.getText());
        responsibilities.draw(canvas.getGraphicsContext2D());
    }

    public void collaboratorsClicked(ActionEvent actionEvent) {
        Collaborators collaborators = new Collaborators(colorPicker.getValue(), 200, 100, textArea.getText());
        collaborators.draw(canvas.getGraphicsContext2D());
    }

    public void clearClicked(ActionEvent actionEvent) {
        canvas.getGraphicsContext2D().clearRect(0, 0, 1000, 1000);
    }

    public void printClicked(ActionEvent actionEvent){

    }
}