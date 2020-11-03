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
            addVeggies();
            f.setVisible(false);
        });
        b1.addActionListener(ar0 -> {
            order.setLength(1);
            addVeggies();
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

    static void addVeggies() {
        Order order = new Order();
        Integer[] veggies = new Integer[9];

        JFrame f = new JFrame();
        f.setSize(300, 400);
        JCheckBox b = new JCheckBox();
        b.setBounds(125,25,20,20);
        JCheckBox b1 = new JCheckBox();
        b1.setBounds(125, 50, 20, 20);
        JCheckBox b2 = new JCheckBox();
        b2.setBounds(125, 75, 20, 20);
        JCheckBox b3 = new JCheckBox();
        b3.setBounds(125,100,20,20);
        JCheckBox b4 = new JCheckBox();
        b4.setBounds(125,125,20,20);
        JCheckBox b5 = new JCheckBox();
        b5.setBounds(125,150,20,20);
        JCheckBox b6 = new JCheckBox();
        b6.setBounds(125,175,20,20);
        JCheckBox b7 = new JCheckBox();
        b7.setBounds(125,200,20,20);
        JCheckBox b8 = new JCheckBox();
        b8.setBounds(125,225,20,20);
        JLabel l = new JLabel("spinach");
        l.setBounds(50, 25, 75, 20);
        JLabel l1 = new JLabel("peppers");
        l1.setBounds(50, 50, 75, 20);
        JLabel l2 = new JLabel("olives");
        l2.setBounds(50, 75, 75, 20);
        JLabel l3 = new JLabel("Cucumbers");
        l3.setBounds(50, 100, 75, 20);
        JLabel l4 = new JLabel("lettuce");
        l4.setBounds(50, 125, 75, 20);
        JLabel l5 = new JLabel("pickles");
        l5.setBounds(50, 150, 75, 20);
        JLabel l6 = new JLabel("onions");
        l6.setBounds(50, 175, 75, 20);
        JLabel l7 = new JLabel("tomatoes");
        l7.setBounds(50, 200, 75, 20);
        JLabel l8 = new JLabel("jalapenos");
        l8.setBounds(50, 225, 75, 20);
        JButton button = new JButton("next");
        button.setBounds(75, 250,100, 50);

        f.add(b);
        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.add(b4);
        f.add(b5);
        f.add(b6);
        f.add(b7);
        f.add(b8);
        f.add(l);
        f.add(l1);
        f.add(l2);
        f.add(l3);
        f.add(l4);
        f.add(l5);
        f.add(l6);
        f.add(l7);
        f.add(l8);
        f.add(button);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        button.addActionListener(arg0 -> {
            if (b.isSelected()) {
                veggies[0] = 1;
            } else {
                veggies[0] = 0;
            }
            if (b1.isSelected()) {
                veggies[1] = 1;
            } else {
                veggies[1] = 0;
            }
            if (b2.isSelected()) {
                veggies[2] = 1;
            } else {
                veggies[2] = 0;
            }
            if (b3.isSelected()) {
                veggies[3] = 1;
            } else {
                veggies[3] = 0;
            }
            if (b4.isSelected()) {
                veggies[4] = 1;
            } else {
                veggies[4] = 0;
            }
            if (b5.isSelected()) {
                veggies[5] = 1;
            } else {
                veggies[5] = 0;
            }
            if (b6.isSelected()) {
                veggies[6] = 1;
            } else {
                veggies[6] = 0;
            }
            if (b7.isSelected()) {
                veggies[7] = 1;
            } else {
                veggies[7] = 0;
            }
            if (b8.isSelected()) {
                veggies[8] = 1;
            } else {
                veggies[8] = 0;
            }

            order.setVeggies(veggies);
            f.setVisible(false);
            addCookie();
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
