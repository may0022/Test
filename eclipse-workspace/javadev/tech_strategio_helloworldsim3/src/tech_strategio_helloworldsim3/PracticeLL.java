package tech_strategio_helloworldsim3;
import java.util.LinkedList;
import java.util.Collections;
public class PracticeLL {
	public static void main(String[] args) {
		LinkedList<String> cars = new LinkedList<String>();
		cars.add("Volvo");
		cars.add("BMW");
		cars.add("Ford");
		cars.add("Mazda");
		
		Collections.sort(cars);
		for(String i : cars) {
			System.out.println(i);
		}
		
		System.out.println(cars.get(0));
		
		cars.set(0, "Opel");
		System.out.println(cars);
		
		System.out.println(cars.remove(0));
		System.out.println(cars); 
		//7/20/2022
	}
}
