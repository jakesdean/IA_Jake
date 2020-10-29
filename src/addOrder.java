import javax.swing.*;
import java.io.IOException;

class addOrder extends Order{

    static void addType() {

        Order order = new Order();
        JFrame f=new JFrame("Type");
        f.setSize(400,400);
        JButton b=new JButton("Steak");
        b.setBounds(0,0,200, 100);
        JButton b1=new JButton("Chicken");
        b1.setBounds(200,0,200, 100);
        JButton b2=new JButton("Salami");
        b2.setBounds(0,100,200, 100);
        JButton b3=new JButton("Veggie");
        b3.setBounds(200,100,200, 100);
        JButton b4=new JButton("tuna");
        b4.setBounds(0,200,200, 100);
        JButton b5=new JButton("ham");
        b5.setBounds(200,200,200, 100);

        f.add(b);
        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.add(b4);
        f.add(b5);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        b.addActionListener(arg0 -> {
            order.setType(0);
            f.setVisible(false);
            addLength();
        });
        b1.addActionListener(arg0 -> {
            order.setType(1);
            f.setVisible(false);
            addLength();
        });
        b2.addActionListener(arg0 -> {
            order.setType(2);
            f.setVisible(false);
            addLength();
        });
        b3.addActionListener(arg0 -> {
            order.setType(3);
            f.setVisible(false);
            addLength();
        });
        b4.addActionListener(arg0 -> {
            order.setType(4);
            f.setVisible(false);
            addLength();
        });
        b5.addActionListener(arg0 -> {
            order.setType(5);
            f.setVisible(false);
            addLength();
        });

    }

    private static void addLength() {
        Order order = new Order();
        JFrame f=new JFrame("Length");
        f.setSize(400,250);
        JButton b=new JButton("15 centimeter");
        b.setBounds(0,0,200, 100);
        JButton b1=new JButton("30 centimeter");
        b1.setBounds(200,0,200, 100);

        f.add(b);
        f.add(b1);
        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);

        b.addActionListener(ar0 -> {
            order.setLength(0);
            addCookie();
            f.setVisible(false);
        });
        b1.addActionListener(ar0 -> {
            order.setLength(1);
            addCookie();
            f.setVisible(false);
        });
    }

    private static void addCookie() {
        Order order = new Order();
        JFrame f=new JFrame("Cookie");
        f.setSize(400,350);
        JButton b=new JButton("Chocolate Chip");
        b.setBounds(0,0,200, 100);
        JButton b1=new JButton("Double Chocolate");
        b1.setBounds(200,0,200, 100);
        JButton b2=new JButton("Raspberry Cheesecake");
        b2.setBounds(0,100,200, 100);
        JButton b3=new JButton("White Chip Macadamia");
        b3.setBounds(200,100,200, 100);
        JButton b4=new JButton("Rainbow Candy");
        b4.setBounds(0,200,200, 100);
        JButton b5=new JButton("No cookie");
        b5.setBounds(200,200,200,100);

        f.add(b);
        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.add(b4);
        f.add(b5);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        b.addActionListener(arg0 -> {
            order.setCookie(0);
            f.setVisible(false);
            addDrink();
        });

        b1.addActionListener(arg0 -> {
            order.setCookie(1);
            f.setVisible(false);
            addDrink();
        });

        b2.addActionListener(arg0 -> {
            order.setCookie(2);
            f.setVisible(false);
            addDrink();

        });

        b3.addActionListener(arg0 -> {
            order.setCookie(3);
            f.setVisible(false);
            addDrink();

        });

        b4.addActionListener(arg0 -> {
            order.setCookie(4);
            f.setVisible(false);
            addDrink();
        });

        b5.addActionListener(arg0 -> {
            order.setCookie(5);
            f.setVisible(false);
            addDrink();
        });

    }

    private static void addMenu() {
        Order order = new Order();

        JFrame f=new JFrame("Menu");
        f.setSize(400,350);
        JButton b=new JButton("Menu");
        b.setBounds(0,0,200, 100);
        JButton b1=new JButton("Student");
        b1.setBounds(200,0,200, 100);
        JButton b2 = new JButton("No menu");
        b2.setBounds(100, 200, 200, 100);

        f.add(b);
        f.add(b1);
        f.add(b2);
        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);

        if (getCookie() == 5 || getCup() == 3) {
            order.setMenu(2);
            f.setVisible(false);
            showPrice();
        }

        if (getCup() != 0) {
            b1.setVisible(false);
        }
        b.addActionListener(arg0 -> {
            order.setMenu(0);
            f.setVisible(false);
            showPrice();
        });
        b1.addActionListener(arg0 -> {
            order.setMenu(1);
            f.setVisible(false);
            showPrice();
        });
        b2.addActionListener(arg0 -> {
            order.setMenu(2);
            f.setVisible(false);
            showPrice();
        });
    }

    private static void addDrink() {
        Order order = new Order();
        JFrame f=new JFrame("Drink");
        f.setSize(400,250);
        JButton b=new JButton("0.3 l");
        b.setBounds(0,0,200, 100);
        JButton b1=new JButton("0.4 l");
        b1.setBounds(200,0,200, 100);
        JButton b2=new JButton("0.5 l");
        b2.setBounds(0,100,200, 100);
        JButton b3=new JButton("No drink");
        b3.setBounds(200,100,200,100);

        f.add(b);
        f.add(b1);
        f.add(b2);
        f.add(b3);

        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        b.addActionListener(arg0 -> {
            order.setCup(0);
            f.setVisible(false);
            addMenu();
        });
        b1.addActionListener(arg0 -> {
            order.setCup(1);
            f.setVisible(false);
            addMenu();
        });
        b2.addActionListener(arg0 -> {
            order.setCup(2);
            f.setVisible(false);
            addMenu();
        });
        b3.addActionListener(arg0 -> {
            order.setCup(3);
            f.setVisible(false);
            addMenu();
        });
    }

    static void showPrice() {
        JFrame f = new JFrame("Price");
        f.setSize(400,200);
        JLabel l = new JLabel("Price: " + getPrice(), SwingConstants.CENTER);
        l.setBounds(150, 50, 100, 20);
        JButton b = new JButton("OK");
        b.setBounds(150, 100, 100, 50);

        f.add(l);
        f.add(b);
        f.setLayout(null);
        f.setVisible(true);

        b.addActionListener(arg0 -> {
            f.setVisible(false);
            try {
                Inventory.takeInventory();
            } catch (IOException e) {
                e.printStackTrace();
            }
            Menu.layout();
        });

    }

}
