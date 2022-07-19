package tech_strategio_helloworldsim3;

class Technologist {
	String firstName;
	String lastName;

	//constructor
	Technologist(){
		firstName = "";
	}
	void setFirstName (String n){
		String name = n;
	}
	void getFirstName (String n){
		return;
	}
	public String getFirstName() {
		// TODO Auto-generated method stub
		return null;
	}
}
class Test{
	public static void main (String[] args){
	//creating object devOps of Technologist class
	Technologist devOps = new Technologist();
	//print firstName of devOps
	System.out.println("DevOps Technologist First Name: " + devOps.getFirstName());
	}
}
