package src;

import jDat.*;

public class Player {
    public String name;
    private int choice;
    public Integer wins;
    public Integer losses;
    public Integer draws;
    jDat file;

    // Empty Constructor (Just Name)
    public Player(String name) {
        this.name = name;
        file = new jDat("data/Players/" + name + ".dat", true);
        // Set Name
        file.setVal("Name", name);
        // Pull values from file
        wins = file.getInt("wins");
        losses = file.getInt("losses");
        draws = file.getInt("draws");
        // In case of null value
        if (wins == null) {
            wins = 0;
        }
        if (losses == null) {
            losses = 0;
        }
        if (draws == null) {
            draws = 0;
        }
    }

    // Constructor with Choice
    public Player(String name, String choice) {
        this.name = name;
        setChoice(choice);
        file = new jDat("data/Players/" + name + ".dat", true);
        // Set Name
        file.setVal("Name", name);
        // Pull values from file
        wins = file.getInt("wins");
        losses = file.getInt("losses");
        draws = file.getInt("draws");
        // In case of a null value
        if (wins == null) {
            wins = 0;
        }
        if (losses == null) {
            losses = 0;
        }
        if (draws == null) {
            draws = 0;
        }
    }

    // Set Choice with String
    public void setChoice(String choice) {
        // Check if choice was rock paper or scissors
        if (choice == "Rock" || choice == "rock") {
            this.choice = 0;
        } else if (choice == "Paper" || choice == "paper") {
            this.choice = 1;
        } else if (choice == "Scissors" || choice == "scissors") {
            this.choice = 2;
        }
    }

    // Set choice directly
    public void setChoice(int choice) {
        this.choice = choice;
    }

    // Get choice
    public int getChoice() {
        return choice;
    }

    // Update File
    public void update() {
        file.setVal("wins", wins);
        file.setVal("losses", losses);
        file.setVal("draws", draws);
    }

    // ChangeFile
    public void change(String username) {
        name = username;
        setChoice(choice);
        file = new jDat("data/Players/" + name + ".dat", true);
        // Set Name
        file.setVal("Name", name);
        // Pull values from file
        wins = file.getInt("wins");
        losses = file.getInt("losses");
        draws = file.getInt("draws");
        // In case of a null value
        if (wins == null) {
            wins = 0;
        }
        if (losses == null) {
            losses = 0;
        }
        if (draws == null) {
            draws = 0;
        }
    }
}