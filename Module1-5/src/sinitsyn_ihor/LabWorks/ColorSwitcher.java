package sinitsyn_ihor.LabWorks;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class ColorSwitcher extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        //Parent root = FXMLLoader.load(getClass().getResource("sampleApplication.fxml"));
        AnchorPane root = new AnchorPane();
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 450, 250));
        primaryStage.show();
        Button button1 = new Button("Red");
        Button button2 = new Button("Green");
        Button button3 = new Button("Blue");
        Button button4 = new Button("Yellow");
        Button button5 = new Button("Default");
        button1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                primaryStage.setTitle("Red");
                root.setStyle("-fx-background-color: red");
            }
        });
        button2.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                primaryStage.setTitle("Green");
                root.setStyle("-fx-background-color: green");
            }
        });
        button3.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                primaryStage.setTitle("Blue");
                root.setStyle("-fx-background-color: blue");
            }
        });
        button4.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                primaryStage.setTitle("Yellow");
                root.setStyle("-fx-background-color: yellow");
            }
        });
        button5.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                primaryStage.setTitle("Hello World");
                root.setStyle("-fx-background-color: derive(#ececec, 26.4%)");
            }
        });

        AnchorPane.setTopAnchor(button1, 50.0);
        AnchorPane.setLeftAnchor(button1, 50.0);
        AnchorPane.setRightAnchor(button1, 300.0);
        AnchorPane.setBottomAnchor(button1, 150.0);

        AnchorPane.setTopAnchor(button2, 50.0);
        AnchorPane.setLeftAnchor(button2, 300.0);
        AnchorPane.setRightAnchor(button2, 50.0);
        AnchorPane.setBottomAnchor(button2, 150.0);

        AnchorPane.setTopAnchor(button3, 150.0);
        AnchorPane.setLeftAnchor(button3, 50.0);
        AnchorPane.setRightAnchor(button3, 300.0);
        AnchorPane.setBottomAnchor(button3, 50.0);

        AnchorPane.setTopAnchor(button4, 150.0);
        AnchorPane.setLeftAnchor(button4, 300.0);
        AnchorPane.setRightAnchor(button4, 50.0);
        AnchorPane.setBottomAnchor(button4, 50.0);

        AnchorPane.setTopAnchor(button5, 100.0);
        AnchorPane.setLeftAnchor(button5, 170.0);
        AnchorPane.setRightAnchor(button5, 170.0);
        AnchorPane.setBottomAnchor(button5, 100.0);

        root.getChildren().addAll(button1, button3, button2, button4, button5);
    }

    public static void main(String[] args) {
        launch(args);
    }
}