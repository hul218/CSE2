//Huanlun Li [CSE02-110] Root.java 10/12/2014
import java.util.Scanner;
public class Root {
    public static void main(String[] args) {
        Scanner input = new Scanner( System.in );
        System.out.print("Enter a double that is greater than 0: ");
        if (input.hasNextDouble()) { //ensure user enter a number
            double x=input.nextDouble();
            if (x>=0) { //ensure user enter a non-negative number
                double low=0;
                double high=x+1;
                double diff=high-low;
                double middle=0;
                while (diff>=0.0000001*(x+1)) { //loop will stop when the difference of high and low is small enough
                    middle=(high+low)/2; 
                    double midsqu=(middle*middle); //midsqu is the square of middle number
                    if (midsqu>x) {
                        high=middle;
                    }
                    else if (midsqu<x) {
                        low=middle;
                    }
                    diff=(high-low);
                }
                System.out.println("The square root of "+x+" is about "+middle);
            }
            else {
                System.out.println("You did not enter a number greater than 0.");
            }
        }
        else {
            System.out.println("You did not enter a double.");
        }
    }
}