//Cyclometer program by Huanlun Li
//define the class
public class Cyclometer {
    //add main method
    public static void main (String [] args) {
        //input data
        int secsTrip1=480; // set the value of secsTrip1
        int secsTrip2=3220; 
        int countsTrip1=1561; //set the value of countsTrip1
        int countsTrip2=9037;
        double wheelDiameter=27.0, PI=3.14159, feetPerMile=5280, inchesPerFoot=12, secondsPerMinute=60; //set constant and unit transform .
        double distanceTrip1;
        double distanceTrip2; 
        double totalDistance;
        System.out.println("Trip 1 took "+
            (secsTrip1/secondsPerMinute)+" minutes and had "+
             countsTrip1+" counts.");
        System.out.println("Trip 2 took "+
            (secsTrip2/secondsPerMinute)+" minutes and had "+
             countsTrip2+" counts.");
        //run the calculations; store the values. Document your
        //calculation here. What are you calculating?
        //distance trips traveled
        distanceTrip1=countsTrip1*wheelDiameter*PI;
        // Above gives distance in inches
        //(for each count, a rotation of the wheel travels
        //the diameter in inches times PI)
        distanceTrip1/=inchesPerFoot*feetPerMile; // converts distance in miles
        distanceTrip2=countsTrip2*wheelDiameter*PI/inchesPerFoot/feetPerMile;
        totalDistance=distanceTrip1+distanceTrip2;
        //Print out the output data.
        System.out.println("Trip 1 was "+distanceTrip1+" miles");
        System.out.println("Trip 2 was "+distanceTrip2+" miles");
        System.out.println("The total distance was "+totalDistance+" miles");


    } //end of main method
} //end of class