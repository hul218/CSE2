//Huanlun Li
import java.util.Scanner;
public class Bicycle {
    public static void main(String[] args) {
        Scanner MS;
        MS = new Scanner( System.in );
        System.out.print("Enter the number of counts: ");
        double nCots=MS.nextDouble();
        System.out.print("Enter the number of seconds: ");
        double nSecs=MS.nextDouble();//enter datas finished
        double wheelDiameter=27,PI=3.14159,feetPerMile=5280, inchesPerFoot=12, secondsPerHour=3600,secPerMin=60;//set data
        double distanceTraveled1=wheelDiameter/inchesPerFoot/feetPerMile*nCots*PI;
        double Time=nSecs/secPerMin;
        double distanceTraveled2=distanceTraveled1*100;
        int distanceTraveledf=(int) distanceTraveled2;
        double distanceTraveled=(double) distanceTraveledf;
        double mph1=distanceTraveled1/(nSecs/secondsPerHour)*100;//calculation finish
        int mphf=(int) mph1;
        double mph=(double) mphf;
        System.out.println("The distance was "+(distanceTraveled/100)+" miles and took "+Time+" minutes.");
        System.out.println("The average mph was "+(mph/100));
        
        
        
    }
}
