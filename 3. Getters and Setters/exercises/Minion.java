package exercises;

public class Minion {

    private String name;
    private int eyes;
    private String color;
    private String master;

    Minion(String minionName, int numberEyes, String mainColor, String myMaster){
        this.name = minionName;
        this.eyes = numberEyes;
        this.color = mainColor;
        this.master = myMaster;
    }

    //GETTERS
    String getMinionName(){
        return this.name;
    }
    String getMinionColor(){
        return this.color;
    }
    String getMinionMaster(){
        return this.master;
    }
    int getMinionEyes(){
        return this.eyes;
    }

    //SETTERS
    public void setName(String newName){
        this.name = newName;
    }
    public void setEyes(int newEyes){
        this.eyes = newEyes;
    }
    public void setColor(String newColor){
        this.color = newColor;
    }
    public void setMaster(String newMaster){
        this.master = newMaster;
    }




    @Override
    public String toString() {
        return "I'm a minion, my name is " + this.name + " I have " + this.eyes
                + " eyes." + " My body color is " + this.color
                + " and this is my master: " + this.master;
    }

    public static void main(String[] args) {
        Minion robertoSanchez = new Minion("Roberto", 4, "Yellow", "");
        System.out.println(robertoSanchez);

        robertoSanchez.setMaster("NEW GRU");
        System.out.println(robertoSanchez);
    }

}//class Minion
