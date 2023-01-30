package examples;

public class Marathon2 {

    public static void main(String[] args) {
        Athlete2 michaelJordan = new Athlete2("Michael", 30);
        Athlete2 betsyDoe = new Athlete2("Betsy", 12);

        michaelJordan.setMarathonLocation("Berlin");
        betsyDoe.setMarathonLocation("London");

        System.out.println(michaelJordan);
        System.out.println(betsyDoe);
        System.out.println(Athlete2.getRunnersInRace());
    }

}//class Marathon 2
