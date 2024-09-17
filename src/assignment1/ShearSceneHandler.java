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
import javafx.scene.image.ImageView;
import javafx.scene.shape.Rectangle;
import javafx.scene.transform.Shear;
import javafx.stage.Stage;

/**
 *
 * @author 6237975
 */
public class ShearSceneHandler implements Initializable {
     private Stage mstage;
    public void setstage(Stage stage){
        mstage = stage;
    }
    @FXML Rectangle r2;
    @FXML Button bcode;
    @FXML Button bback;
    @FXML ImageView code;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        r2.setOpacity(.5);
        Shear shear = new Shear(0.5, 0.5); 
        r2.getTransforms().add(shear);
    }
    public void bcodehandler(){
        if (code.getOpacity() == 0){
            code.setOpacity(1);
        } else{
            code.setOpacity(0.0);
        }
    }
    public void bbackhandler() throws IOException{
        FXMLLoader loader = new FXMLLoader(getClass().getResource("MainScene.fxml"));
        Parent root = loader.load();
        MainSceneHandler controller = loader.getController();
        controller.setstage(mstage);
        Scene scene = new Scene(root);
        mstage.setScene(scene);
    }
    
}
