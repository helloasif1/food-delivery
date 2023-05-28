/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package food_delivery;

import java.io.File;
import java.io.FileWriter;
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
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author USER
 */
public class ChattocustomerdelController implements Initializable {

    @FXML
    private TextField messagetorestaurant;
    @FXML
    private Button bananibutton1;
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
    private void sendmessagetorcustomer(ActionEvent event) {
             File f = null;
        FileWriter fw = null;
        FileChooser fc = null;
       
        try {
           
            f = new File("deltocustomer.txt");      
           
            if(f.exists()) fw = new FileWriter(f,true);
            else fw = new FileWriter(f);
           
            fw.write(
            	messagetorestaurant.getText()+"\n"
              
               
            );           
            
        } catch (IOException ex) {
            Logger.getLogger(Res_managerController.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if(fw != null) fw.close();
            } catch (IOException ex) {
                Logger.getLogger(Res_managerController.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
         Alert a = new Alert(Alert.AlertType.INFORMATION);
        a.setTitle("Information Alert");
        a.setHeaderText("Successful!!");
        a.setContentText("message has been sent successfully ");
        a.showAndWait();
    }

    @FXML
    private void Backbuttononclick(ActionEvent event) throws IOException {
          Parent scene2;
        scene2 = FXMLLoader.load(getClass().getResource("Rider.fxml"));
        Scene scene3 = new Scene(scene2);
        //Stage window = new Stage();
        //s2.setScene(scene2);  s2.show();
               
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        
        window.setScene(scene3);
        window.show();
    }

    @FXML
    private void viewmessagefromcustomer(ActionEvent event) {
          textarea.clear();
        File f = null;
        //FileReader fw = null;
        Scanner sc; String str; String[] tokens;
        try {
            f = new File("customertodel.txt");
            sc = new Scanner(f);
            if(f.exists()){
                textarea.appendText("Messages from customer\n");
                while(sc.hasNextLine()){
                    str=sc.nextLine();
                    tokens = str.split(",");
                    textarea.appendText(
                            "Message ="+tokens[0]+"\n"
                            
                                              
                    );
                }
            }
            else 
                textarea.setText("oops! Emp.txt does not exist...");
        } 
        catch (IOException ex) {
            Logger.getLogger(SendmessagetorestaurantController.class.getName()).log(Level.SEVERE, null, ex);
        } 
        finally {
        }        
    }
    
}
