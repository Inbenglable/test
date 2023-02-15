package swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


    public class swing2 extends JFrame {
private JTextField tfCount;
private JButton btnCount;
 private int count = 0;
 public swing2() {
     super("Our first Swing program");
     setLayout(new FlowLayout(FlowLayout.CENTER, 50, 0));
     setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
             add(new JLabel("Counter"));
             tfCount = new JTextField("0   ");
             tfCount.setEditable(true); add(tfCount);
             btnCount = new JButton("Count"); add(btnCount);
             btnCount.addActionListener(new ButtonClickListener());
             setSize(800, 600);
             setVisible(true);
             }
 public class ButtonClickListener implements ActionListener {
 public void actionPerformed(ActionEvent a) { ++count; tfCount.setText(count+"");}
 }
 public static void main(String[] args) {
     swing2 sc = new swing2();
 }
 }


