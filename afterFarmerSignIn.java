package chat;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


public class afterFarmerSignIn extends JFrame {
    
    JButton b1, b2, b3,b4;
    JFrame frame;
    afterFarmerSignIn()
    {
        frame = new JFrame("Login");
        frame.setSize(625,250);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);


        b1= new JButton("FAQ'S");
        b1.setBounds(80, 20, 450, 25);
        
        b2= new JButton("ASK QUESTIONS TO AN EXPERT THROUGH LIVE CHAT");
        b2.setBounds(80, 70, 450, 25);
        
        b3= new JButton("LOCATION");
        b3.setBounds(80, 120, 450, 25);
        
        b4= new JButton("HOME");
        b4.setBounds(230, 170, 150, 25);
        
        
        
        frame.getContentPane().add(b1);
        frame.getContentPane().add(b2);
        frame.getContentPane().add(b3);
        frame.getContentPane().add(b4);

        frame.setVisible(true);
        
        MyActionListener m = new MyActionListener();
        
        b1.addActionListener(m);
        b2.addActionListener(m);
        b3.addActionListener(m);
        b4.addActionListener(m);


        
    }
    public class MyActionListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            if (e.getSource()== b1)
            {
                frame.dispose();
                faq f = new faq();
                f.setVisible(true);
                
            }
            if (e.getSource()== b2)
            {
                frame.dispose();
                chat_client c1 = new chat_client();
                chat_server s1 = new chat_server();
                s1.setVisible(true);
                c1.setVisible(true);
                //editSellerData update = new editSellerData();
            }
                
            if (e.getSource()== b3)
            {
                frame.dispose();
                location l = new location();
                l.setVisible(true);
                
            }
            
            if (e.getSource()== b4)
            {
                frame.dispose();
                Start s = new Start();
            }

        }
    }
    public static void main(String[] args) {
        afterFarmerSignIn m = new afterFarmerSignIn();
    }
    
}
