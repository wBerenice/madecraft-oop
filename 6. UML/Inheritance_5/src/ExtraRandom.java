import java.util.Random;

public class ExtraRandom extends Random {

    public String nextLetter(){

        int lettersStartA = 97;
        int randomInt = new Random().nextInt(26) + lettersStartA;
        return  "" + (char)randomInt;
    }//nextLetter method
}//class ExtraRandom
