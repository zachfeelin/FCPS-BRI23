import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Color;
public class DrawingAssignment extends JPanel
{
  public DrawingAssignment()
  {
  }
  
  public void paintComponent(Graphics g)
  {
    super.paintComponent(g);
    //pink background
    g.setColor(new Color(0xFF369B));
    g.fillRect(0,0,800,600);
    //blueish circle
    g.setColor(new Color(10, 50, 255));
    g.fillOval(300,200,200,200);
    //green square in top left area
    g.setColor(new Color(0, 255, 0));
    g.fillRect(150,100,200,200);
  }
}