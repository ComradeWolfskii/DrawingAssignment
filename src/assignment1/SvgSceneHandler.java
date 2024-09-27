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
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.SVGPath;
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
    
    @FXML Pane pane;
    @FXML ImageView code;
    @FXML TextField confirmationPrompt;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        SVGPath svgPath = new SVGPath();
        String path = "M 50 100 C 20 100, 20 200, 50 200 L 150 200 C 120 200, 120 100, 150 100 Z";
        svgPath.setContent(path);
        svgPath.setStroke(Color.BLACK);
        svgPath.setFill(Color.CRIMSON);
        pane.getChildren().add(svgPath);
        
        pane.widthProperty().addListener((obs, oldWidth, newWidth) -> {
            double centerX = (newWidth.doubleValue() / 2) - (svgPath.getBoundsInLocal().getWidth() / 2);
            svgPath.setLayoutX(centerX - 25);
        });
        
        pane.heightProperty().addListener((obs, oldHeight, newHeight) -> {
            double centerY = (newHeight.doubleValue() / 2) - (svgPath.getBoundsInLocal().getHeight() / 2);
            svgPath.setLayoutY(centerY - 150);
        });
    }
    
    public void buttonCodeHandler() {
        if (code.getOpacity() == 0) {
            code.setOpacity(1);
        } else {
            code.setOpacity(0.0);
        }
        code.toFront();
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
