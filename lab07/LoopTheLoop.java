//Huanlun Li lab07 CSE 002-110
import java.util.Scanner;
public class LoopTheLoop {
    public static void main(String[] args) {
        Scanner MS=new Scanner( System.in );
        while (true) {
        System.out.print("Enter an int between 1 and 15: ");
        if (MS.hasNextInt()) {
            int nStars=MS.nextInt();
            if (nStars>=1&&nStars<=15) {
                int x=1;
                while (x<nStars) {
                    System.out.print("*");
                    x++;
                }
                if (x==nStars) {
                    System.out.println("*");
                }
                int n=1;
                while (n<=nStars) {
                    int m=1;
                    while (m<n) {
                        System.out.print("*");
                        m++;
                    }
                    System.out.println("*");
                    n++;
                }
            }
            else {
                System.out.println("Your int was not in the range [1.15].");
            }
        }
        else {
            System.out.println("You did not enter an int.");
        }
        System.out.print("Enter y or Y to go again: ");
        String letter=MS.next();
        if (letter.equals ("y")||letter.equals ("Y")) {
        }
        else {
            break;
        }
    }   
    }
}