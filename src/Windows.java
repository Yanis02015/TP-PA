import javax.swing.*;
import java.util.Calendar;

public class Windows extends JFrame {
    private JLabel horloge;
    public Windows() {
        this.setTitle("TP3 - PA");
        this.setSize(400, 400);
        this.setLocation(300,300);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);


        JButton addWindows = new JButton("New Window");

        addWindows.addActionListener(e -> new Windows().setVisible(true));

        horloge = new JLabel(this.configureTime());
        JPanel p = new JPanel();
        p.add(horloge);
        this.setContentPane(p);
        this.updateHorloge();
    }

    private String configureTime() {
        Calendar calendar = Calendar.getInstance();
        return calendar.get(Calendar.HOUR_OF_DAY) + ":" + calendar.get(Calendar.MINUTE) + ":" + calendar.get(Calendar.SECOND);
    }

    public void updateHorloge() {
        horloge.setText(configureTime());
    }

    public static void main(String[] args) throws InterruptedException {
        Windows w = new Windows();
        w.setVisible(true);
        while(true) {
            Thread.sleep(1000);
            w.updateHorloge();
        }
    }
}