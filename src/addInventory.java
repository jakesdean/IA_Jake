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
            case "veg.txt":
                l = 9;
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
        j.setSize(500, 400);
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
        JLabel l15 = new JLabel("spinach");
        l15.setBounds(350, 50, 100, 20);
        JLabel l16 = new JLabel("peppers");
        l16.setBounds(350, 75, 75, 20);
        JLabel l17 = new JLabel("olives");
        l17.setBounds(350, 100, 75, 20);
        JLabel l18 = new JLabel("Cucumbers");
        l18.setBounds(350, 125, 75, 20);
        JLabel l19 = new JLabel("lettuce");
        l19.setBounds(350, 150, 75, 20);
        JLabel l20 = new JLabel("pickles");
        l20.setBounds(350, 175, 75, 20);
        JLabel l21 = new JLabel("onions");
        l21.setBounds(350, 200, 75, 20);
        JLabel l22 = new JLabel("tomatoes");
        l22.setBounds(350, 225, 75, 20);
        JLabel l23 = new JLabel("jalapenos");
        l23.setBounds(350, 250, 75, 20);
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
        JTextField t14 = new JTextField();
        t14.setBounds(420,50,35,20);
        JTextField t15 = new JTextField();
        t15.setBounds(420,75,35,20);
        JTextField t16 = new JTextField();
        t16.setBounds(420,100,35,20);
        JTextField t17 = new JTextField();
        t17.setBounds(420,125,35,20);
        JTextField t18 = new JTextField();
        t18.setBounds(420,150,35,20);
        JTextField t19 = new JTextField();
        t19.setBounds(420,175,35,20);
        JTextField t20 = new JTextField();
        t20.setBounds(420,200,35,20);
        JTextField t21 = new JTextField();
        t21.setBounds(420,225,35,20);
        JTextField t22 = new JTextField();
        t22.setBounds(420,250,35,20);
        JButton b = new JButton("Save");
        b.setBounds(50,275,200,50);
        j.add(l);
        j.add(l1);
        j.add(l2);
        j.add(l3);
        j.add(l4);
        j.add(l6);
        j.add(l5);
        j.add(l7);
        j.add(l8);
        j.add(l9);
        j.add(l10);
        j.add(l11);
        j.add(l12);
        j.add(l13);
        j.add(l14);
        j.add(l15);
        j.add(l16);
        j.add(l17);
        j.add(l18);
        j.add(l19);
        j.add(l20);
        j.add(l21);
        j.add(l22);
        j.add(l23);
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
        j.add(t14);
        j.add(t15);
        j.add(t16);
        j.add(t17);
        j.add(t18);
        j.add(t19);
        j.add(t20);
        j.add(t21);
        j.add(t22);
        j.add(b);
        j.setLayout(null);
        j.setVisible(true);
        j.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        RandomAccessFile type = new RandomAccessFile("type.txt", "rw");
        RandomAccessFile cookie = new RandomAccessFile("cookie.txt", "rw");
        RandomAccessFile cup = new RandomAccessFile("cup.txt", "rw");
        RandomAccessFile veg = new RandomAccessFile("veg.txt", "rw");

        b.addActionListener(agr0 -> {

            if (!t.getText().isEmpty()) {
                try {
                    type.seek(position(0,"type.txt"));
                    try {
                        Integer i = Integer.parseInt(type.readLine()) + Integer.parseInt(t.getText());
                        addInv(i, 0, "type.txt");
                    } catch (NumberFormatException ignored) {}
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            if (!t1.getText().isEmpty()) {
                try {
                    type.seek(position(1,"type.txt"));
                    try {
                        Integer i = Integer.parseInt(type.readLine()) + Integer.parseInt(t1.getText());
                        addInv(i, 1, "type.txt");
                    } catch (NumberFormatException ignored) {}
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            if (!t2.getText().isEmpty()) {
                try {
                    type.seek(position(2,"type.txt"));
                    try {
                        Integer i = Integer.parseInt(type.readLine()) + Integer.parseInt(t2.getText());
                        addInv(i, 2, "type.txt");
                    } catch (NumberFormatException ignored) {}
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            if (!t3.getText().isEmpty()) {
                try {
                    type.seek(position(3,"type.txt"));
                    try {
                        Integer i = Integer.parseInt(type.readLine()) + Integer.parseInt(t3.getText());
                        addInv(i, 3, "type.txt");
                    } catch (NumberFormatException ignored) {}
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            if (!t4.getText().isEmpty()) {
                try {
                    type.seek(position(4,"type.txt"));
                    try {
                        Integer i = Integer.parseInt(type.readLine()) + Integer.parseInt(t4.getText());
                        addInv(i, 4, "type.txt");
                    } catch (NumberFormatException ignored) {}
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            if (!t5.getText().isEmpty()) {
                try {
                    type.seek(position(5,"type.txt"));
                    try {
                        Integer i = Integer.parseInt(type.readLine()) + Integer.parseInt(t5.getText());
                        addInv(i, 5, "type.txt");
                    } catch (NumberFormatException ignored) {}
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            if (!t6.getText().isEmpty()) {
                try {
                    cookie.seek(position(0,"cookie.txt"));
                    try {
                        Integer i = Integer.parseInt(cookie.readLine()) + Integer.parseInt(t6.getText());
                        addInv(i, 0, "cookie.txt");
                    } catch (NumberFormatException ignored) {}
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            if (!t7.getText().isEmpty()) {
                try {
                    cookie.seek(position(1,"cookie.txt"));
                    try {
                        Integer i = Integer.parseInt(cookie.readLine()) + Integer.parseInt(t7.getText());
                        addInv(i, 1, "cookie.txt");
                    } catch (NumberFormatException ignored) {}
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            if (!t8.getText().isEmpty()) {
                try {
                    cookie.seek(position(2,"cookie.txt"));
                    try {
                        Integer i = Integer.parseInt(cookie.readLine()) + Integer.parseInt(t8.getText());
                        addInv(i, 2, "cookie.txt");
                    } catch (NumberFormatException ignored) {}
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            if (!t9.getText().isEmpty()) {
                try {
                    cookie.seek(position(3,"cookie.txt"));
                    try {
                        Integer i = Integer.parseInt(cookie.readLine()) + Integer.parseInt(t9.getText());
                        addInv(i, 3, "cookie.txt");
                    } catch (NumberFormatException ignored) {}
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            if (!t10.getText().isEmpty()) {
                try {
                    cookie.seek(position(4,"cookie.txt"));
                    try {
                        Integer i = Integer.parseInt(cookie.readLine()) + Integer.parseInt(t10.getText());
                        addInv(i, 4, "cookie.txt");
                    } catch (NumberFormatException ignored) {}
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            if (!t11.getText().isEmpty()) {
                try {
                    cup.seek(position(0,"cup.txt"));
                    try {
                        Integer i = Integer.parseInt(cup.readLine()) + Integer.parseInt(t11.getText());
                        addInv(i, 0, "cup.txt");
                    } catch (NumberFormatException ignored) {}
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            if (!t12.getText().isEmpty()) {
                try {
                    cup.seek(position(1,"cup.txt"));
                    try {
                        Integer i = Integer.parseInt(cup.readLine()) + Integer.parseInt(t12.getText());
                        addInv(i, 1, "cup.txt");
                    } catch (NumberFormatException ignored) {}
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            if (!t13.getText().isEmpty()) {
                try {
                    cup.seek(position(2,"cup.txt"));
                    try {
                        Integer i = Integer.parseInt(cup.readLine()) + Integer.parseInt(t13.getText());
                        addInv(i, 2, "cup.txt");
                    } catch (NumberFormatException ignored) {}
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            if (!t15.getText().isEmpty()) {
                try {
                    veg.seek(position(0,"veg.txt"));
                    try {
                        Integer i = Integer.parseInt(veg.readLine()) + Integer.parseInt(t15.getText());
                        addInv(i, 0, "veg.txt");
                    } catch (NumberFormatException ignored) {}
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            if (!t16.getText().isEmpty()) {
                try {
                    veg.seek(position(1,"veg.txt"));
                    try {
                        Integer i = Integer.parseInt(veg.readLine()) + Integer.parseInt(t16.getText());
                        addInv(i, 1, "veg.txt");
                    } catch (NumberFormatException ignored) {}
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            if (!t16.getText().isEmpty()) {
                try {
                    veg.seek(position(2,"veg.txt"));
                    try {
                        Integer i = Integer.parseInt(veg.readLine()) + Integer.parseInt(t16.getText());
                        addInv(i, 2, "veg.txt");
                    } catch (NumberFormatException ignored) {}
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            if (!t17.getText().isEmpty()) {
                try {
                    veg.seek(position(3,"veg.txt"));
                    try {
                        Integer i = Integer.parseInt(veg.readLine()) + Integer.parseInt(t17.getText());
                        addInv(i, 3, "veg.txt");
                    } catch (NumberFormatException ignored) {}
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            if (!t18.getText().isEmpty()) {
                try {
                    veg.seek(position(4,"veg.txt"));
                    try {
                        Integer i = Integer.parseInt(veg.readLine()) + Integer.parseInt(t18.getText());
                        addInv(i, 4, "veg.txt");
                    } catch (NumberFormatException ignored) {}
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            if (!t19.getText().isEmpty()) {
                try {
                    veg.seek(position(5,"veg.txt"));
                    try {
                        Integer i = Integer.parseInt(veg.readLine()) + Integer.parseInt(t19.getText());
                        addInv(i, 5, "veg.txt");
                    } catch (NumberFormatException ignored) {}
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            if (!t20.getText().isEmpty()) {
                try {
                    veg.seek(position(6,"veg.txt"));
                    try {
                        Integer i = Integer.parseInt(veg.readLine()) + Integer.parseInt(t20.getText());
                        addInv(i, 6, "veg.txt");
                    } catch (NumberFormatException ignored) {}
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            if (!t21.getText().isEmpty()) {
                try {
                    veg.seek(position(7,"veg.txt"));
                    try {
                        Integer i = Integer.parseInt(veg.readLine()) + Integer.parseInt(t21.getText());
                        addInv(i, 7, "veg.txt");
                    } catch (NumberFormatException ignored) {}
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            if (!t22.getText().isEmpty()) {
                try {
                    veg.seek(position(8,"veg.txt"));
                    try {
                        Integer i = Integer.parseInt(veg.readLine()) + Integer.parseInt(t22.getText());
                        addInv(i, 8, "veg.txt");
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
