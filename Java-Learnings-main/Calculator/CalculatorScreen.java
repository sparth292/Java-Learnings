
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CalculatorScreen extends JFrame {
       
       public JTextField t1 = new JTextField();
       
       

       String s;

       String processedNumberString;
       
       JButton b1 = new JButton("1");
       JButton b2 = new JButton("2");
       JButton b3 = new JButton("3");
       JButton b4 = new JButton("4");
       JButton b5 = new JButton("5");
       JButton b6 = new JButton("6");
       JButton b7 = new JButton("7");
       JButton b8 = new JButton("8");
       JButton b9 = new JButton("9");

       JButton addButton = new JButton("+");
       JButton subButton = new JButton("-");
       JButton mulButton = new JButton("*");
       JButton divButton = new JButton("/");
       JButton equalToButton = new JButton("=");
      
       JPanel p1 = new JPanel();
       JPanel p2 = new JPanel();
       JPanel p3 = new JPanel();
       JPanel p4 = new JPanel();

        CalculatorScreen() {

        t1.setEditable(false);
        

        p1.add(b1);
        p1.add(b2);
        p1.add(b3);
        p2.add(b4);
        p2.add(b5);
        p2.add(b6);
        p3.add(b7);
        p3.add(b8);
        p3.add(b9);

        p4.add(addButton);
        p4.add(subButton);
        p4.add(mulButton);
        p4.add(divButton);

        p1.setBounds(7,40,138,32);
        p2.setBounds(7,70,138,32);
        p3.setBounds(7,100,138,32);
        p4.setBounds(148,7,50,130);

        t1.setBounds(7,7,140,30);
        equalToButton.setBounds(7, 140, 185, 30);


        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(220,220);    
        this.setVisible(true);
        
        this.add(p4);
        this.add(p3);
        this.add(p2);
        this.add(p1);
        this.add(t1); 
        this.add(equalToButton);

        this.setTitle("CALC");
        this.setResizable(false);

       b1.addActionListener(new ActionListener() {
              @Override
              public void actionPerformed(ActionEvent e) {
                  t1.setText(t1.getText() + "1");
              }
          });
          
          
       b2.addActionListener((ActionListener) new ActionListener() {
              @Override
              public void actionPerformed(ActionEvent e) {
                  t1.setText(t1.getText() + "2");
              }
          });

       b3.addActionListener(new ActionListener() {
              @Override
              public void actionPerformed(ActionEvent e) {
                  t1.setText(t1.getText() + "3");
              }
          });
          
       b4.addActionListener((ActionListener) new ActionListener() {
              @Override
              public void actionPerformed(ActionEvent e) {
                  t1.setText(t1.getText() + "4");
              }
          });
       
       b5.addActionListener((ActionListener) new ActionListener() {
              @Override
              public void actionPerformed(ActionEvent e) {
                  t1.setText(t1.getText() + "5");
              }
       });   
          
       b6.addActionListener((ActionListener) new ActionListener() {
              @Override
              public void actionPerformed(ActionEvent e) {
                  t1.setText(t1.getText() + "6");
              }
          });

       b7.addActionListener(new ActionListener() {
              @Override
              public void actionPerformed(ActionEvent e) {
                  t1.setText(t1.getText() + "7");
              }
          });
          
       b8.addActionListener((ActionListener) new ActionListener() {
              @Override
              public void actionPerformed(ActionEvent e) {
                  t1.setText(t1.getText() + "8");
              }
          });

       b9.addActionListener(new ActionListener() {
              @Override
              public void actionPerformed(ActionEvent e) {
                  t1.setText(t1.getText() + "9");
              }
          });
          
       addButton.addActionListener((ActionListener) new ActionListener() {
              @Override
              public void actionPerformed(ActionEvent e) {
                  t1.setText(t1.getText() + "+");
              }
          });

       subButton.addActionListener(new ActionListener() {
              @Override
              public void actionPerformed(ActionEvent e) {
                  t1.setText(t1.getText() + "-");
              }
          });
          
       mulButton.addActionListener((ActionListener) new ActionListener() {
              @Override
              public void actionPerformed(ActionEvent e) {
                  t1.setText(t1.getText() + "*");
              }
          });
          
       divButton.addActionListener(new ActionListener() {
              @Override
              public void actionPerformed(ActionEvent e) {
                  t1.setText(t1.getText() + "/");
              }
          });
          
        equalToButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                s = t1.getText();
                char[] symbolArr = new char[s.length()]; // Ensure proper initialization
                int[] numberArr = new int[s.length()]; // Ensure proper initialization
                processedNumberString = "";
                int j = 0;
                
                for (int i = 0; i < s.length(); i++) {
                    char ch = s.charAt(i);
                    if (ch == '+' || ch == '-' || ch == '*' || ch == '/') {
                        symbolArr[j] = ch;
                        numberArr[j] = Integer.parseInt(processedNumberString);
                        j++;
                        processedNumberString = "";
                    } else {
                        processedNumberString += ch;
                    }
                }
                numberArr[j] = Integer.parseInt(processedNumberString);
                switchCaseLogic(symbolArr, numberArr);
            }
        });
      
}
// 45 62 47    + -

       void switchCaseLogic(char[] symbolArr,int[] numberArr){
       int[] numberHolder = new int[2];
       int result = 0;
       numberHolder[0] = numberArr[0]; // numberholder me gya 45
       for(int i = 0 ; i < symbolArr.length ; i++){
       char ch = symbolArr[i];
       numberHolder[1] = numberArr[i+1];  
       switch (ch) {
             
            case '+':
                
                System.out.println(numberHolder[0] + numberHolder[1]);
                result = numberHolder[0] + numberHolder[1];
                numberHolder[0] = result;
                t1.setText(Integer.toString(result));
                break;
            case '-':

                System.out.println(numberHolder[0] - numberHolder[1]);
                result = numberHolder[0] - numberHolder[1];
                numberHolder[0] = result;
                t1.setText(Integer.toString(result));
                break;

            case '*':

                System.out.println(numberHolder[0] * numberHolder[1]);
                result = numberHolder[0] * numberHolder[1];
                numberHolder[0] = result;
                t1.setText(Integer.toString(result));
                break;
            case '/':
            
                System.out.println(numberHolder[0] / numberHolder[1]);
                result = numberHolder[0] / numberHolder[1];
                numberHolder[0] = result;
                t1.setText(Integer.toString(result));
                break;    
            
            default:
                break;
           }

       }

        
    }

}

   
