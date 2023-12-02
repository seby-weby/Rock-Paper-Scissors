package src;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import jDat.*;

public class Runner extends Frame {
    Color lightgrey = new Color(105, 105, 105);
    Color black = new Color(0, 0, 0);

    public Runner(Player p, Computer c) {
        // Text Field
        JTextField input = new JTextField("username");
        input.setForeground(lightgrey);
        // Create Buttons
        Button nameChange = new Button("Change");
        Button rockButton = new Button("Rock");
        Button paperButton = new Button("Paper");
        Button scissorsButton = new Button("Scissors");
        // Output text
        JTextArea text = new JTextArea("Baller");
        // Position TextField
        input.setBounds(0, 130, 150, 20);
        // Position Buttons
        nameChange.setBounds(153, 130, 75, 20);
        rockButton.setBounds(0, 100, 80, 30);
        paperButton.setBounds(100, 100, 80, 30);
        scissorsButton.setBounds(200, 100, 80, 30);
        // Position Text
        text.setBounds(0, 30, 500, 70);
        // Add event listener for input (to have some background text)
        input.addFocusListener(new FocusListener() {

            public void focusGained(FocusEvent e) {
                if (input.getText().contains("username")) {
                    input.setForeground(black);
                    input.setText("");
                }
            }

            public void focusLost(FocusEvent e) {
                if (input.getText().length() == 0) {
                    input.setForeground(lightgrey);
                    input.setText("username");
                }
            }
        });
        // Add Event Listeners to the buttons
        nameChange.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                p.change(input.getText());
                input.setForeground(lightgrey);
                input.setText("username");
            };
        });
        rockButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                p.setChoice("Rock");
                text.setText(c.playerWon(p, c.didIWin(p)));
            }
        });
        paperButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                p.setChoice("Paper");
                text.setText(c.playerWon(p, c.didIWin(p)));
            }
        });
        scissorsButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                p.setChoice("Scissors");
                text.setText(c.playerWon(p, c.didIWin(p)));
            }
        });
        // Add Buttons to the Frame
        add(nameChange);
        add(rockButton);
        add(paperButton);
        add(scissorsButton);
        // Set font and add text
        add(text);
        // Add Text Field
        add(input);
        // If player set choice with constructor
        text.setText(c.playerWon(p, c.didIWin(p)));
        // Set window size
        setSize(500, 175);
        // Set window title
        setTitle("Rock Paper Scissors");
        // Not using layout manager
        setLayout(null);
        // Make window visible
        setVisible(true);
    }

    public static void main(String[] args) {
        Computer computer = new Computer();
        Player player = new Player("Bob", "Rock");
        Runner Game = new Runner(player, computer);
        // player.file.clear();
    }
}
