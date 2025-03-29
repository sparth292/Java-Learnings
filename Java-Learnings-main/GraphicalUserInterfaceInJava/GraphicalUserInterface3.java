import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GraphicalUserInterface3{
    public static void main(String args[]){
        JPanel p2 = new JPanel();
    
        JLabel l1 = new JLabel();
    
        ImageIcon image = new ImageIcon("C:\\Users\\ACERP\\Downloads\\Java-Learnings-main\\Java-Learnings-main\\GraphicalUserInterfaceInJava\\image.png");
        
        l1.setText("Hii");
        l1.setIcon(image);
        l1.setVerticalAlignment(JLabel.TOP);
        l1.setHorizontalAlignment(JLabel.RIGHT);
        p2.setBackground(Color.blue);
        p2.setBounds(250,250,250,250);
        JPanel p1 = new JPanel();
        
        p1.setBounds(0,0,250,250);
        p1.setBackground(Color.red);
        p1.add(l1);
        
        JFrame f1 = new JFrame("Parth Ki JFrame");
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f1.setLayout(null);
        f1.setSize(550,550);
        f1.setVisible(true);
        f1.add(p1);
        f1.add(p2);
    
    }
}
