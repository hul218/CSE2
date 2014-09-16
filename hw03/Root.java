//Huanlun Li
import java.util.Scanner;
public class Root {
    public static void main(String[] args) {
         Scanner MS;
         MS = new Scanner( System.in );
         System.out.print("Enter the number x: ");
         double x=MS.nextDouble();
         double SR=x/3;//guessed square root
         SR=(2*SR*SR*SR+x)/(3*SR*SR);
         SR=(2*SR*SR*SR+x)/(3*SR*SR);
         SR=(2*SR*SR*SR+x)/(3*SR*SR);
         SR=(2*SR*SR*SR+x)/(3*SR*SR);
         SR=(2*SR*SR*SR+x)/(3*SR*SR);
         System.out.println("The cube root is: "+SR);
    }
}
