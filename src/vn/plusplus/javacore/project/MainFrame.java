package vn.plusplus.javacore.project;

import javax.swing.*;
import java.awt.*;

public class MainFrame {
    public static void main(String[] args) {
        JFrame mainFrame = new JFrame("PROJECT JAVA CORE");
        mainFrame.setSize(800, 600);
        mainFrame.setLayout(new FlowLayout());
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        JPanel mainPanel = new JPanel();
        mainPanel.setBounds(0,0, 800, 100);
        mainPanel.setLayout(new FlowLayout());
        JLabel titleLb = new JLabel("THUC HIEN PHEP TINH");
        titleLb.setForeground(Color.green);
        titleLb.setFont(new Font("Serif", Font.BOLD, 24));
        mainPanel.add(titleLb);


        JLabel nhapA = new JLabel("Nhap a: ");
        mainPanel.add(nhapA);
        JTextField nhapAText = new JTextField(20);
        mainPanel.add(nhapAText);

        JLabel nhapB = new JLabel("Nhap b: ");
        mainPanel.add(nhapB);
        JTextField nhapBText = new JTextField(20);
        mainPanel.add(nhapBText);


        JButton okButton = new JButton("OK");
        okButton.addActionListener(e -> {
            String a = nhapAText.getText();
            String b = nhapBText.getText();

            int c = Integer.valueOf(a) + Integer.valueOf(b);

            titleLb.setText("Tong a+b=" + c);
        });

        JButton clearButton = new JButton("CLEAR");
        clearButton.addActionListener(e -> {
            nhapAText.setText("");
            nhapBText.setText("");
        });

        mainPanel.add(okButton);
        mainPanel.add(clearButton);

        mainFrame.add(mainPanel);
        mainFrame.setVisible(true);
    }
}
