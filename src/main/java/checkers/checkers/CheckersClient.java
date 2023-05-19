package checkers.checkers;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class CheckersClient extends Application {

    private Stage primaryStage;
    private BorderPane rootLayout;

    @Override
    public void start(Stage primaryStage) {
        this.primaryStage = primaryStage;
        this.primaryStage.setTitle("Checkers Game");

        initRootLayout();
    }

    private void initRootLayout() {
        rootLayout = new BorderPane();
        Scene scene = new Scene(rootLayout, 800, 600);
        primaryStage.setScene(scene);
        BoardView boardView = new BoardView();
        rootLayout.setCenter(boardView);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
