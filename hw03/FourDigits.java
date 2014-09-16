//Huanlun Li
import java.util.Scanner;
public class FourDigits {
    public static void main(String[] args) {
        Scanner MS;
        MS = new Scanner( System.in );
        System.out.print("Enter the double x: ");
        double x=MS.nextDouble();
        //To remove the number before the decimal point
        int y= (int) x;
        double z=x-y;
        z=z*10000;
        int a= (int) z;
        //To ensure the "0" before the four digits
        if (a>999&&a<10000) {
            System.out.println("The four digits are "+a);
        }
        if (a>99&&a<1000) {
            System.out.println("The four digits are 0"+a);
        }
        if (a>9&&a<100) {
            System.out.println("The four digits are 00"+a);
        }
        if (a>-1&&a<10) {
            System.out.println("The four digits are 000"+a);
        }
        
    }
    
}
