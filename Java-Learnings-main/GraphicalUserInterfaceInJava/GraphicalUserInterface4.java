import javax.swing.*;

public class GraphicalUserInterface4 {
    public static void main(String args[]) {
        JFrame frame = new JFrame("Login");

        JLabel label1 = new JLabel("Name:");
        JLabel label2 = new JLabel("Password:");
        JLabel label3 = new JLabel("Address:");

        JTextField txt1 = new JTextField("Enter your name");
        JPasswordField pass = new JPasswordField("Enter your password",5);
        JTextArea txtArea = new JTextArea("Enter your address");

        label1.setBounds(50, 50, 100, 30);
        label2.setBounds(50, 100, 100, 30);
        label3.setBounds(50, 150, 100, 30);

        txt1.setBounds(150, 50, 200, 30);
        pass.setBounds(150, 100, 200, 30);
        txtArea.setBounds(150, 150, 200, 60);

        frame.add(label1);
        frame.add(txt1);
        frame.add(label2);
        frame.add(pass);
        frame.add(label3);
        frame.add(txtArea);

        frame.setSize(400, 300);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
