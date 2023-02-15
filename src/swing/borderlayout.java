package swing;
import javax.swing.*;
import java.awt.*;

public class borderlayout  extends JFrame {
 private JButton btnNorth, btnSouth,  btnEast, btnWest,btnCenter;

         public borderlayout() {
             super("Border Layout只能分成五块");
             setLayout(new BorderLayout(10,10));
             btnNorth = new JButton("North"); add(btnNorth, BorderLayout.NORTH);
             btnSouth = new JButton("South"); add(btnSouth, BorderLayout.SOUTH);
             btnCenter = new JButton("Center"); add(btnCenter, BorderLayout.CENTER);
             btnEast = new JButton("East"); add(btnEast, BorderLayout.EAST);
             btnWest = new JButton("West"); add(btnWest, BorderLayout.WEST);
             }

         public static void main(String[] args) {

             borderlayout sc = new borderlayout();
             sc.setVisible(true);
             sc.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
             sc.setSize(400, 200);
         }
 }


