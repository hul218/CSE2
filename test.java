public class test{

public static void main(String[] args) {
 int[] A = {4, 9-2, 25, -7, 13, 23, -16};
for(int i = 0; i<=A.length; i++){
		A[i/2]*=2;
}
for (int j=0;j<A.length;j++){
System.out.println(A[j]);
}
     }

     
     
     
/*
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
*/
}
