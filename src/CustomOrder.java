import javax.swing.*;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class CustomOrder extends addInventory {

    static void addCustomOrder() throws FileNotFoundException {

        JFrame j = new JFrame("Custom Order");
        j.setSize(350, 300);
        JLabel l = new JLabel("Choc Chip");
        l.setBounds(50, 50, 100, 20);
        JLabel l1 = new JLabel("Double Choc");
        l1.setBounds(50, 75, 100, 20);
        JLabel l2 = new JLabel("Ras Cheese");
        l2.setBounds(50, 100, 100, 20);
        JLabel l3 = new JLabel("White Chip");
        l3.setBounds(50, 125, 100, 20);
        JLabel l4 = new JLabel("Rainbow");
        l4.setBounds(50,150,100,20);
        JLabel l5 = new JLabel("0.3 l");
        l5.setBounds(170, 50, 100, 20);
        JLabel l6 = new JLabel("0.4 l");
        l6.setBounds(170, 75, 100, 20);
        JLabel l7 = new JLabel("0.5 l");
        l7.setBounds(170, 100, 100, 20);
        JTextField t = new JTextField();
        t.setBounds(125,50,35,20);
        JTextField t1 = new JTextField();
        t1.setBounds(125,75,35,20);
        JTextField t2 = new JTextField();
        t2.setBounds(125,100,35,20);
        JTextField t3 = new JTextField();
        t3.setBounds(125,125,35,20);
        JTextField t4 = new JTextField();
        t4.setBounds(125,150,35,20);
        JTextField t5 = new JTextField();
        t5.setBounds(200,50,35,20);
        JTextField t6 = new JTextField();
        t6.setBounds(200,75,35,20);
        JTextField t7 = new JTextField();
        t7.setBounds(200,100,35,20);
        JButton b = new JButton("Save");
        b.setBounds(200, 200, 100, 50);

        j.add(l);
        j.add(l1);
        j.add(l2);
        j.add(l3);
        j.add(l4);
        j.add(l5);
        j.add(l6);
        j.add(l7);
        j.add(t);
        j.add(t1);
        j.add(t2);
        j.add(t3);
        j.add(t4);
        j.add(t5);
        j.add(t6);
        j.add(t7);
        j.add(b);
        j.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        j.setLayout(null);
        j.setVisible(true);


        RandomAccessFile cookie = new RandomAccessFile("cookie.txt", "rw");
        RandomAccessFile cup = new RandomAccessFile("cup.txt", "rw");

        b.addActionListener(arg0 -> {

            if (!t.getText().isEmpty()) {
                try {
                    cookie.seek(position(0,"cookie.txt"));
                    try {
                        Integer i = Integer.parseInt(cookie.readLine()) - Integer.parseInt(t.getText());
                        addInv(i, 0, "cookie.txt");
                    } catch (NumberFormatException ignored) {}
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            if (!t1.getText().isEmpty()) {
                try {
                    cookie.seek(position(1,"cookie.txt"));
                    try {Integer i = Integer.parseInt(cookie.readLine()) - Integer.parseInt(t1.getText());
                        addInv(i, 1, "cookie.txt");
                    } catch (NumberFormatException ignored) {}
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            if (!t2.getText().isEmpty()) {
                try {
                    cookie.seek(position(2,"cookie.txt"));
                    try {
                        Integer i = Integer.parseInt(cookie.readLine()) - Integer.parseInt(t2.getText());
                        addInv(i, 2, "cookie.txt");
                    } catch (NumberFormatException ignored) {}
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            if (!t3.getText().isEmpty()) {
                try {
                    cookie.seek(position(3,"cookie.txt"));
                    try {
                        Integer i = Integer.parseInt(cookie.readLine()) - Integer.parseInt(t3.getText());
                        addInv(i, 3, "cookie.txt");
                    } catch (NumberFormatException ignored) {}
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            if (!t4.getText().isEmpty()) {
                try {
                    cookie.seek(position(4,"cookie.txt"));
                    try {
                        Integer i = Integer.parseInt(cookie.readLine()) - Integer.parseInt(t4.getText());
                        addInv(i, 4, "cookie.txt");
                    } catch (NumberFormatException ignored) {}
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            if (!t5.getText().isEmpty()) {
                try {
                    cup.seek(position(0,"cup.txt"));
                    try {
                        Integer i = Integer.parseInt(cup.readLine()) - Integer.parseInt(t5.getText());
                        addInv(i, 0, "cup.txt");
                    } catch (NumberFormatException ignored) {}
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            if (!t6.getText().isEmpty()) {
                try {
                    cup.seek(position(1,"cup.txt"));
                    try {Integer i = Integer.parseInt(cup.readLine()) - Integer.parseInt(t6.getText());
                        addInv(i, 1, "cup.txt");
                    } catch (NumberFormatException ignored) {}
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            if (!t7.getText().isEmpty()) {
                try {
                    cup.seek(position(2,"cup.txt"));
                    try {
                        Integer i = Integer.parseInt(cup.readLine()) - Integer.parseInt(t7.getText());
                        addInv(i, 2, "cup.txt");
                    } catch (NumberFormatException ignored) {}
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            j.setVisible(false);
            Menu.layout();
        });

    }

}
