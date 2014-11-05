//Huanlun Li [CSE02-110] BlockedAgain.java Nov.4
import java.util.Scanner;
public class BlockedAgain{
    public static void main(String []s){
    int m;
    //force user to enter int in range 1-9, inclusive.
    m = getInt(); 
    allBlocks(m);
    }
//Line 9-49 Problem A
    public static int getInt(){
        Scanner scan=new Scanner(System.in);
	    System.out.print("Enter an in int between 1 and 9, inclusive:");
	    int x=checkInt(scan);
	    int y=checkRange(x);
	    return y;
    }

	public static int checkInt( Scanner A1 ){
        if (A1.hasNextInt()) {
  	       int a1=A1.nextInt();
  	       return a1;
        }
        else {
  	       Scanner a1;
  	       do{
              a1=new Scanner(System.in);
              System.out.print("You did not enter an int; try again ");
           }while (!a1.hasNextInt());
  	    int a=a1.nextInt();
  	    return a;
        }
	}
	
	public static int checkRange( int A2 ){
	    if ( A2>=1&&A2<=9 ){
	        return A2;
	    }
	    else {
	        Scanner a2;
	        int a=0;
	        do{
	            a2=new Scanner(System.in);
	            System.out.print("You did not enter an int in [1,9]; try again: ");
	            a=checkInt(a2);
	        }while (a<1&&a>9);
	        return a;
	    }
	}
	//Problem B:
	public static void allBlocks( int B ){
	    for (int n=1;n<=B;n++) {
	        String outNum=""; //outNum (number output) controls number of x appeared
	        for(int col=0;col<n*2-1;col++){
                    outNum+=n;
                }
	        for (int row=0; row<n; row++) {   //With fixed number of columns, control the number of rows
                    System.out.println((block(B,n)+outNum));
                }
            System.out.println(line(B,n));    
            }
	    }    
	
	
	public static String block( int input, int n){//This method determine the number of spaces needed to add before every line
	    String space="";
	    for(int spNo=input-n; spNo>=0; spNo--){
	        space+=" ";
	    }
	    return space;
	}
	
	public static String line( int in, int B1a ){ //output the line of division line ("-----")
                    String div="";   //div (dividing lines) controls number of "-"
                    for(int col=0;col<B1a*2-1;col++) {   //In one row, control the number of columns 
                        div+="-";   
                    }
                    String wc=block(in,B1a)+div;
                    return wc;
                }
	
}