/* This is a basic main method to be used with graphical applications.
   It can technically go in the same class as the Panel class, but we've
   separated it here for clarity.
 */
import java.security.Key;

import javax.swing.JFrame;

import javafx.scene.paint.Color;

public class GraphicsMainExample
{
  public static void main(String[] args)
  { 
    // Initialize the window
    JFrame frame = new JFrame("Graphics Examples");

    // Set the width and height of the window in pixels
    frame.setSize(800,600);
    
    // Make the program end when the window is closed
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    // Initialize the drawing canvas (replace BGPExample with the name of any
    // class that extends JPanel)

    AccelerationExample panel = new AccelerationExample(); 
    MouseExample panel2 = new MouseExample();
    ButtonExample panel3 = new ButtonExample();
    MouseGridExample panel4 = new MouseGridExample();
    AimTrainer panel5 = new AimTrainer();
    BasicImageEditor panel6 = new BasicImageEditor();
    CollisionExample panel7 = new CollisionExample();
    GravityExample panel8 = new GravityExample();
    

    // Add the drawing canvas to the window

    
    /* 1 */ //frame.add(panel); frame.setVisible(true); panel.mainLoop();
    /* 2 */ //frame.add(panel2); frame.setVisible(true); 
    /* 3 */ //frame.add(panel3); frame.setVisible(true);
    /* 4 */ //frame.setSize(417, 496); frame.add(panel4); frame.setVisible(true);
    /* 5 */ //frame.setSize(900, 700); frame.add(panel5); frame.setVisible(true);
    /* 6 */ //frame.add(panel6); frame.setVisible(true);
    /* 7 */ //frame.add(panel7); frame.setVisible(true); panel7.mainLoop();
    /* 8 */  frame.setSize(1900, 1000); frame.add(panel8); frame.setVisible(true); panel8.mainLoop();

    
    // Show the window when we are done with all of our initialization
    //frame.setVisible(true);
  }
}