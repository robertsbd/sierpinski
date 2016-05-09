package sierpinski;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author benjamin
 */
public class SierpinskiPanel extends JPanel{

    private Coordinates points[];
    private int pointsToPrint;
    
    SierpinskiPanel(Coordinates points[], int numberOfPoints){
        this.points = points;
        this.pointsToPrint = numberOfPoints;
    }
    
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);    
        paintFrame(g);
    }
   
    public void paintFrame(Graphics g){   
        g.setColor(Color.BLACK);
        g.fillRect(0, 0, getWidth(), getHeight());
        g.setColor(Color.RED); 
        for(int i = 0; i < pointsToPrint; i++){
            g.drawLine(points[i].getX(), points[i].getY(), points[i].getX(), points[i].getY());
        }
    }    
}
