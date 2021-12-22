package ru.mirea.task9;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

class Game extends JFrame {

    int resultA = 0;
    int resultB = 0;
    String lastScorer = "N/A";
    String winnerStr = "DRAW";
    JPanel[] pnl = new JPanel[3];
    JButton jButtonA = new JButton("Name1");
    JButton jButtonB = new JButton("Name2");
    JLabel jLabelRes = new JLabel(resultA + "X" + resultB);
    JLabel jLabelLastScore = new JLabel("Last Scorer: " + lastScorer);
    JLabel winner = new JLabel("Winner: " + winnerStr);

    public Game() {

        setLayout(new GridLayout(1, 3));
        int r, b, g;
        for (int i = 0; i < 3; i++) {
            pnl[i] = new JPanel();
            pnl[i].setBackground(new Color(144, 238, 144));
            add(pnl[i]);
            pnl[i].setLayout(new FlowLayout());
        }

        pnl[0].add(jButtonA);
        pnl[1].add(jLabelRes);
        pnl[1].add(jLabelLastScore);
        pnl[1].add(winner);
        pnl[2].add(jButtonB);


        jButtonA.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                resultA++;
                lastScorer = "Name1";
                if (resultA > resultB) {
                    winnerStr = "Name1";
                } else if (resultA == resultB) {
                    winnerStr = "DRAW";
                }
                jLabelRes.setText(resultA + "X" + resultB);
                jLabelLastScore.setText("Last Scorer: " + lastScorer);
                winner.setText("Winner: " + winnerStr);
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });

        jButtonB.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                resultB++;
                lastScorer = "Name2";
                if (resultA < resultB) {
                    winnerStr = "Name2";
                } else if (resultA == resultB) {
                    winnerStr = "DRAW";
                }
                jLabelRes.setText(resultA + "X" + resultB);
                jLabelLastScore.setText("Last Scorer: " + lastScorer);
                winner.setText("Winner: " + winnerStr);
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });
        setSize(500, 200);
    }
}

public class Test {

    public static void main(String[] args) {
        new Game().setVisible(true);
    }
}
