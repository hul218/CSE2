import java.util.Scanner;
public class Methods{
	public static int larger(int num1, int num2) {
		int result;
		if (num1>num2)
		  result=num1;
		else 
		  result=num2;
   	
   	return result;
	}
  public static boolean ascending(int n1,int n2,int n3){
  	if (n1<=n2&&n2<=n3)
  	  {return true;}
  	else 
  	  {return false;}
  }
  
  	public static int getInt( Scanner three ){
  if (three.hasNextInt()) {
  	int th=three.nextInt();
  	return th;
  }
  else {
  	Scanner thr;
  	do{
      thr=new Scanner(System.in);
      System.out.print("You did not enter an int; try again ");
      
  	}while (!thr.hasNextInt());
  	int thre=thr.nextInt();
  	return thre;
  }
  }
  
  public static void main(String [] arg){
	Scanner scan=new Scanner(System.in);
	int a,b,c;
	System.out.println("Enter three ints");
	a=getInt(scan);
	b=getInt(scan);
	c=getInt(scan);
	System.out.println("The larger of "+a+" and "+b+" is "+larger(a,b));
	System.out.println("The larger of "+a+", "+b+", and "+c+
                   	" is "+larger(a,larger(b,c)));
	System.out.println("It is "+ascending(a,b,c)+" that "+a+", "+b+
                   	", and "+c+" are in ascending order");
  }
  
}