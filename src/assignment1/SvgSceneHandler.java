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
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

/**
 *
 * @author alexp
 */
public class SvgSceneHandler implements Initializable {
    private Stage mstage;
    
    public void setStage(Stage stage) {
        mstage = stage;
    }
    
    @FXML ImageView code;
    @FXML TextField confirmationPrompt;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }
    
    public void buttonCodeHandler() {
        if (code.getOpacity() == 0) {
            code.setOpacity(1);
        } else {
            code.setOpacity(0.0);
        }
    }
    
    public void buttonBackHandler() throws IOException {
        confirmationPrompt.setOpacity(1);
        confirmationPrompt.setEditable(true);
        
        if (confirmationPrompt.getText().toLowerCase().contentEquals("y")) {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("MainScene.fxml"));
            Parent root = loader.load();
            MainSceneHandler controller = loader.getController();
            controller.setstage(mstage);
            Scene scene = new Scene(root);
            mstage.setScene(scene);
        }
        else if (confirmationPrompt.getText().toLowerCase().contentEquals("n")) {
            confirmationPrompt.setOpacity(0);
            confirmationPrompt.setEditable(false);
            confirmationPrompt.setText("");
        }
      
    }
}
