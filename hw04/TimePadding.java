//Huanlun Li  Sep. 22 2014  TimePadding.java  [CSE 002-110]
import java.util.Scanner; //import firts
public class TimePadding { //define the class
    public static void main(String[] args) { //main method
        Scanner MS;
        MS = new Scanner( System.in );//allow user enter number
        System.out.print("Enter the time in seconds: ");
        if (MS.hasNextInt()) { //ensure user enter an int
            int sec=MS.nextInt();
            if (sec>=0) { //ensure user enter a positive int
                int min=sec/60;
                int remain=sec%60;
                int hr=sec/3600; //factors I will use
                if (sec<10) { // 1 digit sec
                    System.out.println("The time is: 00:00:0"+sec);
                }
                else if (sec>=10&&sec<60) { // 2 digits sec
                    System.out.println("The time is: 00:00:"+sec);
                }
                else if (sec>=60&&sec<=599) { // 1 digit min
                    if (remain<10) {
                        System.out.println("The time is: 00:0"+min+":0"+remain);
                    }
                    else { 
                        System.out.println("The time is: 00:0"+min+":"+remain);
                    }
                }
                else if (sec>=600&&sec<3600) { //2 digits min
                    if (remain<10) {
                        System.out.println("The time is: 00:"+min+":0"+remain);
                    }
                    else {
                        System.out.println("The time is: 00:"+min+":"+remain);
                    }
                }
                else { // process hr
                    int rem1min=sec%3600;
                    if (rem1min>=60&&rem1min<=599) { // 2 digits min
                        if (remain<10) {
                            System.out.println("The time is : "+hr+":0"+(rem1min/60)+":0"+remain);
                        }
                        else {
                            System.out.println("The time is : "+hr+":0"+(rem1min/60)+":"+remain);
                        }
                    }
                    else if (rem1min<60) { // has hr&sec but no min (0 digit min)
                        if (remain<10) {
                            System.out.println("The time is : "+hr+":00:0"+remain);
                        }
                        else {
                            System.out.println("The time is : "+hr+":00:"+remain);
                        }
                    }
                    else { // 1 digit min
                        if (remain<10) {
                            System.out.println("The time is : "+hr+":"+(rem1min/60)+":0"+remain);
                        }
                        else {
                            System.out.println("The time is : "+hr+":"+(rem1min/60)+":"+remain);
                        }
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