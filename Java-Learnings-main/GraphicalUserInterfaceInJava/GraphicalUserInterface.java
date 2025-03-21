import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

class GraphicalUserInterface {
    public static void main(String args[]) {
        JFrame f1 = new JFrame();
        f1.setTitle("My First J Frame");
        f1.setDefaultCloseOperation(f1.EXIT_ON_CLOSE);
        f1.setResizable(false);
        f1.setVisible(true);
        f1.setSize(500, 500);
        ImageIcon image = new ImageIcon("C:\\Users\\ACERP\\Downloads\\Java-Learnings-main\\Java-Learnings-main\\GraphicalUserInterfaceInJava\\image.png");
        f1.setIconImage(image.getImage());
        f1.getContentPane().setBackground(Color.black);
    }
}
