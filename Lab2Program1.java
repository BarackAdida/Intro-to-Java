import javax.swing.JFrame;
import java.awt.Point;
import javax.swing.JOptionPane;
public class Lab2Program1 {

    public static void main (String [] args) {
          
	javax.swing.JFrame window;

        window = new JFrame ();

        window.setSize(600,600);
        window.setTitle("My First Java Program in Lab");
        window.setVisible(true);
        java.awt.Point position;
        position = new Point(1100,700);
        window.setLocation(position);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JOptionPane.showMessageDialog(window, "CLICK OK to close me");
        System.exit(0);

    }
}