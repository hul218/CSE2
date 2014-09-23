//Huanlun Li  Sep. 21 2014  CourseNumber.java  [CSE 002-110]
import java.util.Scanner; //import firts
public class CourseNumber { //define the class
    public static void main(String[] args) {//main method
        Scanner MS;
        MS = new Scanner( System.in );
        System.out.print("Enter a six digit number giving the course semester: ");
        if (MS.hasNextInt()) { //ensure the number user entered is int
            int No=MS.nextInt();
            if (No>=186510&&No<=201440) { //ensure the number in range
                double xxxx=No/100;
                int lol=(int) xxxx;
                int semester=No-(lol*100); //to get the last two digits
                if (semester==10||semester==20||semester==30||semester==40) { //to get correct semester number
                    if (semester==10) {
                        System.out.println("The course was offered in the spring semester of "+lol);
                    }
                    else if (semester==20) {
                        System.out.println("The course was offered in the summer 1 semester of "+lol);
                    }
                    else if (semester==30) {
                        System.out.println("The course was offered in the summer 2 semester of "+lol);
                    }
                    else {
                        System.out.println("The course was offered in the fall semester of "+lol);
                    }
                }
                else {
                    System.out.println(semester+" is not a legitimate semester.");
                }
                
            }
            else {
                System.out.println("The number was outside the range [186510,201440].");
            }
        }
        else {
            System.out.println("You did not enter an int.");
        }
    }
}