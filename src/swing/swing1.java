package swing;
import javax.swing.*;
import java.awt.*;

public class swing1 extends JFrame {
private JTextField num;
private JButton btnCount;
 private int count = 0;
 public swing1() {
        setLayout(new FlowLayout(FlowLayout.LEFT, 50, 0));
        add(new JLabel("Counter"));
     num = new JTextField("0");
     num.setEditable(true);
     add(num);
         btnCount = new JButton("Count"); add(btnCount);
         }
    public static void main(String[] args) {
     swing1 sc = new swing1();
        sc.setVisible(true);
        sc.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
       sc.setSize(800, 600);
 }
}
