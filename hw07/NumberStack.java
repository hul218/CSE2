//Huanlun Li [CSE02-110] Oct 20 NumberStack.java

import java.util.Scanner;  //import first
public class NumberStack {
    public static void main(String[] args) {  //main method
        Scanner MS = new Scanner( System.in );
        System.out.print("Enter a number between 1 and 9- ");
        if (MS.hasNextInt()) {   //ensure number user entered is an int
            int x=MS.nextInt();   //user enters the number x
            if (x>=1&&x<=9) {   //ensure number user entered is in range 1-9
                System.out.println("Using for loops:"); //For Loop
                for (int n=1;n<=x;n++) { 
                    String div="",outNum="";   //div (dividing lines) controls number of "-"
                                               //outNum (number output) controls number of x appeared
                    for(int col=0;col<n*2-1;col++) {   //In one row, control the number of columns 
                        div+="-";   
                        outNum+=n;   
                    }
                    for (int row=0; row<n; row++) {   //With fixed number of columns, control the number of rows
                        System.out.println(outNum); 
                    }
                    System.out.println(div);
                } //output end
                System.out.println(" ");
                System.out.println("Using while loops:"); //While Loop
                int n=1;//start
                while (n<=x) {
                    String div="",outNum="";
                    int col=0; int row=0;
                    while (col<n*2-1) {
                        div+="-";
                        outNum+=n;
                        col++;
                    }
                    while (row<n) {
                        System.out.println(outNum);
                        row++;
                    }
                    System.out.println(div);
                    n++;
                }//output end
                System.out.println(" ");
                System.out.println("Using do-while loops:"); //Do-While Loop
                n=1;//start
                do {
                    String div="",outNum="";
                    int col=0; int row=0;
                    do{
                        div+="-";
                        outNum+=n;
                        col++;
                    }while (col<n*2-1);
                    do{
                        System.out.println(outNum);
                        row++;
                    }while (row<n);
                    System.out.println(div);
                    n++;
                }while (n<=x);
            }//output end
            else {
                System.out.println("You did not enter an int in required range.");
            }
        }
        else {
            System.out.println("You did not enter an int.");
        }
    }
}//end