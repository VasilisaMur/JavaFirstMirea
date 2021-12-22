package ru.mirea.task11;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Test2 extends JFrame {
    private String[][] array = new String[][] {{ "1" , "NORTH", "2" },
            { "WEST"  , "CENTER", "EAST" },
            { "3", "SOUTH" , "4" }};
    private String[] columnsHeader = new String[] {"", "", ""};

    public Test2() {
        super("Map");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(400, 180);
        setVisible(true);
        setLocationRelativeTo(null);
        JTable table = new JTable(array, columnsHeader);
        table.setShowGrid(true);
        table.setRowHeight(50);
        table.setShowGrid(true);
        table.setGridColor(Color.black);
        table.setRowSelectionAllowed(false);

        table.addMouseListener(new MouseListener() {
            public void mouseClicked(MouseEvent e) {
                if(table.isColumnSelected(1) == true && table.isRowSelected(0) == true)
                    JOptionPane.showMessageDialog(Test2.this, "Добро пожаловать на север");
                if(table.isColumnSelected(0) == true && table.isRowSelected(1) == true)
                    JOptionPane.showMessageDialog(Test2.this, "Добро пожаловать на запад");
                if(table.isColumnSelected(1) == true && table.isRowSelected(1) == true)
                    JOptionPane.showMessageDialog(Test2.this, "Добро пожаловать в center");
                if(table.isColumnSelected(2) == true && table.isRowSelected(1) == true)
                    JOptionPane.showMessageDialog(Test2.this, "Добро пожаловать на восток");
                if(table.isColumnSelected(1) == true && table.isRowSelected(2) == true)
                    JOptionPane.showMessageDialog(Test2.this, "Добро пожаловать на юг");
            }
            public void mousePressed(MouseEvent e) {}
            public void mouseReleased(MouseEvent e) {}
            public void mouseEntered(MouseEvent e) {}
            public void mouseExited(MouseEvent e) {}
        });

        // Размещение таблиц в панели с блочным расположением
        Container contents = this.getContentPane();
        contents.add(table);
    }

    public static void main(String[] args) {
        new Test2();
    }
}
