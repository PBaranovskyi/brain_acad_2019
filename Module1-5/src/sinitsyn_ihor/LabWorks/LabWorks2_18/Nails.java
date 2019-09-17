package sinitsyn_ihor.LabWorks.LabWorks2_18;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import sinitsyn_ihor.LabWorks.LabWorks2_18.TestCore2;

public class Nails extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Nail shop");
        primaryStage.setWidth(814);
        primaryStage.setHeight(400);

        Pane root = new Pane();

        Button but1 = new Button();
        but1.setText("For 0.1$");
        but1.setTranslateX(26);
        but1.setTranslateY(100);
        but1.setStyle("-fx-background-color: lightGreen");
        but1.setPrefSize(60, 40);
        but1.setOnAction(event -> {
            TestCore2 myCore = new TestCore2(1);
            but1.setStyle("-fx-background-color: red");
        });

        Button but2 = new Button();
        but2.setText("For 0.2$");
        but2.setTranslateX(112);
        but2.setTranslateY(100);
        but2.setStyle("-fx-background-color: lightGreen");
        but2.setPrefSize(60, 40);
        but2.setOnAction(event -> {
            TestCore2 myCore = new TestCore2(2);
            but2.setStyle("-fx-background-color: red");
        });

        Button but3 = new Button();
        but3.setText("For 0.3$");
        but3.setTranslateX(198);
        but3.setTranslateY(100);
        but3.setStyle("-fx-background-color: lightGreen");
        but3.setPrefSize(60, 40);
        but3.setOnAction(event -> {
            TestCore2 myCore = new TestCore2(3);
            but3.setStyle("-fx-background-color: red");
        });

        Button but4 = new Button();
        but4.setText("For 0.4$");
        but4.setTranslateX(284);
        but4.setTranslateY(100);
        but4.setStyle("-fx-background-color: lightGreen");
        but4.setPrefSize(60, 40);
        but4.setOnAction(event -> {
            TestCore2 myCore = new TestCore2(4);
            but4.setStyle("-fx-background-color: red");
        });

        Button but5 = new Button();
        but5.setText("For 0.5$");
        but5.setTranslateX(370);
        but5.setTranslateY(100);
        but5.setStyle("-fx-background-color: lightGreen");
        but5.setPrefSize(60, 40);
        but5.setOnAction(event -> {
            TestCore2 myCore = new TestCore2(5);
            but5.setStyle("-fx-background-color: red");
        });

        Button but6 = new Button();
        but6.setText("For 0.6$");
        but6.setTranslateX(456);
        but6.setTranslateY(100);
        but6.setStyle("-fx-background-color: lightGreen");
        but6.setPrefSize(60, 40);
        but6.setOnAction(event -> {
            TestCore2 myCore = new TestCore2(6);
            but6.setStyle("-fx-background-color: red");
        });

        Button but7 = new Button();
        but7.setText("For 0.7$");
        but7.setTranslateX(542);
        but7.setTranslateY(100);
        but7.setStyle("-fx-background-color: lightGreen");
        but7.setPrefSize(60, 40);
        but7.setOnAction(event -> {
            TestCore2 myCore = new TestCore2(7);
            but7.setStyle("-fx-background-color: red");
        });

        Button but8 = new Button();
        but8.setText("For 0.8$");
        but8.setTranslateX(628);
        but8.setTranslateY(100);
        but8.setStyle("-fx-background-color: lightGreen");
        but8.setPrefSize(60, 40);
        but8.setOnAction(event -> {
            TestCore2 myCore = new TestCore2(8);
            but8.setStyle("-fx-background-color: red");
        });

        Button but9 = new Button();
        but9.setText("For 0.9$");
        but9.setTranslateX(714);
        but9.setTranslateY(100);
        but9.setStyle("-fx-background-color: lightGreen");
        but9.setPrefSize(60, 40);
        but9.setOnAction(event -> {
            TestCore2 myCore = new TestCore2(9);
            but9.setStyle("-fx-background-color: red");
        });

        Button buyAllBut = new Button();
        buyAllBut.setText("Click to buy all");
        buyAllBut.setTranslateX(330);
        buyAllBut.setTranslateY(250);
        buyAllBut.setStyle("-fx-background-color: lightBlue");
        buyAllBut.setPrefSize(140, 40);
        buyAllBut.setOnAction(event -> {
            System.out.println("You bought 4 different nails (0,1$+0,2$+0,3$+0,4$) and money left over: 0.0$");
            buyAllBut.setStyle("-fx-background-color: red");
        });

        Scene scene = new Scene(root);
        root.getChildren().addAll(buyAllBut, but1, but2, but3, but4, but5, but6, but7, but8, but9);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}