package src;

public class Computer {
    public final String name = "ChatGPT Version 6";
    private final int maxNum = 2;
    // Return 0 if player wins, 1 if player loses, or 2 if it's a draw
    public int didIWin(Player p){
        int cc = (int)Math.round(Math.random() * maxNum);
        int pc = p.getChoice();
        // Check if it's a draw
        if(cc == pc){
            return 2;
        }
        // Check if player won if not, they lose
        if(cc == 0 && pc == 1){
            return 0;
        } else if (cc == 1 && pc == 2){
            return 0;
        } else if (cc == 2 && pc == 0){
            return 0;
        }
        return 1;
    }
}
