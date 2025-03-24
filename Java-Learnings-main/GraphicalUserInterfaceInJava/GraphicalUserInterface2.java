
import java.awt.Color;
import java.awt.Font;
import javax.swing.border.Border;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

class GraphicalUserInterface2{
    public static void main(String args[]) {
        JFrame f1 = new JFrame(); // obj of JFrame
        JLabel l1 = new JLabel(); // obj of JLabel
        Border border = BorderFactory.createLineBorder(Color.white, 4); // obj of border
        ImageIcon image = new ImageIcon("C:\\Users\\ACERP\\Downloads\\Java-Learnings-main\\Java-Learnings-main\\GraphicalUserInterfaceInJava\\image2.png");
        l1.setText("TS MID"); // text banata hai 
        l1.setIcon(image);// image set karta hai
        l1.setHorizontalTextPosition(JLabel.CENTER); //Text ki postition set karta hai
        l1.setForeground(Color.white); // sets fontcolor for the text
        l1.setFont(new Font("MV Boli",Font.BOLD,20)); // sets font for the image
        l1.setIconTextGap(20); // sets gap between text and image
        l1.setBackground(Color.black); // sets background color
        l1.setOpaque(true); // displays background color
        l1.setVerticalTextPosition(JLabel.TOP); // Text ki postition set karta hai
        l1.setBorder(border); // border set karta hai upar border ka object banana padta hai woh dekhlo
        l1.setVerticalAlignment(JLabel.CENTER); // icon + label set karta hai vertically
        l1.setHorizontalAlignment(JLabel.CENTER); // icon + label set karta hai horizontally
        //l1.setBounds(100,100,250,250); // yeh x y coordinates set karta hai aur baki ke do attributes width aur heigth set karte hai
        //f1.setLayout(null);
        f1.setTitle("J Labels");
        f1.setDefaultCloseOperation(f1.EXIT_ON_CLOSE);
        f1.setVisible(true);
        //f1.setSize(500, 500);
        f1.add(l1);
        f1.pack();// yeh last hona chahiye
    }
}