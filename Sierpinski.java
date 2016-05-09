
package sierpinski;

import java.awt.BorderLayout;
import javax.swing.JFrame;

/**
 *
 * @author benjamin
 */
public class Sierpinski {
        
    public static void main(String[] args) {
        AllPoints dataPoints = new AllPoints(Constants.TOP, Constants.LEFT, Constants.RIGHT); 

        JFrame frame = new JFrame("Sierpinski Fractal");      
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());      
        frame.setSize(Constants.FRAME_WIDTH, Constants.FRAME_HEIGHT);
        frame.add(new SierpinskiPanel(dataPoints.getPoints(), Constants.ITERATIONS));
        frame.setVisible(true);  
        
//        for(int i = 0; i < Constants.ITERATIONS; i++){
//            frame.remove(myPanel);
//            myPanel = new Panel(dataPoints.getPoints(), i);
//            frame.add(myPanel);
//            frame.revalidate();
//        } 
    }
}

