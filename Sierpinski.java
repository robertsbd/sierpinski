
package sierpinski;

import java.awt.BorderLayout;
import javax.swing.JFrame;

/**
 *
 * @author benjamin
 */
public class Sierpinski {
        
    public static void main(String[] args) {
        JFrame frame = new JFrame();      
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());
        frame.add(new Panel(Constants.TOP, Constants.LEFT, Constants.RIGHT));
        frame.setSize(Constants.FRAME_WIDTH, Constants.FRAME_HEIGHT);
        frame.setVisible(true);      
    }
}

