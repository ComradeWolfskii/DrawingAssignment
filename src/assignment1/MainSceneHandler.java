/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment1;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

/**
 *
 * @author 6237975
 */
public class MainSceneHandler implements Initializable {
    @FXML Button b1;
    @FXML Button b2;
    @FXML HBox hb;
    
    private Stage mstage;
    public void setstage(Stage stage){
        mstage = stage;
    }
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }
    
    public void b1handler(){
        System.out.println("B1 initialized");
    }
    public void b2handler() throws IOException{
        System.out.println("B2 initialized");
        FXMLLoader loader = new FXMLLoader(getClass().getResource("ShearScene.fxml"));
        Parent root = loader.load();
        Scene scene = new Scene(root);
        mstage.setScene(scene);
    }
}
