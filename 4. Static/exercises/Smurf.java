package exercises;

public class Smurf {

	private String name;
	public static Smurf createSmurf(String name) {
		System.out.println("Creating " + name + " Smurf");
		return new Smurf(name);
	}//static method createSmurf


//	 public static Smurf createSmurf(String name) {
//		System.out.println("Creating " + name + " Smurf");
//		return new Smurf(name);
//	}//static method createSmurf
//

	private Smurf(String name) {
		this.name = name;
	}//constructor

	public void printName() {
		System.out.println("My name is " + name + " Smurf.");
	}//non-static method printName();

	public void eat() {
		System.out.println(name + " Smurf is eating Smurfberries.");
	}//non-static method eat();

}//class Smurf
