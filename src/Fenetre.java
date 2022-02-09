import javax.swing.*;
import java.util.Observable;
import java.util.Observer;

public class Fenetre extends JFrame implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        System.out.println("Updated : " + arg);
    }

    public static void main(String[] args) {

        JFrame frame = new JFrame();
        frame.setSize(200, 200);
        JLabel label = new JLabel("test");
        frame.setTitle("test");
        JPanel panel = new JPanel();
        panel.add(label);
        frame.setContentPane(panel);
        frame.setVisible(true);

        Fenetre f = new Fenetre();
        Horloge h = new Horloge();
        h.addObserver(f);
    }
}
