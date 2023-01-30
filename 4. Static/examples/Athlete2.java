package examples;

public class Athlete2 {

    private String name;
    private int speed;
    private static String marathonLocation;
    private int bibNumber;
    private static int runnersInRace;

    public Athlete2(String name, int speed){
        this.name = name;
        this.speed = speed;
        runnersInRace++;
        this.bibNumber = runnersInRace;
    }//constructor

    public void setMarathonLocation(String marathonLocation){
        this.marathonLocation = marathonLocation;
    }//setMarathonLocation

    @Override
    public String toString() {
        return "Athlete " + this.name + " is running at " +
                this.speed + " miles per hour. Marathon location> " + this.marathonLocation +
                " " + this.bibNumber;
    }

    public static int getRunnersInRace(){
        return runnersInRace;
    }//get RunnersInRace

}//Athlete2
