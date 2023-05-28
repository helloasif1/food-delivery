/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package food_delivery;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author USER
 */
public class ViewmarketofferController implements Initializable {

    @FXML
    private TextArea textarea;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void viewoffer(ActionEvent event) {
             textarea.clear();
        File f = null;
        //FileReader fw = null;
        Scanner sc; String str; String[] tokens;
        try {
            f = new File("marketoffer.txt");
            sc = new Scanner(f);
            if(f.exists()){
                textarea.appendText("Proposed Market Offers \n");
                while(sc.hasNextLine()){
                    str=sc.nextLine();
                    tokens = str.split(",");
                    textarea.appendText(
                            "Offer type ="+tokens[0]
                            +", Offer in details ="+tokens[1]+"\n"
                            
                                              
                    );
                }
            }
            else 
                textarea.setText("oops! Emp.txt does not exist...");
        } 
        catch (IOException ex) {
            Logger.getLogger(CustomerGulshanController.class.getName()).log(Level.SEVERE, null, ex);
        } 
        finally {
        }        
    }

    @FXML
    private void backbuttononclick(ActionEvent event) throws IOException {
           Parent scene3;
        scene3 = FXMLLoader.load(getClass().getResource("administrator.fxml"));
        Scene scene4 = new Scene(scene3);
        //Stage window = new Stage();
        //s2.setScene(scene2);  s2.show();
               
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        
        window.setScene(scene4);
        window.show();
    }
    
}
