import javax.swing.*;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;


public class Register extends login {
    private String usr;
    private String pass;


    Register() throws FileNotFoundException {


        RandomAccessFile main = new RandomAccessFile("main.txt", "rw");

        JFrame j = new JFrame();
            j.setSize(300, 400);
            JLabel l = new JLabel("Register");
            l.setBounds(50, 50, 100, 20);
            JLabel l1 = new JLabel("Username");
            l1.setBounds(50,80,100,20);
            JLabel l2 = new JLabel("Password");
            l2.setBounds(50, 130, 100, 20);
            JButton b = new JButton("register");
            b.setBounds(50, 180, 100,20);
            JTextField t = new JTextField();
            t.setBounds(50,100,100,20);
            JTextField t1 = new JTextField();
            t1.setBounds(50,150,100,20);

            j.add(l);
            j.add(l1);
            j.add(l2);
            j.add(t);
            j.add(t1);
            j.add(b);
            j.setLayout(null);
            j.setVisible(true);
            j.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

            b.addActionListener(arg0 -> {
                this.pass = t1.getText();   //gets username and password for GUI
                this.usr = t.getText();

                String passHex = getHash(pass);

                try {
                    main.writeBytes(usr + "\n" + passHex);
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
                j.setVisible(false);
                new Menu();
            });
    }
}

