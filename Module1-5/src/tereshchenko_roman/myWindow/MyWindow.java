package tereshchenko_roman.myWindow;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class MyWindow extends Application {

    public static void main(String[] args) {

        launch(args);

    }

    @Override
    public void start(Stage primaryStage) throws Exception {

//        primaryStage.setTitle("My window");
//        primaryStage.setWidth(500);
//        primaryStage.setHeight(300);
//        primaryStage.show();

        Button button = new Button();
        button.setText("Say hello to the world");

        button.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {

                Label label = new Label("Hello, world!");

                StackPane secondaryLayout = new StackPane();
                secondaryLayout.getChildren().add(label);

                Scene secondScene = new Scene(secondaryLayout, 230, 100);
// New window (Stage)
                Stage newWindow = new Stage();
                newWindow.setTitle("My new window");
                newWindow.setScene(secondScene);

                // Set position of second window, related to primary window.
                newWindow.setX(primaryStage.getX() + 100);
                newWindow.setY(primaryStage.getY() + 50);

                newWindow.show();
            }
        });

        StackPane root = new StackPane();
        root.getChildren().add(button);

        Scene scene = new Scene(root, 450, 250);

        primaryStage.setTitle("My window");
        primaryStage.setScene(scene);
        primaryStage.show();

    }
}
