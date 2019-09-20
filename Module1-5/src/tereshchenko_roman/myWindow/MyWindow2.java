package tereshchenko_roman.myWindow;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.control.Button;

import static javafx.scene.paint.Color.*;


public class MyWindow2 extends Application {

    public static void main(String[] args) {

        launch(args);

    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        primaryStage.setTitle("Window that changes colors");
        primaryStage.setWidth(500);
        primaryStage.setHeight(300);

        StackPane pane = new StackPane();
        Scene scene = new Scene(pane);
        primaryStage.setScene(scene);

        Button red = new Button("Paint to red");
        red.setTranslateY(-100);
        Button blue = new Button("Paint to blue");
        blue.setTranslateY(-50);
        Button yellow = new Button("Paint to yellow");
        yellow.setTranslateY(-50);
        Button green = new Button("Paint to green");
        blue.setTranslateY(50);

        red.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                pane.setBackground(new Background(new BackgroundFill(RED, CornerRadii.EMPTY, Insets.EMPTY)));
            }
        });

        blue.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                pane.setBackground(new Background(new BackgroundFill(BLUE, CornerRadii.EMPTY, Insets.EMPTY)));
            }
        });

        yellow.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                pane.setBackground(new Background(new BackgroundFill(YELLOW, CornerRadii.EMPTY, Insets.EMPTY)));
            }
        });

        green.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                pane.setBackground(new Background(new BackgroundFill(GREEN, CornerRadii.EMPTY, Insets.EMPTY)));
            }
        });


        pane.getChildren().add(red);
        pane.getChildren().add(blue);
        pane.getChildren().add(yellow);
        pane.getChildren().add(green);

        primaryStage.show();


    }

}

