package tereshchenko_roman.myWindow;

import javafx.application.Application;
import javafx.stage.Stage;

public class MyWindow extends Application {

    public static void main(String[] args) {

        Application.launch(args);

    }
    @Override
    public void start(Stage primaryStage) throws Exception {

        primaryStage.setTitle("My window");
        primaryStage.setWidth(500);
        primaryStage.setHeight(300);
        primaryStage.show();


    }
}
