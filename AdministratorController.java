/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package food_delivery;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author USER
 */
public class AdministratorController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void viewleaveapplicationmarketer(ActionEvent event) throws IOException {
           Parent scene2;
        scene2 = FXMLLoader.load(getClass().getResource("admincheckingmarketerleave.fxml"));
        Scene scene3 = new Scene(scene2);
        //Stage window = new Stage();
        //s2.setScene(scene2);  s2.show();
               
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        
        window.setScene(scene3);
        window.show();
    }

    @FXML
    private void viewoffer(ActionEvent event) throws IOException {
           Parent scene2;
        scene2 = FXMLLoader.load(getClass().getResource("viewmarketoffer.fxml"));
        Scene scene3 = new Scene(scene2);
        //Stage window = new Stage();
        //s2.setScene(scene2);  s2.show();
               
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        
        window.setScene(scene3);
        window.show();
    }

    @FXML
    private void backbuttononclick(ActionEvent event) throws IOException {
         Parent scene2;
        scene2 = FXMLLoader.load(getClass().getResource("Mainscene.fxml"));
        Scene scene3 = new Scene(scene2);
        //Stage window = new Stage();
        //s2.setScene(scene2);  s2.show();
               
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        
        window.setScene(scene3);
        window.show();
    }

    @FXML
    private void sendoffer(ActionEvent event) throws IOException {
           Parent scene2;
        scene2 = FXMLLoader.load(getClass().getResource("sendoffertores.fxml"));
        Scene scene3 = new Scene(scene2);
        //Stage window = new Stage();
        //s2.setScene(scene2);  s2.show();
               
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        
        window.setScene(scene3);
        window.show();
    }
    
}
