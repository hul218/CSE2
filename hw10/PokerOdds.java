
import java.util.Random;
import java.util.Scanner;
public class PokerOdds{
  public static void main(String [] arg){
    showHands();
    simulateOdds();
  }
  
  public static void showHands(){
      final int pai=52;
      int[] card=new int[pai];
      String ans="";
      for (int i=0;i<52;i++){
        card[i]=i;
      }
      do{wtf();
      Scanner scan1=new Scanner(System.in);
      System.out.print("Go again? Enter 'y' or 'Y', anything else to quit- ");
      ans=scan1.next();
      }while(ans.equals ("y")||ans.equals ("Y"));

  }
  
  public static void wtf(){
    int[] pick=new int[5];
    for (int j=0;j<5;j++){
        pick[j]=(int) (Math.random()*52);
    }
      String c=" ", d=" ",hr=" ",s=" ";
      for (int h=0;h<5;h++){
        if (pick[h]>=0&&pick[h]<=12){
          if (pick[h]>=2&&pick[h]<=10){
            c+=pick[h];
          }
          else if (pick[h]==1){
            c+="Ace";
          }
          else if (pick[h]==11){
            c+="J";
          }
          else if (pick[h]==12){
            c+="Q";
          }
          else if (pick[h]==0){
            c+="K";
          }
        }
        else if (pick[h]>=13&&pick[h]<=25){
          if (pick[h]>=13&&pick[h]<=21){
            d+=(pick[h]-11);
          }
          else if (pick[h]==22){
            d+="Ace";
          }
          else if (pick[h]==23){
            d+="J";
          }
          else if (pick[h]==24){
            d+="Q";
          }
          else if (pick[h]==25){
            d+="K";
          }
        }
        else if (pick[h]>=26&&pick[h]<=38){
          if (pick[h]>=26&&pick[h]<=34){
            hr+=(pick[h]-24);
          }
          else if (pick[h]==35){
            hr+="Ace";
          }
          else if (pick[h]==36){
            hr+="J";
          }
          else if (pick[h]==37){
            hr+="Q";
          }
          else if (pick[h]==38){
            hr+="K";
          }
        }
        else {if (pick[h]>=39&&pick[h]<=47){
            s+=(pick[h]-37);
          }
          else if (pick[h]==48){
            s+="Ace";
          }
          else if (pick[h]==49){
            s+="J";
          }
          else if (pick[h]==50){
            s+="Q";
          }
          else if (pick[h]==51){
            s+="K";
          }
        }
      }
      System.out.println("Clubs: "+c);
      System.out.println("Diamonds: "+d);
      System.out.println("Hearts: "+hr);
      System.out.println("Spades: "+s);
  }
  
    public static void simulateOdds(){
    
  }
}
 