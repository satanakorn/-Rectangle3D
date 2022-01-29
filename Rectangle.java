import java.awt.*;
import javax.swing.*;

public class Rectangle extends JPanel {
  Rectangle(){

  }

  protected void paintComponent(Graphics g){
    super.paintComponent(g); // clear the frame

    //first Rectangle i made name is Rectangle1
    g.drawLine(60, 35, 100, 35);
    g.drawLine(60, 35, 50, 50);
    g.drawLine(100, 35, 90, 50);
    g.drawLine(50, 50, 90, 50);
    //second Rectangle i made name is Rectangle2
    g.drawLine(50, 50, 50, 70);
    g.drawLine(50, 70, 90, 70);
    g.drawLine(90, 70, 90, 50);
    //third the Rectangle i made name is Rectangle3
    g.drawLine(90, 70, 100, 50);
    g.drawLine(100, 50, 100, 35);
    
   g.drawString("3 Kgs", 52, 65);

    g.drawString("coder camp", 150, 150);

  }
}