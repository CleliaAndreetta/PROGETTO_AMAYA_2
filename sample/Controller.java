package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;

public class Controller{

    @FXML
    private Button no;

    @FXML
    private TextField nome;

    String nomeInput;

    @FXML
    void onClick(MouseEvent event) throws IOException {
        Parent tableViewParent = FXMLLoader.load(getClass().getResource("introduzione.fxml"));
        System.out.println(nomeInput);
        Scene tableViewScene = new Scene(tableViewParent);
        //This line gets the Stage information
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(tableViewScene);
        window.showAndWait();
    }

    @FXML
    void vaiInizio1(MouseEvent event) throws IOException {
        Parent tableViewParent = FXMLLoader.load(getClass().getResource("inizio1.fxml"));
        Scene tableViewScene = new Scene(tableViewParent);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(tableViewScene);
        window.showAndWait();
    }

    @FXML
    void vaiInizio2(MouseEvent event) throws IOException {
        Parent tableViewParent = FXMLLoader.load(getClass().getResource("inizio2.fxml"));
        Scene tableViewScene = new Scene(tableViewParent);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(tableViewScene);
        window.showAndWait();
    }

    @FXML
    void vai3a(MouseEvent event) throws IOException {
        Parent tableViewParent = FXMLLoader.load(getClass().getResource("3a.fxml"));
        Scene tableViewScene = new Scene(tableViewParent);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(tableViewScene);
        window.showAndWait();
    }

    @FXML
    void vai3b(MouseEvent event) throws IOException {
        Parent tableViewParent = FXMLLoader.load(getClass().getResource("3b.fxml"));
        Scene tableViewScene = new Scene(tableViewParent);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(tableViewScene);
        window.showAndWait();
    }

    @FXML
    void vai4a(MouseEvent event) throws IOException {
        Parent tableViewParent = FXMLLoader.load(getClass().getResource("4a.fxml"));
        Scene tableViewScene = new Scene(tableViewParent);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(tableViewScene);
        window.showAndWait();
    }

    @FXML
    void vai4b1(MouseEvent event) throws IOException {
        Parent tableViewParent = FXMLLoader.load(getClass().getResource("4b1.fxml"));
        Scene tableViewScene = new Scene(tableViewParent);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(tableViewScene);
        window.showAndWait();
    }

    @FXML
    void vai4b2(MouseEvent event) throws IOException {
        Parent tableViewParent = FXMLLoader.load(getClass().getResource("4b2.fxml"));
        Scene tableViewScene = new Scene(tableViewParent);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(tableViewScene);
        window.showAndWait();
    }

    @FXML
    void vai5a(MouseEvent event) throws IOException {
        Parent tableViewParent = FXMLLoader.load(getClass().getResource("5a.fxml"));
        Scene tableViewScene = new Scene(tableViewParent);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(tableViewScene);
        window.showAndWait();
    }


    @FXML
    void vai5d(MouseEvent event) throws IOException {
        Parent tableViewParent = FXMLLoader.load(getClass().getResource("5d.fxml"));
        Scene tableViewScene = new Scene(tableViewParent);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(tableViewScene);
        window.showAndWait();
    }
    @FXML
    void vai5e(MouseEvent event) throws IOException {
        Parent tableViewParent = FXMLLoader.load(getClass().getResource("5e.fxml"));
        Scene tableViewScene = new Scene(tableViewParent);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(tableViewScene);
        window.showAndWait();
    }

    @FXML
    void vai5f(MouseEvent event) throws IOException {
        Parent tableViewParent = FXMLLoader.load(getClass().getResource("5f.fxml"));
        Scene tableViewScene = new Scene(tableViewParent);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(tableViewScene);
        window.showAndWait();
    }

    @FXML
    void vai6b(MouseEvent event) throws IOException {
        Parent tableViewParent = FXMLLoader.load(getClass().getResource("6b.fxml"));
        Scene tableViewScene = new Scene(tableViewParent);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(tableViewScene);
        window.showAndWait();
    }

    @FXML
    void vai7c(MouseEvent event) throws IOException {
        Parent tableViewParent = FXMLLoader.load(getClass().getResource("7c.fxml"));
        Scene tableViewScene = new Scene(tableViewParent);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(tableViewScene);
        window.showAndWait();
    }

    @FXML
    void vai8(MouseEvent event) throws IOException {
        Parent tableViewParent = FXMLLoader.load(getClass().getResource("8.fxml"));
        Scene tableViewScene = new Scene(tableViewParent);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(tableViewScene);
        window.showAndWait();

    }

    @FXML
    void vaiMorale1(MouseEvent event) throws IOException {
        Parent tableViewParent = FXMLLoader.load(getClass().getResource("morale1.fxml"));
        Scene tableViewScene = new Scene(tableViewParent);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(tableViewScene);
        window.showAndWait();
    }

    @FXML
    void vaiMorale2(MouseEvent event) throws IOException {
        Parent tableViewParent = FXMLLoader.load(getClass().getResource("morale2.fxml"));
        Scene tableViewScene = new Scene(tableViewParent);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(tableViewScene);
        window.showAndWait();
    }

    @FXML
    void vaiMorale3(MouseEvent event) throws IOException {
        Parent tableViewParent = FXMLLoader.load(getClass().getResource("morale3.fxml"));
        Scene tableViewScene = new Scene(tableViewParent);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(tableViewScene);
        window.showAndWait();
    }

    @FXML
    void home(MouseEvent event) throws IOException {
        Parent tableViewParent = FXMLLoader.load(getClass().getResource("sample.fxml"));
        Scene tableViewScene = new Scene(tableViewParent);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(tableViewScene);
        window.showAndWait();
    }

    @FXML
    void exit(MouseEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("close.fxml"));
        Parent root = fxmlLoader.load();
        Stage stage = new Stage();
        stage.initModality(Modality.APPLICATION_MODAL);
        stage.setTitle("Chiudi");
        stage.setScene(new Scene(root,300, 180));
        stage.showAndWait();
    }

    @FXML
    void no(MouseEvent event){
        Stage stage = (Stage) no.getScene().getWindow();
        stage.close();
    }

    @FXML
    void si(MouseEvent event) {
        System.exit(0);
    }

    //prende un parametro in input (sample)
    @FXML
    void nome(KeyEvent event) {
       nomeInput = (String) nome.getText();
    }
}


