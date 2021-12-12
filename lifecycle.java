import java.applet.Applet;
import java.awt.Graphics;
import java.awt.*;

public class lifecycle extends Applet {
    public void init() {
        setBackground(Color.BLUE);
        System.out.println("init() called");
    }

    public void start() {
        System.out.println("start() called");
    }

    public void paint(Graphics g)
}
