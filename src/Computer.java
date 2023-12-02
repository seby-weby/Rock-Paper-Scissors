package src;

import jDat.*;

public class Computer {
    public final String name = "ChatGPT v6.9";
    private final int maxNum = 3;
    private final String[] victoryMessages = {
            " was outclassed by ",
            " got decimated by ",
            " was wrecked by ",
            " was destroyed by ",
            " was outsmarted by ",
            " got easily defeated by ",
            "'s skill was overestimated by ",
            " couldn't handle the crazy skills of ",
            " should have locked in while facing ",
            " never stood a chance against ",
            " couldn't phone a friend against ",
            " couldn't last five seconds against ",
            " needed 1000 more years of training before going up against ",
            " lacked the skill to defeat ",
            " was filleted by "
    };
    private final String[] defeatMessages = {
            " was barely defeated by ",
            " was cheated out of a win by ",
            " narrowly lost to ",
            " nearly beat ",
            " was hacked by ",
            " couldn't defeat ",
            " wants revenge against ",
            " needs to train to defeat ",
            " was gaslight by ",
            " needs a few tweaks to beat ",
            " can't keep up with ",
            " lost (because of a bug) to ",
            " was cheezed by ",
            " made a type against ",
            " can't compute the skill of ",
            " is fuming after a loss to "
    };
    private final String[] drawMessages = {
            " was allowed to draw by ",
            " barely held on against ",
            " didn't want to hurt the feelings of ",
            " needed a breather before facing ",
            " didn't want to lose so quickly ",
            " is delaying the inevitable loss against ",
            " is barely keeping up with ",
            " has just finished warming up against ",
            " took it easy on ",
            " was spared by ",
            " needed a haircut before battling ",
            " allowed an oil change for ",
            " let the devs make some last minute changes to ",
            " needed to phone a friend against ",
            " barely escaped ",
            " went after "
    };

    // Return 0 if player wins, 1 if player loses, or 2 if it's a draw
    public int didIWin(Player p) {
        int cc = (int) Math.floor(Math.random() * maxNum);
        int pc = p.getChoice();
        // Check if it's a draw
        if (cc == pc) {
            p.draws++;
            p.update();
            return 2;
        }
        // Check if player won if not, they lose
        if (cc == 0 && pc == 1) {
            p.wins++;
            p.update();
            return 0;
        }
        if (cc == 1 && pc == 2) {
            p.wins++;
            p.update();
            return 0;
        }
        if (cc == 2 && pc == 0) {
            p.wins++;
            p.update();
            return 0;
        }
        p.losses++;
        p.update();
        return 1;
    }

    // Print Victory/Defeat/Draw messages
    public String playerWon(Player p, int score) {
        int randomNum = (int) Math.floor(Math.random() * victoryMessages.length);
        if (score == 0) {
            return name + defeatMessages[randomNum] + p.name + "\n\nWIN" + "\nRecord: | " + p.wins + "-" + p.losses
                    + "-" + p.draws + " | (Win/Loss/Draw)";

        }
        if (score == 1) {
            return p.name + victoryMessages[randomNum] + name + "\n\nLOSS" + "\nRecord: | " + p.wins + "-" + p.losses
                    + "-" + p.draws + " | (Win/Loss/Draw)";

        }
        return p.name + drawMessages[randomNum] + name + "\n\nDRAW" + "\nRecord: | " + p.wins + "-" + p.losses + "-"
                + p.draws + " | (Win/Loss/Draw)";
    }
}