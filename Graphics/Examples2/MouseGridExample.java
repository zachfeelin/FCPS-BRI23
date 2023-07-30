/* In this file, we will be drawing a grid, then processing a mouse click to
   figure out which grid square the click occurred on.
   
   For a bonus, try to figure out how to handle the case where the grid doesn't
   start in the upper left corner of the screen.
 */

import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MouseGridExample extends JPanel implements MouseListener
{
  int rows = 5; // number of rows in the grid
  int cols = 6; // number of columns in the grid
  int boxSize = 50; // The size of each box in the grid

  //set the offsets for the grid
  int xOffset = 50; // The x offset of the grid
  int yOffset = 100; // The y offset of the grid
  
  // calculate the total height and width of the grid in pixels for convenience
  int gridHeight = rows*boxSize;
  int gridWidth = cols*boxSize;
  
  //set the initial x and y values to be off the grid
  int x = -1000; // which grid column we're on
  int y = -1000; // which grid row we're on

  public MouseGridExample()
  {
    addMouseListener(this);
    setFocusable(true);
  }
  
  public void paintComponent(Graphics g)
  {
    super.paintComponent(g);
    
    // Draw the horizontal lines
    for(int row = 0; row <= rows; row++)
    {
      g.drawLine(xOffset, row*boxSize + yOffset, gridWidth + xOffset, row*boxSize + yOffset);
    }
   
    // Draw the vertical lines
    for(int col = 0; col <= cols; col++)
    {
      g.drawLine( col*boxSize + xOffset, yOffset, col*boxSize + xOffset, gridHeight + yOffset);
    }
    
    g.setColor(Color.YELLOW);
    g.fillRect(x*boxSize+1 + xOffset, y*boxSize+1 + yOffset, boxSize-1, boxSize-1);
  }
  
  /* Required methods for MouseListener */
  public void mousePressed(MouseEvent e)
  {
    int button = e.getButton();
    if(button == MouseEvent.BUTTON1 && e.getX() < gridWidth + xOffset && e.getY() < gridHeight + yOffset && e.getX() > xOffset && e.getY() > yOffset)
    {
      x = e.getX()/boxSize - (xOffset/boxSize);
      y = e.getY()/boxSize - (yOffset/boxSize);
      System.out.println(x + " " + y);
    }
    repaint();
  }
  public void mouseReleased(MouseEvent e)
  {
  }
  public void mouseClicked(MouseEvent e)
  {
  }  
  public void mouseEntered(MouseEvent e)
  { 
  } 
  public void mouseExited(MouseEvent e)
  { 
  } 
}