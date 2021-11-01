package com.company;

public class DualSpinner {
    /** Precondition: min < max
     */
    /*The spin method simulates a spin of a fair spinner.
     * The method returns a random integer between min and max,
     * inclusive. Complete the spin method below by assigning
     * this random integer to result.
     */
    public int spin(int min, int max) {
        int result = (int)(Math.random()*(max+1-min)+min);
        return result;
    }

    /** Simulates one round of the game as described in part (b).
     */
    public void playRound() {
        int player = spin(1,10);
        int computer = spin(2,8);
        if (player > computer){
            int point = player-computer;
            if (Math.abs(point) == 1 ) System.out.println("You win! " + point + " point." );
            else System.out.println("You win! " + point + " points." );
        }
        else if (player < computer){
            int point = player-computer;
            if (Math.abs(point) == 1 ) System.out.println("You lose. " + point + " point." );
            else System.out.println("You lose. " + point + " points." );
        }
        else{
            player = spin(1,10);
            computer = spin(2,8);
            if (player > computer)System.out.println("You win! 1 point." );
            else if (player < computer)System.out.println("You lose. -1 point." );
            else System.out.println("Tie. 0 points.");
        }
    }
    public static void main(String[] args) {
        DualSpinner ds = new DualSpinner();
        for(int i = 0; i < 10; i++){
            ds.playRound();
        }
    }
}

//You win! 5 points.
//You win! 1 point.
//You win! 4 points.
//You lose. -6 points.
//You win! 2 points.
//You lose. -2 points.
//You lose. -4 points.
//You lose. -4 points.
//You lose. -2 points.
//You win! 4 points.
//
//Process finished with exit code 0