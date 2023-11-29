package src;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Runner extends Frame{
    Runner(){
    // Create Buttons
    Button rockButton = new Button("Rock");
    Button paperButton = new Button("Paper");
    Button scissorsButton = new Button("Scissors");
    // Position Buttons
    rockButton.setBounds(0, 100, 80, 30);
    paperButton.setBounds(100, 100, 80, 30);
    scissorsButton.setBounds(200, 100, 80, 30);
    // Add Event Listeners to the buttons
    rockButton.addActionListener(new ActionListener() {    
        public void actionPerformed (ActionEvent e) {    
                System.out.println("Rock");    
            }
        });  
    paperButton.addActionListener(new ActionListener() {    
        public void actionPerformed (ActionEvent e) {    
                System.out.println("Paper");    
            }    
        });  
    scissorsButton.addActionListener(new ActionListener() {    
        public void actionPerformed (ActionEvent e) {    
                System.out.println("Scissors");    
            }    
        });  
    // Add Buttons to the Frame
    add(rockButton);
    add(paperButton);
    add(scissorsButton);
    // Set window size
    setSize(300, 300);
    // Set window title
    setTitle("Rock Paper Scissors");
    // Not using layout manager
    setLayout(null);
    // Make window visible
    setVisible(true);
    }
    public static void main(String[] args){
        Runner Game = new Runner();
    }
}
