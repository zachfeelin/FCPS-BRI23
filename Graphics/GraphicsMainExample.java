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
    ImageLoadExample panel7 = new ImageLoadExample("Graphics/images/duck.jpg");
    ImageCreationExample panel8 = new ImageCreationExample();
    AnimationExample panel9 = new AnimationExample();
    KeyboardExample panel10 = new KeyboardExample();
    BetterKeyboardExample panel11 = new BetterKeyboardExample();  
    //Square panel12 = new Square(50, 50, 100, cyan);
    
    // Add the drawing canvas to the window

    //frame.add(panel);
    //frame.add(panel2);
    //frame.add(panel3);
    //frame.add(panel4);
    //frame.add(panel5);
    //frame.add(panel6);
    //frame.add(panel7);
    //frame.add(panel8);
    //frame.add(panel9);
    //frame.add(panel10);
    frame.add(panel11);
    //frame.add(panel12);
    
    // Show the window when we are done with all of our initialization
    frame.setVisible(true);

    //panel9.mainLoop();
    panel11.mainLoop();
  }
}