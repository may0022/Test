package tech_strategio_helloworldsim3;
import java.util.HashSet;

public class PracticeHS {
	public static void main(String[] args) {
		HashSet<String> cars = new HashSet<String>();
		cars.add("Volvo");
		cars.add("BMW");
		cars.add("Ford");
		cars.add("Mazda");
	
		for(String i : cars) {
			System.out.println(i);
		}
		cars.contains("Mazda");
		
		cars.remove("Volvo");
		
		System.out.println(cars);
		cars.clear();
		
		System.out.println(cars); 
		//7/20/2022
	}
}
