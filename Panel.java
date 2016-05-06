package sierpinski;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author benjamin
 */
public class Panel extends JPanel{
    
    Coordinates top;
    Coordinates left;
    Coordinates right;
    Coordinates current = new Coordinates();
    
    Panel(Coordinates top, Coordinates left, Coordinates right){
        
        this.top = top;
        this.left = left;
        this.right = right;
    }
    
    public void paintComponent(Graphics g){
        
        super.paintComponent(g);
        setBackground(Color.PINK);        
        g.setColor(Color.BLUE); 
        
        Coordinates target = new Coordinates();
              
        current.setY(top.getY());
        current.setX(top.getX());
          
        for (int i = 0; i < Constants.ITERATIONS; i++){
            int randomNumber = (int) (Math.random()*3);
            switch (randomNumber) {
                case 0: target = top;
                    break;
                case 1: target = left;
                    break;
                case 2: target = right;              
                    break;
                default:
                    break;
            }
                        
            current.setX( (int) ( (current.getX() - target.getX())/2 + target.getX()) );
            current.setY( (int) ( (current.getY() - target.getY())/2 + target.getY()) );        
            g.drawLine(current.getX(), current.getY(), current.getX(), current.getY());
        }
    }
}
