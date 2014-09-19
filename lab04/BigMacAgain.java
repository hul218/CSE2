//Huanlun Li section 110
//Order system with cost calculations
import java.util.Scanner;  //import first
public class BigMacAgain {    //define class
    public static void main(String[] args) {  //main method
        Scanner MS;
        MS = new Scanner( System.in );
        System.out.print("Enter the number of Big Macs: ");
        if (MS.hasNextInt()) {
            int NoBM=MS.nextInt(); //allow user to enter data
            if (NoBM>=0){
                System.out.println("You ordered "+NoBM+"Big Macs for a cost of "+NoBM+"x2.22=$"+(NoBM*2.22));//Cost of BigMacs
                System.out.print("Do you want an order of fries (Y/y/N/n)?");
                String YoN=MS.next();//Allow user to answer
                if (YoN.equals ("Y")||YoN.equals ("y")) {
                    System.out.println("You ordered fries at a cost of $2.15.");
                    System.out.println("The total cost of the meal is $"+(NoBM*2.22+2.15));
                }//if Yes
                else if (YoN.equals ("N")||YoN.equals ("n")) {
                    System.out.println("The total cost of the meal is $"+(NoBM*2.22));
                }//if No
                else {
                    System.out.println("Error!");
                }
            }
            else {
                System.out.println("You didn't enter a non-negative int");
            }
        }
        else {
            System.out.println("You didn't enter an int");
            return;
        }
        
        
    }
}