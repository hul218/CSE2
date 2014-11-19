public class test{

public static void main(String[] args) {
int i = 6;
          printPattern(i);
     }

public static void printPattern(int i) {
        // Fill in the code here to print the 
   // pattern.
        for(int k = i;k>=0; k--)
        {
        	 for (int m = i-k-1; m>=0; m++)
           {
System.out.print("  ");
           }
           for (int j = 0; j<k; j++)
           {
System.out.print((j+1) +" ");
           }
           System.out.print("\n");
       }
     }
}