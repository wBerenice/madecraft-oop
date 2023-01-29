package examples;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class DiseaseSorter {

	public static void main(String[] args) {
		Disease polio = new Disease("polio", false);
		Disease flu = new Disease("influenza", true);
		Disease malaria = new Disease("malaria", true);
		Disease cancer = new Disease("cancer", false);

		List<Disease> diseases = new ArrayList<Disease>();
		diseases.add(polio);
		diseases.add(flu);
		diseases.add(malaria);
		diseases.add(cancer);

		System.out.println("Curable diseases");
		cancer.setCurable(true);//setter method

		for (Disease disease:diseases) {
			//print out diseases that are CURABLE
			if (disease.isCurable()) {
				System.out.println(disease.getName());
			}//if
		}//FOR
		/*
		 * Options for setting the value of "curable":
		 * 	1. change the value in the constructor - you can only call a constructor once
		 * 	2. access the member variable directly - breaks encapsulation
		 * 	3. create a setter
		 */


	}//main

}//class DiseaseSorter
