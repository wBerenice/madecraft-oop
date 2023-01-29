package exercises;

public class Harry {

	private boolean cloakOn;

	Harry() {
		System.out.println("making Harry Potter...");
	}//constructor (no parameters)

	void castSpell(String spell) {
		System.out.println("casting spell: " + spell);
	}//method castSpell

	void makeInvisible(boolean invisible) {
		this.cloakOn = invisible;

		if (cloakOn)
			System.out.println("Harry is invisible");
		else
			System.out.println("Harry is visible");
	}//method makeInvisible

	void spyOnSnape() {
		System.out.println("Harry sees Professor Snape doing nefarious things.");
	}//method spyOnSnape

	public static void main(String[] args) {
		// 1. make harry potter
		Harry harryPotter = new Harry(); //output: "making Harry Potter..."

		// 2. become invisible
		harryPotter.makeInvisible(true); //output: "Harry is invisible"
		// 3. spy on professor snape
		harryPotter.spyOnSnape(); //output: "Harry sees Professor Snape doing nefarious things."
		// 4. become visible again
		harryPotter.makeInvisible(false); //output: "Harry is visible"

		// 5. cast a “stupefy” spell
		harryPotter.castSpell("stupefy"); //output: "casting spell: stupefy"
	}

}
