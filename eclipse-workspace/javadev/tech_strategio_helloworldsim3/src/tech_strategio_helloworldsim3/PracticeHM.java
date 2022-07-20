package tech_strategio_helloworldsim3;
import java.util.HashMap;

public class PracticeHM {

	public static void main(String[] args) {
		HashMap<String, String> capitalCities = new HashMap<String, String>();
		
		capitalCities.put("England", "London");
	    capitalCities.put("Germany", "Berlin");
	    capitalCities.put("Norway", "Oslo");
	    capitalCities.put("USA", "Washington DC");
	   
	    for (String i : capitalCities.values()) {
	    	  System.out.println(i);
	    	}
	    capitalCities.get("England");
	    capitalCities.remove("England");
	    
	    System.out.println(capitalCities);
	    
	    capitalCities.clear();
	    System.out.println(capitalCities);
	    
	    
	}

}
