package exercises;

public class SmurfFactory {

    //The code should only allow one Papa Smurf and one Smurfette
    public static void main(String[] args) {
        Smurf.createSmurf("Berenice");
        Smurf.createSmurf("Papa");
        Smurf.createSmurf("Papa");
        Smurf.createSmurf("Handy");

    }


}
