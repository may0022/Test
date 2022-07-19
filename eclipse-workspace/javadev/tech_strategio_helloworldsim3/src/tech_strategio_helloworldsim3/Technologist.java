package tech_strategio_helloworldsim3;

public class Technologist {
	String firstName;
	String lastName;

	private String firstName;
	protected String company = "Strategio";
	public void study() {
		System.out.println("I am Studying!");
		System.out.println("Technologiest study generic things");
	}

	public String getFirstName() {
		return firstName;
	}
	public String setFirstName (String n){
		This.firstName = newFirstName;

	}
	
}

public class SRE extends Technologist{
	public void study() {
		System.out.println("SRE study choas engineering");
	}
}

public class DevOps extends Technologist{
	public void study() {
		System.out.println("Devops study Terraform");
	}
}
//well
class Test{
	public static void main (String[] args){
	//creating object devOps of Technologist class
	Technologist devOps = new Technologist();
	//print firstName of devOps
	System.out.println("DevOps Technologist First Name: " + devOps.getFirstName());
	}
}
