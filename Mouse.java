import java.awt.*;
import java.awt.event.*;
import java.applet.*;

/*<applet code=Mouse width=6 height=500>
</applet>*/
public class Mouse extends Applet implements MouseListener, MouseMotionListener {
    int X = 30, Y = 30;
    String msg = "MOUSE EVENTS";

    public void init() {
        addMouseListener(this);
        addMouseMotionListener(this);
        setBackground(Color.black);
        setForeground(Color.white);
    }

    public void mouseEntered(MouseEvent me) {
        msg = "MOUSE ENTERED";
        setBackground(Color.magenta);
        showStatus("Mouse Entered");
        repaint();
    }

    public void mouseExited(MouseEvent me) {
        msg = "MOUSE Extited";
        setBackground(Color.red);
        showStatus("Mouse Exited");
        repaint();
    }

    public void mousePressed(MouseEvent me) {
        msg = "MOUSE Pressed";
        setBackground(Color.yellow);
        showStatus("Mouse Pressed");
        repaint();
    }

    public void mouseReleased(MouseEvent me) {
        msg = "MOUSE Released";
        setBackground(Color.green);
        showStatus("Mouse Released");
        repaint();
    }

    public void mouseMoved(MouseEvent me) {
        msg = "MOUSE Moved";
        X = me.getX();
        Y = me.get();
        setBackground(Color.blue);
        showStatus("Mouse Moved");
        repaint();
    }

    public void mouseDreagged(MouseEvent me) {
        msg = "MOUSE Dragged";
        setBackground(Color.pink);
        showStatus("Mouse Dragged");
        repaint();
    }

    public void mouseClicked(MouseEvent me) {
        msg = "MOUSE Clicked";
        setBackground(Color.orange);
        showStatus("Mouse Clicked");
        repaint();
    }

    public void paint(Graphic g) {
        g.drawString(msg, X, Y);
    }
}