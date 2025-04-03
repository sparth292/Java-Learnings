import javax.swing.*;

class RegistrationForm{

public static void main(String args[]){

       JFrame f1 = new JFrame("Register");
 
       JLabel l1 = new JLabel("Name : ");
       JLabel l2 = new JLabel("Email : "); 
       JLabel l3 = new JLabel("Password : "); 
       JLabel l4 = new JLabel("Address : ");
 
       JTextField t1 = new JTextField(10);       
       JTextField t2 = new JTextField(10);

       JTextArea txt1 = new JTextArea(10,3);

       JPanel p1 = new JPanel();
       JPanel p2 = new JPanel();
       JPanel p3 = new JPanel();
       JPanel p4 = new JPanel();
       JPanel p5 = new JPanel();

       JCheckBox chk1 = new JCheckBox("Java");
       JCheckBox chk2 = new JCheckBox("C++");       

       JPasswordField pass = new JPasswordField(10);

       JRadioButton r1 = new JRadioButton(" Male");
       JRadioButton r2 = new JRadioButton(" Female"); 
  
       ButtonGroup bg1 = new ButtonGroup();

       bg1.add(r1);
       bg1.add(r2);

       JButton b1 = new JButton("Submit");

       p1.add(l1);
       p2.add(l2);
       p3.add(l3);
       p1.add(t1);
       p2.add(t2);
       p3.add(pass);
       p4.add(r1);
       p4.add(r2);
       p5.add(chk1);
       p5.add(chk2);       
       

       p1.setBounds(7,10,177,30);
       p2.setBounds(7,40,177,30);
       p3.setBounds(7,70,200,30);
       p4.setBounds(7,100,135,30);
       p5.setBounds(7,130,110,30);
       l4.setBounds(7,160,100,30);
       txt1.setBounds(7,190,180,80);
       b1.setBounds(7,280,90,30);

       f1.add(p1);
       f1.add(p2);
       f1.add(p3);
       f1.add(p4);
       f1.add(p5);
       f1.add(l4);
       f1.add(txt1);
       f1.add(b1);

       f1.setSize(230,365);
       f1.setLayout(null);
       f1.setVisible(true);
       f1.setResizable(false);
       f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);       

}


}

