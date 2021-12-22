package ru.mirea.task11;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Test3 extends JFrame {
    public Test3() {
        super("Пример JTextArea");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(400, 300);
        setLocationRelativeTo(null);

        // Cоздание многострочных полей
        JTextArea area = new JTextArea("", 8, 10);
        // Шрифт и табуляция
        area.setFont(new Font("Font", Font.PLAIN, 14));
        area.setTabSize(10);
        // Параметры переноса слов
        area.setLineWrap(true);
        area.setWrapStyleWord(true);

        JPopupMenu menu1 = new JPopupMenu();
        JMenuItem mnuRed = new JMenuItem("red");
        menu1.add(mnuRed);
        JMenuItem mnuGreen = new JMenuItem("green");
        menu1.add(mnuGreen);
        JMenuItem mnuBlue = new JMenuItem("blue");
        menu1.add(mnuBlue);

        JPopupMenu menu2 = new JPopupMenu();
        JMenuItem mnuItalic = new JMenuItem("italic");
        menu2.add(mnuItalic);
        JMenuItem mnuBold = new JMenuItem("bold");
        menu2.add(mnuBold);
        JMenuItem mnuPlain = new JMenuItem("plain");
        menu2.add(mnuPlain);

        JButton btnMenu1 = new JButton("Color");
        btnMenu1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                menu1.show(btnMenu1, 0, -menu1.getPreferredSize().height);
            }
        });
        JButton btnMenu2 = new JButton("Font");
        btnMenu2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                menu2.show(btnMenu2, 0, -menu2.getPreferredSize().height);
            }
        });

        mnuRed.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                area.setForeground(Color.red);
            }
        });
        mnuGreen.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                area.setForeground(Color.green);
            }
        });
        mnuBlue.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                area.setForeground(Color.blue);
            }
        });

        mnuItalic.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                area.setFont(new Font("new", Font.ITALIC, 14));
            }
        });
        mnuBold.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                area.setFont(new Font("new", Font.BOLD, 14));
            }
        });
        mnuPlain.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                area.setFont(new Font("new", Font.PLAIN, 14));
            }
        });

        Container container = this.getContentPane();
        container.setLayout(new GridLayout(2, 1));
        container.add(btnMenu1);
        container.add(btnMenu2);
        container.add(area);

        setVisible(true);
    }
    public static void main(String[] args) {
        new Test3();
    }
}
