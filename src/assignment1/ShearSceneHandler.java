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
import javafx.scene.layout.Background;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Rectangle;
import javafx.scene.transform.Shear;

/**
 *
 * @author 6237975
 */
public class ShearSceneHandler implements Initializable {
    @FXML Rectangle r2;
    @FXML Button bcode;
    @FXML Button bback;
    @FXML Pane p;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        r2.setOpacity(.5);
        Shear shear = new Shear(0.5, 0.5); 
        r2.getTransforms().add(shear);
    }
    
}
