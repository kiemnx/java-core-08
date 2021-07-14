package vn.plusplus.javacore.lesson11;

import javax.swing.*;

public class TopContainerExample {
    public static void main(String[] args) {
        JButton btnOK;
        JButton btnReset;
        JFrame f = new JFrame("Thuc hien phep tinh");

        JPanel p = new JPanel();
        btnOK = new JButton("OK");
        btnReset = new JButton("RESET");

        JTextField textField = new JTextField(10);
        JPasswordField passwordField = new JPasswordField(10);
        p.add(btnOK);
        p.add(btnReset);
        p.add(textField);
        p.add(passwordField);

        f.add(p);
        f.setSize(200, 400);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);

       /* JDialog d = new JDialog(new JFrame(), "Dialog Example");
        JLabel l = new JLabel("This is a dialog frame");
        l.setBounds(10, 10, 100, 20);
        d.add(l);
        d.setBounds(400, 400, 200, 200);
        d.setVisible(true);*/
    }
}
