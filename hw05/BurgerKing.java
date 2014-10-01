//Huanlun Li [CSE 002-110]  9/27/2014 BurgerKing.java  hw05
import java.util.Scanner;//import
public class BurgerKing { //define the class
    public static void main(String[] args) { //main method
        Scanner MS;
        MS = new Scanner( System.in ); 
        System.out.println("Enter a letter to indicate a choice of"); //print question
        System.out.println("Burger (B or b)");
        System.out.println("Soda (S or s)");
        System.out.print("Fries (F or f)  ");
            String letter=MS.next(); // store the varible that user entered
            if (letter.equals ("B")||letter.equals ("b")) { //if user entered B or b
                System.out.println("Enter A or a for 'all the fixins'");
                System.out.println("C or c for cheese");
                System.out.print("N or n for none of the above ");
                String letterB=MS.next(); //store the varible that user entered
                if (letterB.equals ("A")||letterB.equals ("a")) {
                    System.out.println("You ordered a burger with all the fixins.");
                }
                else if (letterB.equals ("C")||letterB.equals ("c")) {
                    System.out.println("You ordered a burger with cheese.");
                }
                else if (letterB.equals ("N")||letterB.equals ("n")) {
                       System.out.println("You ordered a burger.");
                }
                else { //if user entered something don't match the condition listed above
                    System.out.println("You did not enter any of A,a,C,c,N or n.");
                    return;
                }
            }
            else if (letter.equals("S")||letter.equals("s")) {
                System.out.println("Do you want Pepsi (p or P),");
                System.out.print("Coke (c or C), Sprite (s or S) or Mountain Dew (M or m) ");
                String letterS=MS.next();
                if (letterS.equals ("P")||letterS.equals ("p")) {
                    System.out.println("You ordered a Pepsi.");
                }
                else if (letterS.equals ("C")||letterS.equals ("c")) {
                    System.out.println("You ordered a Coke.");
                }
                else if (letterS.equals ("S")||letterS.equals ("s")) {
                    System.out.println("You ordered a Sprite.");
                }
                else if (letterS.equals ("M")||letterS.equals ("m")) {
                    System.out.println("You ordered a Mountain Dew.");
                }
                else {
                    System.out.println("You did not enter any of P,p,C,c,S or s.");
                    return;
                }
            }
                else if (letter.equals ("F")||letter.equals ("f")) {
                    System.out.print("Do you want a large or small order of fries (l,L,s, or S) ");
                    String letterF=MS.next();
                    if (letterF.equals ("L")||letterF.equals ("l")) {
                        System.out.println("You ordered large fries.");
                    }
                    else if (letterF.equals ("S")||letterF.equals ("s")) {
                        System.out.println("You ordered small fries.");
                    }
                    else {
                        System.out.println("You did not enter any of L,l,S or s.");
                        return;
                    }
                }
                else if (letter.length()!=1) { //check the length of varible user entered, when user did not enter a single character, print sentence below
                    System.out.println("a single character expected.");
                }
                else {
                System.out.println("You did not enter any of B, b, S, s, F, or f.");
                }
        }
}
