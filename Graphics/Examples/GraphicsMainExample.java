package Examples;
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
    JFrame frame = new JFrame();

    // Set the width and height of the window in pixels
    frame.setSize(1900,1000);
    
    // Make the program end when the window is closed
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    // Initialize the drawing canvas (replace BGPExample with the name of any
    // class that extends JPanel)

    BGPExample panel = new BGPExample();
    GraphicsMethodsExample panel2 = new GraphicsMethodsExample();
    GraphicsMethodsExample2 panel3 = new GraphicsMethodsExample2();
    CustomColorExample panel4 = new CustomColorExample();
    FontExample panel5 = new FontExample();
    FontMetricsExample panel6 = new FontMetricsExample();
    ImageLoadExample panel7 = new ImageLoadExample("Graphics/Examples/images/duck.jpg");
    ImageCreationExample panel8 = new ImageCreationExample();
    AnimationExample panel9 = new AnimationExample();
    KeyboardExample panel10 = new KeyboardExample();
    BetterKeyboardExample panel11 = new BetterKeyboardExample();
    EvenBetterKeyboardExample panel12 = new EvenBetterKeyboardExample();  
    
    // Add the drawing canvas to the window

    //frame.add(panel); frame.setVisible(true);
    //frame.add(panel2); frame.setVisible(true);
    //frame.add(panel3); frame.setVisible(true);
    //frame.add(panel4); frame.setVisible(true);
    //frame.add(panel5); frame.setVisible(true);
    //frame.add(panel6); frame.setVisible(true);
    //frame.add(panel7); frame.setVisible(true);
    //frame.add(panel8); frame.setVisible(true);
    //frame.add(panel9); frame.setVisible(true); panel9.mainLoop();
    //frame.add(panel10); frame.setVisible(true);
    //frame.add(panel11); frame.setVisible(true); panel11.mainLoop();
    frame.add(panel12); frame.setVisible(true); panel12.mainLoop();

    
    // Show the window when we are done with all of our initialization
    //frame.setVisible(true);
  }
}