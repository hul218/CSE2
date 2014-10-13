//Huanlun Li[CSE02-110] Root.java 10/12/2014
import java.util.Scanner;
public class Root {
    public static void main(String[] args) {
        Scanner input = new Scanner( System.in );
        System.out.print("Enter a double that is greater than 0: ");
        if (input.hasNextDouble()) {
            double x=input.nextDouble();
            if (x>0) {
                double low=0;
                double high=x+1;
                double diff=x+1;
                double middle=0;
                while (diff>=0.0000001*(x+1)) {
                    middle=high/2.0;
                    if (middle*middle>x) {
                        high=middle*middle;
                    }
                    else if (middle*middle<x) {
                        low=middle*middle;
                    }
                    diff=high-low;
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