import javax.swing.JFrame;
/**
 * Write a description of class DrawingWindow here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

public class DrawingWindow extends JFrame
{
    public DrawingPanel panel;
    public DrawingWindow(String name)
    {
        super(name);
        panel = new DrawingPanel();
        getContentPane().add(panel);
    }
    public static void main(String args[])
    {
        DrawingWindow window = new DrawingWindow("Drawing Example");
        window.setSize(800,800);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);
    }
}
