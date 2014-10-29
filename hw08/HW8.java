//Huanlun Li [CSE02-110] HW08 Oct 27
import java.util.Scanner;
public class HW8{
  public static void main(String []arg){
	char input;
	Scanner MS=new Scanner(System.in);
	System.out.print("Enter 'C' or 'c' to continue, anything else to quit- ");
	String scan=MS.next();
	input=getInput(scan,"Cc"); //method 1
	System.out.println("You entered '"+input+"'");
	System.out.print("Enter 'y', 'Y', 'n', or 'N'- ");
	input=getInput(scan,"yYnN",5); //give up after 5 attempts (method 2)
	if(input!=' '){
   	System.out.println("You entered '"+input+"'");
	}
	input=getInput(scan,"Choose a digit.","0123456789"); //method 3
	System.out.println("You entered '"+input+"'");
  }
  
  public static char getInput(String letter, String x) { //method 1
		int i=letter.length();
		while (i!=1) { //one character only or try again in loop
			Scanner M=new Scanner(System.in);
		  System.out.print("You should enter exactly one character-");
		  letter=M.next();
		  i=letter.length();
		  }
		while (!letter.equals ("C")&&!letter.equals ("c")) { //if not Cc, let user try again(loop) until Cc is entered
      Scanner ls=new Scanner(System.in);
      System.out.print("You did not enter a character from the list 'Cc'; try again-");
      letter=ls.next();
		}
		char let= letter.charAt(0); 
		return let; //return the right answer user entered
	}
	
	public static char getInput(String letter1, String y, int chance) { //method 2
		int i=letter1.length();
		int cs=0;
		while (i!=1&&cs<chance) { //only one character and 5 chances allowed or it will try again or break after 5 tries
			Scanner M=new Scanner(System.in);
		  System.out.print("You should enter exactly one character-");
		  letter1=M.next();
		  i=letter1.length();
		  cs++; //cs count the number user tried
		  }
		while (!letter1.equals ("Y")&&!letter1.equals ("y")&&!letter1.equals ("N")&&!letter1.equals ("n")&&cs<chance) {
      Scanner S=new Scanner(System.in);
      System.out.print("You did not enter a character from the list 'YyNn'; try again-");
      letter1=S.next();
      cs++; 
		}
		if (letter1.equals ('Y')||letter1.equals ('y')||letter1.equals ('N')||letter1.equals ('n')) {
			char let1=letter1.charAt(0); // change String to char and return it out
			return let1;
		}
		else {
			System.out.println("You failed after "+chance+" tries.");
			char let1=' ';
			return let1;
		}
	}
	
	public static char getInput(String letter2, String prt, String z) { //method 3
		System.out.print(prt);
		System.out.print("Enter one of: '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'-");
		int i=letter2.length();
		while (i!=1) { //only one character allowed
			Scanner J=new Scanner(System.in);
		  System.out.println("You should enter exactly one character.");
		  System.out.println(prt);
		  System.out.print("Enter one of: '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'-");
		  letter2=J.next();
		  i=letter2.length();
		  }
		while (!letter2.equals ("0")&&!letter2.equals ("1")&&!letter2.equals ("2")&&!letter2.equals ("3")&&!letter2.equals ("4")&&!letter2.equals ("5")&&!letter2.equals ("6")&&!letter2.equals ("7")&&!letter2.equals ("8")&&!letter2.equals ("9")) {
      Scanner S=new Scanner(System.in);
      System.out.print("You did not enter a acceptable character.");
      System.out.println(prt);
		  System.out.print("Enter one of: '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'-");
      letter2=S.next();
		}
		char let2= letter2.charAt(0); 
		return let2;
	}
}

