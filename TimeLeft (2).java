import javax.swing.*;
import java.awt.*;
import java.util.Timer;
import java.util.TimerTask;

public class TimeLeft {
    public static void main(String[] args) {

        JFrame jtimeframe = new JFrame();
        JLabel jtimeLabel = new JLabel();
        jtimeframe.setLayout(new FlowLayout());
        jtimeframe.setBounds(500, 300, 400, 100);

        jtimeframe.add(jtimeLabel);
        jtimeframe.setVisible(true);

        Timer timer = new Timer();

        timer.scheduleAtFixedRate(new TimerTask() {
            int i = 60;

            public void run() {

                jtimeLabel.setText("Time you have left: " + i);
                i--;

                if (i < 0) {
                    timer.cancel();
                    jtimeLabel.setText("Time is Over. You lost!");
                }
            }
        }, 0, 1000);
    }
}