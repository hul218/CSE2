//Huanlun Li  Sep. 21 2014  Month.java  [CSE 002-110]
import java.util.Scanner; //import firts
public class Month { //define the class
    public static void main(String[] args) { //main method
        Scanner MS;
        MS = new Scanner( System.in );
        System.out.print("Enter an int giving the number of the month (1-12): ");
        if (MS.hasNextInt()) { //ensure user enter an int
            int month=MS.nextInt(); //allow user enter month
            if (month>=1&&month<=12) { //ensure month is in range
                if (month==1||month==3||month==5||month==7||month==8||month==10||month==12) { //months with 31 days
                    System.out.println("The month has 31 days.");
                }
                else if (month==4||month==6||month==8||month==11) { //months with 30days
                    System.out.println("The month has 30 days.");
                }
                else { //Feburary(2) is the "else" and need more info to determine
                    System.out.print("Enter an int giving the year: ");
                    if (MS.hasNextInt()) { //ensure the year is int
                        int year=MS.nextInt();
                        if (year>0) { //ensure the year is positive int
                            int remain=year%4; //Leap year can be divided by 4 without remains
                            if (remain!=0) {
                                System.out.println("The month has 28 days.");
                            }
                            else {
                                double rem1=year%400;
                                double rem2=year%100;
                                if (rem1!=0&&rem2==0) { //to exclude years like 1900
                                    System.out.println("The month has 28 days.");
                                }
                                else {
                                    System.out.println("The month has 29 days.");
                                }
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
            else {
                System.out.println("You did not enter an int between 1 and 12.");
            }
        }
        else {
            System.out.println("You did not enter an int.");
        }
    }
}