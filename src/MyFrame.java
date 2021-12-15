import javax.swing.*;
import java.awt.*;
import java.time.LocalTime;


public class MyFrame extends JFrame {
    private int hour;
    private int minutes;
    private int seconds;
    private LocalTime time ;
    private JLabel label = new JLabel(); //you can set the label text here as well

    public MyFrame() {
        Utilitaries.setIcon(this, "images/clock.png");
        Utilitaries.setLookAndFeelWindows();
        Utilitaries.createNewJFrame(this, "This is a clock frame", JFrame.EXIT_ON_CLOSE,
               false, 700, 300, true, 240, 240, 240);

        while(true) {
            time = LocalTime.now();
            hour = time.getHour();
            minutes = time.getMinute();
            seconds = time.getSecond();

            label.setText(hour + " : " + minutes + " : " + seconds);
            label.setHorizontalAlignment(JLabel.CENTER);
            label.setFont(new Font(Font.SERIF, Font.BOLD, 100));
            this.add(label);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }






}
