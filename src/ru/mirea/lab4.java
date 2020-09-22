package ru.mirea;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class lab4 extends JFrame {

    private static final long serialVersionUID = 1L;
    private final JButton MilanButton = new JButton("AC Milan");
    private final JButton MadridButton = new JButton("Real Madrid");
    private final JLabel ResultLabel = new JLabel("Result 0 / 0");
    private final JLabel LastScoreLabel = new JLabel("Last scorer: N/A");
    private final JLabel WinnerLabel = new JLabel("Winner: DRAW");
    private int milanScore = 0;
    private int madridScore = 0;
    private final int ButtonWidth = 200;
    private final int ButtonHeights = 30;
    private final int TextHeight = 10;

    private void changeWinner() {
        if (milanScore > madridScore)
            WinnerLabel.setText("Winner: Милан");
        else if (milanScore == madridScore)
            WinnerLabel.setText("Winner: Ничья");
        else
            WinnerLabel.setText("Winner: Мадрид");
    }

    lab4() {
        super("lol");
        super.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLayout(null);
        setSize(500, 300);
        add(MilanButton);
        add(MadridButton);
        add(ResultLabel);
        add(LastScoreLabel);
        add(WinnerLabel);
        MilanButton.setBounds(300, TextHeight + 20, ButtonWidth, ButtonHeights);
        MadridButton.setBounds(300, TextHeight + 60, ButtonWidth, ButtonHeights);
        ResultLabel.setBounds(100, TextHeight, 150, 50);
        LastScoreLabel.setBounds(100, TextHeight + 30, 300, 50);
        WinnerLabel.setBounds(100, TextHeight + 60, 300, 50);

        MilanButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent e) {
                milanScore += 1;
                ResultLabel.setText("Result: " + milanScore + " / " + madridScore);
                LastScoreLabel.setText("Last Scorer: Милан");
                changeWinner();
            }
        });

        MadridButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent e) {
                madridScore += 1;
                ResultLabel.setText("Result: " + milanScore + " / " + madridScore);
                LastScoreLabel.setText("Last Scorer: Мадрид");
                changeWinner();
            }
        });
        setVisible(true);
    }
//virus927
}
