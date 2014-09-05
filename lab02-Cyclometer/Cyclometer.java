//Roger Blumin
//September 5, 2014
//CSE2
/*This program calculates and outputs the time for two bicycle trips, the number of wheel rotations for each trip, 
the distance in miles for each trip, and the total distance of the two trips
*/
public class Cyclometer{
    public static void main(String [] args){
            //main method
        int secsTrip1=480; //seconds for trip 1
        int secsTrip2=3220; //seconds for trip 2
        int countsTrip1=1561; //rotations for trip 1
        int countsTrip2=9037; //rotations for trip 2
        double wheelDiameter=27.0, //diameter of wheel
        PI=3.14159, //value of pi
        feetPerMile=5280, //number of feet per mile
        inchesPerFoot=12, //number of inches perfoot
        secondsPerMinute=60; //number of seconds per minute
        double distanceTrip1, distanceTrip2,totalDistance; //variables for distance for each trip and total trip distance
        
        System.out.println("Trip 1 took "+ (secsTrip1/secondsPerMinute)+" minutes and had "+ countsTrip1+" counts.");
        System.out.println("Trip 2 took "+ (secsTrip2/secondsPerMinute)+" minutes and had "+ countsTrip2+" counts.");
        //output for both trips in minutes and and number of rotations
        
        distanceTrip1=countsTrip1*wheelDiameter*PI;
        // Calculates distance in inches for trip
        //(for each count, a rotation of the wheel travels
        //the diameter in inches times PI)
        distanceTrip1/=inchesPerFoot*feetPerMile; // Converts to distance in miles
        distanceTrip2=countsTrip2*wheelDiameter*PI/inchesPerFoot/feetPerMile; //calculates distance in miles for trip 2
        totalDistance=distanceTrip1+distanceTrip2; //calculates total distance
        System.out.println("Trip 1 was "+distanceTrip1+" miles"); //output for trip 1 in miles
        System.out.println("Trip 2 was "+distanceTrip2+" miles"); //output for trip 2 in miles
        System.out.println("The total distance was "+totalDistance+" miles"); //outputs total distance
    } //end of main method
} //end of class