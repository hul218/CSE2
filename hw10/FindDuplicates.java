//Huanlun Li [CSE2-110] Nov 18
import java.util.Scanner;
public class FindDuplicates{
  public static void main(String [] arg){
    Scanner scan=new Scanner(System.in);
    int num[]=new int[10];
    String answer="";
    do{
      System.out.print("Enter 10 ints- ");
      for(int j=0;j<10;j++){
        num[j]=scan.nextInt();
      }
      String out="The array ";
      out+=listArray(num); //return a string of the form "{2, 3, -9}"   
      if(hasDups(num)){
        out+="has ";
      }
      else{
        out+="does not have ";
      }
      out+="duplicates.";
      System.out.println(out);
      out="The array ";
      out+=listArray(num);    
      if(exactlyOneDup(num)){
        out+="has ";
      }
      else{
        out+="does not have ";
      }
      out+="exactly one duplicate.";
      System.out.println(out);
System.out.print("Go again? Enter 'y' or 'Y', anything else to quit- ");
      answer=scan.next();
    }while(answer.equals("Y") || answer.equals("y"));
  }

  public static String listArray(int [] num){
    String out="{";
    for(int j=0;j<num.length;j++){
      if(j>0){
        out+=", ";
      }
      out+=num[j];
    }
    out+="} ";
    return out;
  }
  
  public static boolean hasDups( int [] dups){
      for (int i=0;i<dups.length;i++){
          for (int h=0;h<10||h!=i;h++){//e.g array[1]=array[1] this can't be duplicate so when h=i, it will out of loop
              if (dups[h]==dups[i]){
                  return true;
              }
          }
          for (int g=i+1;g<10;g++){//continue the checking process by skipping the situation of (x=h array[h]=array[x])
              if (dups[g]==dups[i]){
                  return true;
              }
          }
      }
      return false;
  }
  
  public static boolean exactlyOneDup( int [] Odup){//check the duplicate by counting the number of equal
      int n=0;
      for (int i=0;i<Odup.length;i++){
          for (int h=0;h<Odup.length;h++){
              if (Odup[h]==Odup[i]){
                  n++;
              }
          }
      }
      if (n==12){ //if there's only one duplicate, n will be plus 12 times (10 times for counting the same array, 2 times for counting the different arrays with same value)   
          return true;
      }
      else {return false;}
  }
}


