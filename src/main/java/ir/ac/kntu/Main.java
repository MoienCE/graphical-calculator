package ir.ac.kntu;

import ir.ac.kntu.gui.CalculatorGui;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;


public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) {

        CalculatorGui calculatorGui = new CalculatorGui();

        calculatorGui.setEventsHandlers();

        Pane fatherPane = new Pane();
        fatherPane.setPrefSize(400, 500);

        calculatorGui.addNodesToPane(fatherPane);

        Scene scene = new Scene(fatherPane);

        scene.setFill(Color.BLACK);
        stage.setScene(scene);
        stage.show();
    }
}