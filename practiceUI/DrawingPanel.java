import javax.swing.JPanel;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
/**
 * Write a description of class DrawingPanel here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DrawingPanel extends JPanel
{
    public DrawingPanel()
    {
        setBackground(Color.RED);
        addMouseListener(new MouseAdapter()
        {
            @Override
            public void mouseClicked(MouseEvent event)
            {
                System.out.println(String.format("Click at: %s, %s",event.getX(),event.getY()));;
            }
        });
    }
    @Override
    public void paint(Graphics g)
    {
        super.paint(g);
        g.setColor(Color.YELLOW);
        int xCenter = getWidth()/2;
        int yCenter = getHeight()/2;
        g.fillOval(xCenter-(150/2),yCenter-(150/2),150,150);
    }
}
