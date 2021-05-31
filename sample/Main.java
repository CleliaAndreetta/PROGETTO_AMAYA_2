package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;


public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception, IOException{
        /*FXMLLoader loader = new FXMLLoader(getClass().getResource("sample.fxml"));
        Parent root = loader.load();
        primaryStage.setScene(new Scene(root));
        primaryStage.show();*/
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));

        Scene scene = new Scene(root);

        MouseEvent e = null;

        primaryStage.setTitle("Le scelte di Amaya");

        primaryStage.setScene(scene);
        primaryStage.setMaxWidth(900);
        primaryStage.setMaxHeight(506);
        primaryStage.setMinWidth(900);
        primaryStage.setMinHeight(543);



        primaryStage.setOnCloseRequest(event -> {
            Controller exit = new Controller();
            try {
                exit.exit(e);
                exit.no(e);
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }
            /*FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("close.fxml"));
            Parent r = null;
            try {
                r = fxmlLoader.load();
            } catch (IOException e) {
                e.printStackTrace();
            }
            Stage stage = new Stage();
            stage.initModality(Modality.APPLICATION_MODAL);
            stage.setTitle("Chiudi");
            stage.setScene(new Scene(r,300, 180));
            stage.showAndWait();*/
        });
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}