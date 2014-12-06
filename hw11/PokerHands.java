import java.util.Scanner;
public class PokerHands{
	public static void main(String [] arg){
		while (true) {
			Scanner MS=new Scanner(System.in);
			System.out.println("Enter 'y' or 'Y' to enter a(nother) hand- ");
			String scan=MS.next();
			if (scan.equals ("y")||scan.equals ("Y")){
				int[] hand=new int[5];
				for (int x=0; x<5; x++){
					Scanner M=new Scanner(System.in);
					System.out.println("Enter the suit: 'c', 'd', 'h', or 's'- ");
					String sc=M.next();
				    while (!sc.equals ("c")&&!sc.equals ("d")&&!sc.equals ("h")&&!sc.equals ("s")){
				    System.out.println("You did not enter a valid response");
				    System.out.println("Enter the suit: 'c', 'd', 'h', or 's'- ");
				    sc=M.next();
				    }
				    int a=0;
				    if (sc.equals ("c")){
				    	Scanner S=new Scanner(System.in);
				    	System.out.println("Enter one of 'a', 'k', 'q', 'j', '10', ...'2'- ");
				    	String s=S.next();
				    	a=changeittonumber(s);
				    }
				    else if (sc.equals ("d")){
				    	Scanner S=new Scanner(System.in);
				    	System.out.println("Enter one of 'a', 'k', 'q', 'j', '10', ...'2'- ");
				    	String s=S.next();
				    	a=changeittonumber(s)+13;
				    }
				    else if (sc.equals ("h")){
				    	Scanner S=new Scanner(System.in);
				    	System.out.println("Enter one of 'a', 'k', 'q', 'j', '10', ...'2'- ");
				    	String s=S.next();
				    	a=changeittonumber(s)+26;
				    }
				    else if (sc.equals ("s")){
				    	Scanner S=new Scanner(System.in);
				    	System.out.println("Enter one of 'a', 'k', 'q', 'j', '10', ...'2'- ");
				    	String s=S.next();
				    	a=changeittonumber(s)+39;
				    }
				    hand[x]=a;
				}
				showOneHand(hand);
			}
			else {break;}
		}
	}
	
	public static int changeittonumber(String s){
		int y=0;
		if (s.equals ("a")){y=0;}
		else if (s.equals ("k")){y=1;}
		else if (s.equals ("q")){y=2;}
		else if (s.equals ("j")){y=3;}
		else if (s.equals ("10")){y=4;}
		else if (s.equals ("9")){y=5;}
		else if (s.equals ("8")){y=6;}
		else if (s.equals ("7")){y=7;}
		else if (s.equals ("6")){y=8;}
		else if (s.equals ("5")){y=9;}
		else if (s.equals ("4")){y=10;}
		else if (s.equals ("3")){y=11;}
		else if (s.equals ("2")){y=12;}
		else {System.out.println ("Wrong input.");}
		return y;
	}



 public static void showOneHand(int hand[]){
	String suit[]={"Clubs:	", "Diamonds: ", "Hearts:   ","Spades:   "};
	String face[]={
       "A ","K ","Q ","J ","10 ","9 ","8 ","7 ","6 ","5 ",
  	"4 ","3 ","2 "};
	String out="";
	for(int s=0;s<4;s++){
  	out+=suit[s];
  	for(int rank=0;rank<13;rank++)
    	for(int card=0;card<5;card++)
     	if(hand[card]/13==s && hand[card]%13==rank)
      	out+=face[rank];
  	out+='\n';
	}
	System.out.println(out);
	int[] suitef = new int[4];
	int[] rank = new int[13];
	
	
	
    
  }
  
}

