package exercises;

public class Cat {
	//Attributes
	private String name;
	private int lives = 9;

	Cat(String name) {
		this.name = name;
	}//mini-constructor

	void meow() {
		System.out.println("meeeeeooooooooooowwwwwwwww!!");
	}//method meow

	public void printName() {
		if (this.name == null)
			System.out.println("i don't know my own name!");
		else
			System.out.println("my name is " + this.name);
	}//method printName

	void kill() {
		this.lives--;
		if (this.lives > 0)
			System.out.println("nice try, but I still have " + this.lives + " lives left");
		else if (this.lives < 0)
			System.out.println("that's overkill yo!");
		else
			System.out.println("DEAD CAT :(");
	}

	public static void main(String[] args) {
		/* Do the following things without changing the Cat class */
		Cat mrFluffy = new Cat("Mr. Fluffly");

		// 1. Make the Cat meow

		mrFluffy.meow();//public method meow() executed
		// 2. Get the Cat to print it's name
		mrFluffy.printName();//public method printName() executed

		// 3. Kill the Cat!
		mrFluffy.kill();
		mrFluffy.kill();
		mrFluffy.kill();
		mrFluffy.kill();
		mrFluffy.kill();
		mrFluffy.kill();
		mrFluffy.kill();
		mrFluffy.kill();
		mrFluffy.kill();// output: DEAD CAT

	}
}



