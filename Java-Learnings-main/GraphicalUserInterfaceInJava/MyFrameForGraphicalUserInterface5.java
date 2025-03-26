import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyFrameForGraphicalUserInterface5 extends JFrame {
    JButton b1 = new JButton();
    
    MyFrameForGraphicalUserInterface5(){
        ImageIcon image = new ImageIcon("C:\\Users\\ACERP\\Downloads\\Java-Learnings-main\\Java-Learnings-main\\GraphicalUserInterfaceInJava\\image5.jpg");
        JLabel label = new JLabel("Hii, Did you press the button ??");
        b1.setVerticalTextPosition(b1.BOTTOM);
        b1.setHorizontalTextPosition(b1.CENTER);
        b1.addActionListener(e -> label.setVisible(true));
        b1.setBounds(200,100,200,100);
        b1.setEnabled(true);
        b1.setText("Daba de Button");
        b1.setIcon(image);
        label.setVisible(false);
        label.setBounds(0,0,200,100);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(500,500);    
        this.setVisible(true);
        this.add(b1);
        this.add(label);
    }

    
}
