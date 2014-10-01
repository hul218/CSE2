//Huanlun Li section 110
import java.util.Scanner;
public class RandomGames {
    public static void main(String[] args) {
        Scanner MS;
        MS=new Scanner( System.in );
        System.out.print("Enter R or r for Roulette, C or c for craps, P or p for pick a card: ");
        String cc=MS.nextString();
        int i=cc.length();
        switch (i) {
            case 1:
                switch (cc) {
                    case R||r:
                        int RN=(int) (Math.random()*38);
                        switch (RN) {
                            case 37:
                                System.out.println("Roulette: 00");
                            break;
                            default:
                                System.out.println("Roulette: "+RN);
                        }
                    break;
                    case C||c:
                        int R1=(int) ((Math.random()*6)+1);
                        int R2=(int) ((Math.random()*6)+1);
                        System.out.println("Craps: "+R1+"+"+R2+"="+(R1+R2));
                        break;
                    case P||p:
                        int No=(int) ((Math.random()*15)+1);
                        int suit=(int) ((Math.random()*4)+1);
                        switch (No) {
                            case 11:
                                String Jack= "11"；
                                break;
                            case 12:
                                String Queen= "12";
                                break;
                            case 13:
                                String King="13";
                                break;
                            case 14||15:
                                String Joker="14"&&"15";
                                
                        }
                
                }
            break;
            default: 
                System.out.println("'"+cc+"' is not one of 'R', 'r', 'C', 'c', 'P', or 'p'");
            break;
        }
        else {
            System.out.println("a single character expected");
        }
    }
    
}