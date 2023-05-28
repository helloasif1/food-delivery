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
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.chart.PieChart;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author USER
 */
public class SendmessagetorestaurantmanagerController implements Initializable {

    private TextField messagetorestaurantmanager;
    @FXML
    private Button bananibutton1;
    @FXML
    private Button generatepiechart;
    @FXML
    private PieChart piechart;
    @FXML
    private Label label;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
/*
    private void sendmessagetorestaurantmanager(ActionEvent event) {
              File f = null;
        FileWriter fw = null;
        FileChooser fc = null;
       
        try {
           
            f = new File("messagetorestaurantmanager.txt");      
           
            if(f.exists()) fw = new FileWriter(f,true);
            else fw = new FileWriter(f);
           
            fw.write(
            	messagetorestaurantmanager.getText()+"\n"
              
               
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
    }
*/
    @FXML
    private void Backbuttononclick(ActionEvent event) throws IOException {
           Parent scene3;
        scene3 = FXMLLoader.load(getClass().getResource("Marketer.fxml"));
        Scene scene4 = new Scene(scene3);
        //Stage window = new Stage();
        //s2.setScene(scene2);  s2.show();
               
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        
        window.setScene(scene4);
        window.show();
    }

    @FXML
    private void generatepiechart(ActionEvent event) {
        int banani = 0;
        
        

    try {
      File file = new File("bananires.txt");

      Scanner sc = new Scanner(file);

      while(sc.hasNextLine()) {
        sc.nextLine();
        banani++;
      }

      sc.close();
    } catch (Exception e) {
      e.getStackTrace();
    }
    int gulshan = 0;
    try {
      File file = new File("gulshanres.txt");

      Scanner sc = new Scanner(file);

      while(sc.hasNextLine()) {
        sc.nextLine();
        gulshan++;
      }

      sc.close();
    } catch (Exception e) {
      e.getStackTrace();
    }
    int bashundhara = 0;
    try {
      File file = new File("bashundharares.txt");

      Scanner sc = new Scanner(file);

      while(sc.hasNextLine()) {
        sc.nextLine();
        bashundhara++;
      }

      sc.close();
    } catch (Exception e) {
      e.getStackTrace();
    }
    ObservableList <PieChart.Data> list = FXCollections.observableArrayList(
            new PieChart.Data("Banani",banani),
            new PieChart.Data("Gulshan",gulshan),
            new PieChart.Data("bashundhara",bashundhara)
            
        );
        
        piechart.setData(list);
        
        for(PieChart.Data data: piechart.getData()){
            data.getNode().addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>(){
                @Override
                public void handle(MouseEvent event) {
                    label.setText(String.valueOf(data.getPieValue()));
                    //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                }
            }
            );
        }
  }
    }
    

