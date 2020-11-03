import javax.swing.*;
import java.io.FileNotFoundException;
import java.io.IOException;

class Menu {

    static void layout() {

        JFrame f=new JFrame("menu");
        f.setSize(400,300);
        JButton b=new JButton("New Sandwich");
        b.setBounds(0,0,200, 100);
        JButton b1=new JButton("Check Inventory");
        b1.setBounds(200,0,200, 100);
        JButton b2=new JButton("Add Inventory");
        b2.setBounds(0,100,200, 100);
        JButton b3=new JButton("Custom Order");
        b3.setBounds(200,100,200, 100);



        JTextField textField= new JTextField();
        textField.setBounds(210, 50, 130, 30);

        JLabel label1 = new JLabel();
        label1.setBounds(10, 170, 200, 100);
        f.add(label1);
        f.add(b);
        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //action listener
        b.addActionListener(arg0 -> {
            addOrder.addType();
            f.setVisible(false);
        });
        b1.addActionListener(arg0 -> {
            try {
                Inventory.InventoryCheck();
                f.setVisible(false);
            } catch (IOException e) {
                e.printStackTrace();
            }        });
        b2.addActionListener(arg0 -> {
            try {
                addInventory.InvSetup();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
            f.setVisible(false);
        });
        b3.addActionListener(arg0 -> {
            label1.setText("not yet implemented");
            f.setVisible(false);
            try {
                CustomOrder.addCustomOrder();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        });
    }
}
