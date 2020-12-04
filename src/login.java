import javax.swing.*;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class login {

    public static void main(String[] args) throws IOException {

        JFrame j = new JFrame();
        j.setSize(300, 400);
        JLabel l = new JLabel("Login");
        l.setBounds(50, 50, 100, 20);
        JLabel l1 = new JLabel("Username");
        l1.setBounds(50,80,100,20);
        JLabel l2 = new JLabel("Password");
        l2.setBounds(50, 130, 100, 20);
        JButton b = new JButton("login");
        b.setBounds(50, 175, 100, 30);
        JButton b1 = new JButton("Register");
        b1.setBounds(180,80,100,100);
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
        j.add(b1);
        j.setLayout(null);
        j.setVisible(true);
        j.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        Inventory.checkRAF(6, "type.txt");
        Inventory.checkRAF(5, "cookie.txt");    //check to see is text files have been created
        Inventory.checkRAF(3, "cup.txt");
        Inventory.checkRAF(9, "veg.txt");

        b.addActionListener(arg0 -> {
            try {
                LoginCheck(t.getText(), t1.getText(), j);       //checks the login
            } catch (IOException e) {
                e.printStackTrace();
            }
        });

        b1.addActionListener(arg0 -> {
            try {
                RegisterCheck();
            } catch (IOException e) {              //checks if login has been made
                e.printStackTrace();
            }
        });
    }

    static private void RegisterCheck() throws IOException {
        RandomAccessFile main = new RandomAccessFile("main.txt", "rw");
        if (main.length() == 0) {           //checks to see if file is empty
            Register.register();
        } else {
            JOptionPane.showMessageDialog(null, "ERROR: REGISTER ALREADY EXISTS");
        }
    }

    private static void LoginCheck(String log, String pass, JFrame j) throws IOException {
        RandomAccessFile main = new RandomAccessFile("main.txt", "rw");
        if (main.length() == 0) {           //checks to see if file is empty
            JOptionPane.showMessageDialog(null, "ERROR: REGISTER FIRST");
        } else {
            String log1 = String.valueOf(Inventory.getLine(0,"main.txt")); // gets username
            String pass1 = String.valueOf(Inventory.getLine(1,"main.txt")); // gets hashed password

            MessageDigest digest = null;
            try {
                digest = MessageDigest.getInstance("SHA-256"); // stets MessageDigest to SHA-256 hashing algorithm
            } catch (NoSuchAlgorithmException ex) {
                ex.printStackTrace();
            }
            assert digest != null;
            byte[] passHash = digest.digest(
                    pass.getBytes(StandardCharsets.UTF_8)); // gets byte array of hashed password
            String passHex = byteToHex(passHash); // switches from byte array to string value of hex

            if (pass1.equals(passHex) && log1.equals(log)) { // checks to see if hashed passwords match and usernames match
                j.setVisible(false);
                Menu.layout();
            } else {
                JOptionPane.showMessageDialog(null,"ERROR: INCORRECT LOGIN DETAILS");
            }

        }
    }

    static String byteToHex(byte[] hash) {
        StringBuilder hexBuilder = new StringBuilder();
        for (byte b : hash) {
            String hex = Integer.toHexString(0xff & b); //turns byte into hash string
            if (hex.length() == 1) {
                hexBuilder.append('0');
            }
            hexBuilder.append(hex);
        }
        return hexBuilder.toString(); // returns the hex as a string
    }
}
