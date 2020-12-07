import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.*;

class Inventory extends Order {

    static void InventoryCheck() throws IOException {

        JFrame j = new JFrame("Inventory");
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
        JLabel l15 = new JLabel("spinach");
        l15.setBounds(350, 50, 100, 20);
        JLabel l16 = new JLabel("peppers");
        l16.setBounds(350, 75, 100, 20);
        JLabel l17 = new JLabel("olives");
        l17.setBounds(350, 100, 100, 20);
        JLabel l18 = new JLabel("Cucumbers");
        l18.setBounds(350, 125, 100, 20);
        JLabel l19 = new JLabel("lettuce");
        l19.setBounds(350, 150, 100, 20);
        JLabel l20 = new JLabel("pickles");
        l20.setBounds(350, 175, 100, 20);
        JLabel l21 = new JLabel("onions");
        l21.setBounds(350, 200, 100, 20);
        JLabel l22 = new JLabel("tomatoes");
        l22.setBounds(350, 225, 100, 20);
        JLabel l23 = new JLabel("jalapenos");
        l23.setBounds(350, 250, 100, 20);

        JButton b = new JButton("back");
        b.setBounds(50,275,200,50);
        JButton b1 = new JButton("order");
        b1.setBounds(350,275,100,50);

        JComboBox<String> box = new JComboBox<>(new String[]{"Highest to Lowest","Lowest to Highest"});
        box.setBounds(330,325,150,20);

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
        j.add(l15);
        j.add(l16);
        j.add(l17);
        j.add(l18);
        j.add(l19);
        j.add(l20);
        j.add(l21);
        j.add(l22);
        j.add(l23);
        j.add(b);
        j.add(b1);
        j.add(box);
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

        inv = getList(3, "cookie.txt");

        l12.setText("0.5 l: " + inv[0]);
        l13.setText("0.4 l: " + inv[1]);
        l14.setText("0.3 l: " + inv [2]);

        inv = getList(9, "veg.txt");

        l15.setText("Spinach: " + inv[0]);
        l16.setText("Peppers: " + inv[1]);
        l17.setText("Olives: " + inv[2]);
        l18.setText("Cucumbers: " + inv[3]);
        l19.setText("Lettuce: " + inv[4]);
        l20.setText("Pickles: " + inv[5]);
        l21.setText("Onions: " + inv[6]);
        l22.setText("Tomatoes: " + inv[7]);
        l23.setText("Jalapenos: " + inv[8]);


        b.addActionListener(arg0 -> {
            j.setVisible(false);
            Menu.layout();
        });

        b1.addActionListener(arg0 -> {
            try {
                orderInv((String) box.getSelectedItem());
                j.setVisible(false);
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
    }

    static void takeInventory() throws IOException {

        RandomAccessFile type = new RandomAccessFile("type.txt", "rw");
        RandomAccessFile cookie = new RandomAccessFile("cookie.txt", "rw");
        RandomAccessFile cup = new RandomAccessFile("cup.txt", "rw");
        RandomAccessFile veg = new RandomAccessFile("veg.txt", "rw");


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

        Integer[] ary = getVeggies();

        for (int i = 0; i < 9; i ++) {

            if (ary[i] == 1) {
                veg.seek(position(i,"veg.txt"));
                c = Integer.parseInt(veg.readLine()) - 1;
                addInventory.addInv(c,i,"veg.txt");
            }
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
        String[] arr = new String[length];
        for (int n = 0; n < length; n++) {
            arr[n] = getLine(n,filePath);
        }
        return arr;
    }


    static String getLine(Integer line, String filePath) throws IOException {
        File file = new File(filePath);
        RandomAccessFile raf = new RandomAccessFile(file, "rw");
        raf.seek(position(line, filePath));
        return raf.readLine();
    }

    static void orderInv(String option) throws IOException {
        HashMap<Integer, String> HMap = new HashMap<>();
            HMap.put(Integer.valueOf(getLine(1, "type.txt")), "Chicken");
            HMap.put(Integer.valueOf(getLine(2, "type.txt")), "Salami");
            HMap.put(Integer.valueOf(getLine(3, "type.txt")), "Veggie");
            HMap.put(Integer.valueOf(getLine(0, "type.txt")), "Steak");
            HMap.put(Integer.valueOf(getLine(4, "type.txt")), "Tuna");
            HMap.put(Integer.valueOf(getLine(5, "type.txt")), "Ham");
            HMap.put(Integer.valueOf(getLine(0, "cookie.txt")), "Choc Chip");
            HMap.put(Integer.valueOf(getLine(1, "cookie.txt")), "Double Choc");
            HMap.put(Integer.valueOf(getLine(2, "cookie.txt")), "Ras Cheese");
            HMap.put(Integer.valueOf(getLine(3, "cookie.txt")), "White Chip");
            HMap.put(Integer.valueOf(getLine(4, "cookie.txt")), "Rainbow");
            HMap.put(Integer.valueOf(getLine(0, "cup.txt")), "0.3 l");
            HMap.put(Integer.valueOf(getLine(1, "cup.txt")), "0.4 l");
            HMap.put(Integer.valueOf(getLine(2, "cup.txt")), "0.5 l");
            HMap.put(Integer.valueOf(getLine(0, "veg.txt")), "Spinach");
            HMap.put(Integer.valueOf(getLine(1, "veg.txt")), "Peppers");
            HMap.put(Integer.valueOf(getLine(2, "veg.txt")), "Olives");
            HMap.put(Integer.valueOf(getLine(3, "veg.txt")), "Cucumbers");
            HMap.put(Integer.valueOf(getLine(4, "veg.txt")), "Lettuce");
            HMap.put(Integer.valueOf(getLine(5, "veg.txt")), "pickles");
            HMap.put(Integer.valueOf(getLine(6, "veg.txt")), "Onion");
            HMap.put(Integer.valueOf(getLine(7, "veg.txt")), "Tomatoes");
            HMap.put(Integer.valueOf(getLine(8, "veg.txt")), "Jalapenos");

        String[] list = new String[HMap.size()];
        Map<Integer, String> map = new TreeMap<>(HMap);
        Set<Map.Entry<Integer, String>> entries = map.entrySet();
        int i = 0;
        for (Map.Entry<Integer, String> entry : entries) {
            list[i] = entry.getValue() + ": " + entry.getKey();
            i++;
        }

        JFrame f = new JFrame("order Inventory");
        f.setSize(300,600);
        JButton b = new JButton("back");
        b.setBounds(50,500,150,50);
        f.add(b);

        int r = 0;
        if(option.equals("Lowest to Highest")){
            for (String s : list) {
                JLabel l = new JLabel(s);
                l.setBounds(25, 20 + 20* r, 150, 10);
                f.add(l);
                r++;
            }
        }
        if(option.equals("Highest to Lowest")){
            for (int n = 0; n < list.length; n++) {
                JLabel l = new JLabel(list[list.length - 1 - n]);
                l.setBounds(25, 20 + 20 * n, 150, 10);
                f.add(l);
            }
        }
        f.setLayout(null);
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        f.setVisible(true);

        b.addActionListener(arg0 -> {
            f.setVisible(false);
            try {
                InventoryCheck();
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
    }

}




