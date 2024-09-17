/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment1;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

/**
 *
 * @author 6237975
 */
public class MainSceneHandler implements Initializable {
    @FXML
    Button b1;
    @FXML
    Button b2;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }
    
    public void b1handler(){
        System.out.println("B1 initialized");
    }
    public void b2handler(){
        System.out.println("B2 initialized");
    }
}
