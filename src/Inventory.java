import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

class Inventory extends Order {

    static void InventoryCheck() throws IOException {

        JFrame j = new JFrame("Inventory");
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
        JLabel l6 = new JLabel("INVENTORY");
        l6.setBounds(20, 10, 100, 50);
        l6.setFont(new Font("Arial", Font.BOLD, 14));
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
        JLabel l12 = new JLabel("0.5 l");
        l12.setBounds(270, 50, 100, 20);
        JLabel l13 = new JLabel("0.4 l");
        l13.setBounds(270, 75, 100, 20);
        JLabel l14 = new JLabel("0.3 l");
        l14.setBounds(270, 100, 100, 20);
        JButton b = new JButton("back");
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
        j.add(b);
        j.setLayout(null);
        j.setVisible(true);
        j.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        String[] inv;
        inv = getList(6,"type.txt");

        l.setText("Steak: " + inv[0]);
        l1.setText("Chicken: " + inv[1]);
        l2.setText("Salami: " + inv[2]);
        l3.setText("Veggie: " + inv[3]);
        l4.setText("Tuna:" + inv[4]);
        l5.setText("Ham:" + inv[5]);

        inv = getList(5, "cookie.txt");

        l7.setText("Choc Chip: " + inv[0]);
        l8.setText("Double Choc: " + inv[1]);
        l9.setText("Ras Cheese: " + inv[2]);
        l10.setText("White chip: " + inv[3]);
        l11.setText("Rainbow: " + inv[4]);

        inv = getList(5, "cookie.txt");

        l12.setText("0.5 l: " + inv[0]);
        l13.setText("0.4 l: " + inv[1]);
        l14.setText("0.3 l: " + inv [2]);

        b.addActionListener(arg0 -> {
            j.setVisible(false);
            Menu.layout();
        });

    }

    static void takeInventory() throws IOException {

        RandomAccessFile type = new RandomAccessFile("type.txt", "rw");
        RandomAccessFile cookie = new RandomAccessFile("cookie.txt", "rw");
        RandomAccessFile cup = new RandomAccessFile("cup.txt", "rw");
        var intList = new Integer[6];
        String[] strList;

        strList = getList(6,"type.txt");
        for (int i = 0; i < 6; i++) {
            intList[i] = Integer.parseInt(strList[i]);
        }

            type.seek(position(getType(),"type.txt"));
            Integer c = null;
            int l = Integer.parseInt(type.readLine());
            if (getLength() == 1) {
                c = l - 2;
            } else if (getLength() == 0){
                c = l - 1;
            }
            addInventory.addInv(c, getType(), "type.txt");

        if (getCookie() != 5) {
            cookie.seek(position(getCookie(), "cookie.txt"));
            c = Integer.parseInt(cookie.readLine()) - 1;
            addInventory.addInv(c, getCookie(), "cookie.txt");
        }

        if (getCup() != 3) {
            cup.seek(position(getCup(),"cup.txt"));
            c = Integer.parseInt(cup.readLine()) - 1;
            addInventory.addInv(c, getCup(), "cup.txt");
        }
    }

    static Integer position(Integer line, String filePath) throws IOException {
        File file = new File(filePath);
        RandomAccessFile raf = new RandomAccessFile(file, "rw");
        int pos = 0;
        int lineLength;
            for (int i = 0; i < line; i++) {            // THIS IS SUPER BUSTED
                raf.seek(pos);                         // FIGURE OUT WHY :(
                String lineText = raf.readLine();      // also this is only for type which is wrong and weird it has worked this long
                lineLength = lineText.length();         // lmao fixed it
                pos = pos + lineLength + 1;
            }
        return pos;
    }

    static void checkRAF(Integer length, String filePath) throws IOException {
        File file = new File(filePath);
        RandomAccessFile raf = new RandomAccessFile(file, "rw");
        for (int i = 0; i < length; i++) {
            int l = position(i, filePath);
            raf.seek(l);
            if (raf.readLine() == null) {
                raf.seek(l);
                raf.writeBytes("0\n");
            }
        }
    }


    static String[] getList(Integer length, String filePath) throws IOException {
        String[] arr = new String[10];
        File file = new File(filePath);
        RandomAccessFile raf = new RandomAccessFile(file,"rw");
        int c = 0;
        for (int n = 0; n < length; n++) {
            raf.seek(c);
            arr[n] = raf.readLine();
            raf.seek(c);
            int i = raf.readLine().length();
            c = c + i + 1;
        }
        return arr;
    }

}




