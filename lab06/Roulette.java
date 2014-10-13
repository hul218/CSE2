//Huanlun Li [CSE02-110] Roulette.java 10/12/2014
import java.util.Scanner;
public class Roulette {
    public static void main(String[] args) {
        Scanner MS=new Scanner( System.in );
        System.out.print("Enter an int between 1 and 38 as the number you bet: ");
        if (MS.hasNextInt()) { //ensure number entered is an int
            int Bet=MS.nextInt();
            if (Bet>=1&&Bet<=38) { //ensure number entered is in range
                int N=0; //N is the number of repetitions of 100 spins
                int win=0; //win is the number of repetitions of 3 winnings 
                int lose=0; //lose is the number of repetitions with no winning
                int walkAway=0; //walkAway is the number of repetitions with profit( 0<winning<3 ) but walk away
                while (N<1000) { //loop 1000 repetitions
                    int n=0;
                    int correct=0; //correct is the number of winning of 1 spin
                    while (n<100) { //loop 100 spins
                        int RN=(int) ((Math.random()*38)+1); //RN is random number between 1 and 38
                        n++;
                        if (Bet==RN) { //winning in 1 spin
                            correct++;
                        }
                        if (correct==3){ //win 1 repetition
                        win++;
                        break; //win a spin and leave
                        }
                    }
                    if (correct==0) { //lose 1 repetition
                        lose++;
                    }
                    else if (correct>0&&correct<3) { //walk away with profit in 1 repetition
                        walkAway++;
                    }
                    N++;
                    if (N==1000) { //loop of repetitions finished 
                       System.out.println("The number of times you lose everthing: "+lose);
                       System.out.println("The total winnings: "+win);
                       System.out.println("The number of times you walked away with a profit in one session of 100 spins of the wheel: "+walkAway);
                       break;
                    }
                }
            }
            else {
                System.out.println("You did not enter a number in range.");
            }
        }
        else {
            System.out.println("You did not enter an int.");
        }
    }
}
