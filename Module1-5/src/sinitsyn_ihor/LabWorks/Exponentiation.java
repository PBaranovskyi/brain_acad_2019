package sinitsyn_ihor.LabWorks;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.math.BigDecimal;

public class Exponentiation extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        AnchorPane root = new AnchorPane();
        primaryStage.setTitle("Exponentiation calculator");
        primaryStage.setScene(new Scene(root, 450, 250));
        primaryStage.show();
        TextField firstField = new TextField("1");
        firstField.setPrefColumnCount(18);
        TextField secondField = new TextField("1");
        secondField.setPrefColumnCount(18);
        Label firstLabel = new Label("Введите число:");
        Label secondLabel = new Label("Введите степень:");
        String result = new String("Ваш результат: " + 1);
        Label thirdLabel = new Label(result);
        Button button1 = new Button("Посчитать");
        button1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                thirdLabel.setText("Ваш результат: " + calculate(Double.valueOf(firstField.getText()), Math.abs(Integer.valueOf(secondField.getText()))));
            }
        });
        AnchorPane.setTopAnchor(button1, 150.0);
        AnchorPane.setLeftAnchor(button1, 150.0);
        AnchorPane.setRightAnchor(button1, 150.0);
        AnchorPane.setBottomAnchor(button1, 50.0);

        AnchorPane.setTopAnchor(firstField, 50.0);
        AnchorPane.setLeftAnchor(firstField, 50.0);
        AnchorPane.setRightAnchor(firstField, 250.0);
        AnchorPane.setBottomAnchor(firstField, 170.0);

        AnchorPane.setTopAnchor(secondField, 50.0);
        AnchorPane.setLeftAnchor(secondField, 250.0);
        AnchorPane.setRightAnchor(secondField, 50.0);
        AnchorPane.setBottomAnchor(secondField, 170.0);

        AnchorPane.setTopAnchor(firstLabel, 20.0);
        AnchorPane.setLeftAnchor(firstLabel, 50.0);
        AnchorPane.setRightAnchor(firstLabel, 250.0);
        AnchorPane.setBottomAnchor(firstLabel, 200.0);

        AnchorPane.setTopAnchor(secondLabel, 20.0);
        AnchorPane.setLeftAnchor(secondLabel, 250.0);
        AnchorPane.setRightAnchor(secondLabel, 50.0);
        AnchorPane.setBottomAnchor(secondLabel, 200.0);

        AnchorPane.setTopAnchor(thirdLabel, 100.0);
        AnchorPane.setLeftAnchor(thirdLabel, 130.0);
        AnchorPane.setRightAnchor(thirdLabel, 120.0);
        AnchorPane.setBottomAnchor(thirdLabel, 100.0);
        root.getChildren().addAll(button1, firstField, secondField, firstLabel, secondLabel, thirdLabel);
    }

    public static void main(String[] args) {
        launch(args);
    }

    public static String calculate (double x, int y){
        BigDecimal result = BigDecimal.valueOf(x);
        for (int t = 1; t < y; t++) {
            result = result.multiply(BigDecimal.valueOf(x));
        }
        return result.toString();
    }
}