package ui;

import javafx.fxml.FXML;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;

public class SmileyFaceController {

    @FXML
    private Pane pane;
    
    @FXML
    void click(MouseEvent event) {
    	double x=event.getX();
    	double y=event.getY(); 
    	Rectangle s1=new Rectangle(x-30,y-35, 60, 20); 
    	Rectangle s2=new Rectangle(x-15,y-70, 30, 30); 
   
    
    	Circle cx = new Circle(event.getX(), event.getY(), 30); 
    	Circle cx1 = new Circle(x-12, y, 5); 
    	Circle cx2 = new Circle(x+12, y, 5); 
    	cx.setFill(javafx.scene.paint.Color.YELLOW);
    	pane.getChildren().add(cx); 
    	pane.getChildren().add(cx1); 
    	pane.getChildren().add(cx2); 
    	Line lx=new Line(); 
    	 
    	lx.setStartX(x-12);
    
    	lx.setStartY(y+15);
    	lx.setEndX(x+12);
    	lx.setEndY(y+ 15);
    	pane.getChildren().add(lx); 
    	pane.getChildren().add(s1); 
    	pane.getChildren().add(s2); 
    
    }

}
