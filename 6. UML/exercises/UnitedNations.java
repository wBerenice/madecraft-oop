package exercises;

import java.util.List;

public class UnitedNations {

    public static void main(String[] args) {

//        Country mexico = new Country("Mexico");

//        mexico.dance();

//        new Country().dance();
//        new Ireland().dance();
//        new Brazil().dance();
//        Country country = new Country();
        Ireland eire = new Ireland();
        Brazil brazil = new Brazil();

        List<Country> countries = List.of(eire, brazil);
        for (Country country2: countries) {
            country2.dance();
        }

    }//main

}//UnitedNations
