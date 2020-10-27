import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

class addInventory extends Inventory{

    static void addInv(Integer num, Integer line, String filePath) throws IOException {
        File file = new File(filePath);
        RandomAccessFile raf = new RandomAccessFile(file, "rw");
        Integer[] intList = new Integer[10];
        String[] strList;

        int l = 0;

        switch (filePath) {
            case "type.txt":
                l = 6;
                break;
            case "cookie.txt":
                l = 5;
                break;
            case "cup.txt":
                l = 3;
                break;
        }


        strList = getList(l,filePath);
        for (int i = 0; i < l; i++) {
            intList[i] = Integer.parseInt(strList[i]);
        }

        try {
            raf.seek(position(line,filePath));
            intList[line] = num;
            for (int i = 0; i < l; i++) {
                strList[i] = String.valueOf(intList[i]);
            }
            StringBuilder in = new StringBuilder();
            for (int i = 0; i < l; i++) {
                in.append(strList[i]).append("\n");
            }
            raf.seek(0);
            raf.writeBytes(in.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static void InvSetup() throws FileNotFoundException {
        JFrame j = new JFrame("Add Inventory");
        j.setSize(400, 250);
        JLabel l = new JLabel("Steak");
        l.setBounds(50, 50, 100, 20);
        JLabel l1 = new JLabel("Chicken");
        l1.setBounds(50, 75, 100, 20);
        JLabel l2 = new JLabel("Salami");
        l2.setBounds(50, 100, 100, 20);
        JLabel l3 = new JLabel("Veggie");
        l3.setBounds(50, 125, 100, 20);
        JLabel l4 = new JLabel("Tuna");
        l4.setBounds(50, 150, 100, 20);
        JLabel l5 = new JLabel("Ham");
        l5.setBounds(50, 175, 100, 20);
        JLabel l6 = new JLabel("INVENTORY ADD");
        l6.setBounds(20, 10, 150, 50);
        l6.setFont(new Font("Arial", Font.BOLD, 16));
        JLabel l7 = new JLabel("Choc Chip");
        l7.setBounds(150, 50, 100, 20);
        JLabel l8 = new JLabel("Double Choc");
        l8.setBounds(150, 75, 100, 20);
        JLabel l9 = new JLabel("Ras Cheese");
        l9.setBounds(150, 100, 100, 20);
        JLabel l10 = new JLabel("White Chip");
        l10.setBounds(150, 125, 100, 20);
        JLabel l11 = new JLabel("Rainbow");
        l11.setBounds(150,150,100,20);
        JLabel l12 = new JLabel("0.3 l");
        l12.setBounds(270, 50, 100, 20);
        JLabel l13 = new JLabel("0.4 l");
        l13.setBounds(270, 75, 100, 20);
        JLabel l14 = new JLabel("0.5 l");
        l14.setBounds(270, 100, 100, 20);
        JTextField t = new JTextField();
        t.setBounds(100,50,35,20);
        JTextField t1 = new JTextField();
        t1.setBounds(100,75,35,20);
        JTextField t2 = new JTextField();
        t2.setBounds(100,100,35,20);
        JTextField t3 = new JTextField();
        t3.setBounds(100,125,35,20);
        JTextField t4 = new JTextField();
        t4.setBounds(100,150,35,20);
        JTextField t5 = new JTextField();
        t5.setBounds(100,175,35,20);
        JTextField t6 = new JTextField();
        t6.setBounds(230,50,35,20);
        JTextField t7 = new JTextField();
        t7.setBounds(230,75,35,20);
        JTextField t8 = new JTextField();
        t8.setBounds(230,100,35,20);
        JTextField t9 = new JTextField();
        t9.setBounds(230,125,35,20);
        JTextField t10 = new JTextField();
        t10.setBounds(230,150,35,20);
        JTextField t11 = new JTextField();
        t11.setBounds(300,50,35,20);
        JTextField t12 = new JTextField();
        t12.setBounds(300,75,35,20);
        JTextField t13 = new JTextField();
        t13.setBounds(300,100,35,20);
        JButton b = new JButton("Save");
        b.setBounds(275,150,100,50);
        j.add(l);
        j.add(l1);
        j.add(l2);
        j.add(l3);
        j.add(l4);
        j.add(l5);
        j.add(l6);
        j.add(l7);
        j.add(l8);
        j.add(l9);
        j.add(l10);
        j.add(l11);
        j.add(l12);
        j.add(l13);
        j.add(l14);
        j.add(t);
        j.add(t1);
        j.add(t2);
        j.add(t3);
        j.add(t4);
        j.add(t5);
        j.add(t6);
        j.add(t7);
        j.add(t8);
        j.add(t9);
        j.add(t10);
        j.add(t11);
        j.add(t12);
        j.add(t13);
        j.add(b);
        j.setLayout(null);
        j.setVisible(true);
        j.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        RandomAccessFile type = new RandomAccessFile("type.txt", "rw");
        RandomAccessFile cookie = new RandomAccessFile("cookie.txt", "rw");
        RandomAccessFile cup = new RandomAccessFile("cup.txt", "rw");

        b.addActionListener(agr0 -> {

            if (!t.getText().isEmpty()) {
                try {
                    type.seek(position(0,"type.txt"));
                    Integer i = Integer.parseInt(type.readLine()) + Integer.parseInt(t.getText());
                    addInv(i, 0, "type.txt");
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            if (!t1.getText().isEmpty()) {
                try {
                    type.seek(position(1,"type.txt"));
                    Integer i = Integer.parseInt(type.readLine()) + Integer.parseInt(t1.getText());
                    addInv(i, 1, "type.txt");
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            if (!t2.getText().isEmpty()) {
                try {
                    type.seek(position(2,"type.txt"));
                    Integer i = Integer.parseInt(type.readLine()) + Integer.parseInt(t2.getText());
                    addInv(i, 2, "type.txt");
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            if (!t3.getText().isEmpty()) {
                try {
                    type.seek(position(3,"type.txt"));
                    Integer i = Integer.parseInt(type.readLine()) + Integer.parseInt(t3.getText());
                    addInv(i, 3, "type.txt");
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            if (!t4.getText().isEmpty()) {
                try {
                    type.seek(position(4,"type.txt"));
                    Integer i = Integer.parseInt(type.readLine()) + Integer.parseInt(t4.getText());
                    addInv(i, 4, "type.txt");
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            if (!t5.getText().isEmpty()) {
                try {
                    type.seek(position(5,"type.txt"));
                    Integer i = Integer.parseInt(type.readLine()) + Integer.parseInt(t5.getText());
                    addInv(i, 5, "type.txt");
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            if (!t6.getText().isEmpty()) {
                try {
                    cookie.seek(position(0,"cookie.txt"));
                    Integer i = Integer.parseInt(cookie.readLine()) + Integer.parseInt(t6.getText());
                    addInv(i, 0, "cookie.txt");
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            if (!t7.getText().isEmpty()) {
                try {
                    cookie.seek(position(1,"cookie.txt"));
                    Integer i = Integer.parseInt(cookie.readLine()) + Integer.parseInt(t7.getText());
                    addInv(i, 1, "cookie.txt");
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            if (!t8.getText().isEmpty()) {
                try {
                    cookie.seek(position(2,"cookie.txt"));
                    Integer i = Integer.parseInt(cookie.readLine()) + Integer.parseInt(t8.getText());
                    addInv(i, 2, "cookie.txt");
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            if (!t9.getText().isEmpty()) {
                try {
                    cookie.seek(position(3,"cookie.txt"));
                    Integer i = Integer.parseInt(cookie.readLine()) + Integer.parseInt(t9.getText());
                    addInv(i, 3, "cookie.txt");
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            if (!t10.getText().isEmpty()) {
                try {
                    cookie.seek(position(4,"cookie.txt"));
                    Integer i = Integer.parseInt(cookie.readLine()) + Integer.parseInt(t10.getText());
                    addInv(i, 4, "cookie.txt");
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            if (!t11.getText().isEmpty()) {
                try {
                    cup.seek(position(0,"cup.txt"));
                    Integer i = Integer.parseInt(cup.readLine()) + Integer.parseInt(t11.getText());
                    addInv(i, 0, "cup.txt");
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            if (!t12.getText().isEmpty()) {
                try {
                    cup.seek(position(1,"cup.txt"));
                    Integer i = Integer.parseInt(cup.readLine()) + Integer.parseInt(t12.getText());
                    addInv(i, 1, "cup.txt");
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            if (!t13.getText().isEmpty()) {
                try {
                    cup.seek(position(2,"cup.txt"));
                    Integer i = Integer.parseInt(cup.readLine()) + Integer.parseInt(t13.getText());
                    addInv(i, 2, "cup.txt");
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            j.setVisible(false);
            Menu.layout();
        });
    }
}
