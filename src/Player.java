package src;

public class Player{
    public String name;
    private int choice;
    
    // Empty Constructor (Just Name)
    public Player(String name){
        this.name = name;
    }
    // Constructor with Choice
    public Player(String name, String choice){
        this.name = name;
        setChoice(choice);
    }
    // Set Choice with String
    public void setChoice(String choice){
        // Check if choice was rock paper or scissors
        if(choice == "Rock" || choice == "rock"){
            this.choice = 0;
        } else if(choice == "Paper" || choice == "paper"){
            this.choice = 1;
        }else if(choice == "Scissors" || choice == "scissors"){
            this.choice = 2;
        }
    }
    // Set choice directly
    public void setChoice(int choice){
        this.choice = choice;
    }
    // Get choice
    public int getChoice(){
        return choice;
    }
}