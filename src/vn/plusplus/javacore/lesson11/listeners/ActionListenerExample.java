package vn.plusplus.javacore.lesson11.listeners;

import javax.swing.*;

public class ActionListenerExample {
    JButton button;
    JPanel p;

    public static void main(String[] args){
        ActionListenerExample object = new ActionListenerExample();

        object.createFrame();
        object.handlerActionEvent();
    }

    private void createFrame(){
        JFrame f = new JFrame("Action Listener Ex");
        p = new JPanel();
        button = new JButton("Click me");
        p.add(button);

        f.add(p);
        f.setSize(600, 600);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }

    private void handlerActionEvent(){
        /*button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                createDialog();
            }
        });*/

        button.addActionListener(e -> {
            System.out.println("Phat hien click button");
            displayText();
        });
    }

    private void displayText(){
        JLabel l = new JLabel("Text display by click button");
        l.setBounds(10, 10, 100, 20);
        p.add(l);
    }
}
