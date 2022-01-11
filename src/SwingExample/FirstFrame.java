package SwingExample;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class FirstFrame extends JFrame {
    JLabel l1,l2,l3;
    JTextField t1,t2,t3,t4;

    public FirstFrame() {
        setLayout(null);

        l1 = new JLabel("Enter first Number");
        l2 = new JLabel("Enter second Number");

        t1 = new JTextField();
        t2 = new JTextField();

        l1.setBounds(10, 10, 130, 30);
        t1.setBounds(140, 10, 130, 30);

        add(l1);
        add(t1);
        setBounds(10,10,1000,1000);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
