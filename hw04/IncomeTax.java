//Huanlun Li  Sep. 21 2014  IncomeTax.java  [CSE 002-110]
import java.util.Scanner; //import firts
public class IncomeTax { //define the class
    public static void main(String[] args) { //main method
        Scanner MS;
        MS = new Scanner( System.in );
        System.out.print("Enter an int giving the number of thousands: ");
        if (MS.hasNextInt()) { //ensure user enter an int
            int inc=MS.nextInt(); //allow user to enter int inc
            if (inc>=0) { //ensure user enter a positive int
                if (inc<20) {
                    System.out.println("The tax rate on $"+inc+",000 is 5.0%, and the tax is $"+(inc*1000*0.05));
                }
                else if (inc>=20&&inc<40) {
                    System.out.println("The tax rate on $"+inc+",000 is 7.0%, and the tax is $"+(inc*1000*0.07));
                }
                else if (inc>=40&&inc<78) {
                    System.out.println("The tax rate on $"+inc+",000 is 12.0%, and the tax is $"+(inc*1000*0.12));
                }
                else {
                    System.out.println("The tax rate on $"+inc+",000 is 14.0%, and the tax is $"+(inc*1000*0.14));
                }
            }
            else {
                System.out.println("You did not enter a positive int.");
            }
        }
        else {
            System.out.println("You did not enter an int.");
        }
    }
}